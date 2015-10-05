package sessionBeans;

import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import tpo.despacho.ws.AdministradorOrdenDeDespachoBean;
import tpo.despacho.ws.AdministradorOrdenDeDespachoBeanService;
import tpo.despacho.ws.VoDetalleOrdenDeDespacho;
import tpo.despacho.ws.VoOrdenDeDespacho;
import tpo.ia.vos.VOItemVenta;
import tpo.ia.vos.VOVenta;
import dominio.Cliente;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.ItemVenta;
import dominio.OrdenDespacho;
import dominio.Portal;
import dominio.Producto;
import dominio.Venta;

@Stateless
public class SBAdministradorVentaBean implements SBAdministradorVenta {

	@PersistenceContext(unitName = "LogisticaYMonitoreo")
	private EntityManager manager;

	public SBAdministradorVentaBean() {
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean procesarVenta(VOVenta voVenta) {
		Venta venta = new Venta();
		Cliente cliente = (Cliente) manager
				.createQuery("select c from Cliente c where c.dni= :paramDni")
				.setMaxResults(1)
				.setParameter("paramDni", Long.parseLong(voVenta.getDni()))
				.getSingleResult();
		if (cliente != null)
			venta.setCliente(cliente);
		else
			return false;
		venta.setCodigo(voVenta.getCodigoVenta());
		venta.setEstado((Venta.CON_VENTANODESPACHADA));
		venta.setFecha(voVenta.getFechaHoraVenta());
		ArrayList<VOItemVenta> itemsVOVenta = voVenta.getCollectionItems();
		if (itemsVOVenta.size() == 0)
			return false;
		List<ItemVenta> itemsVenta = new ArrayList<ItemVenta>();
		for (VOItemVenta item : itemsVOVenta) {
			Producto producto = (Producto) manager
					.createQuery(
							"select p from Producto p where p.codigo = :codProd")
					.setMaxResults(1)
					.setParameter("codProd",
							Long.valueOf(item.getArticulo().getCodigo()))
					.getSingleResult();
			if (producto == null)
				return false;
			ItemVenta itemVenta = new ItemVenta();
			itemVenta.setProducto(producto);
			itemVenta.setCantidad(item.getCantidad());
			itemsVenta.add(itemVenta);
			manager.persist(itemVenta);
			producto.setCantidadVentas(producto.getCantidadVentas()+itemVenta.getCantidad());
			manager.merge(producto);
		}
		venta.setItemsVenta(itemsVenta);
		venta.setOrdenDespacho(null);
		System.out.println(voVenta.getCodigoPortal());
		Portal portal = (Portal) manager
				.createQuery(
						"select p from Portal p where p.codigo = :codPortal")
				.setParameter("codPortal",
						Long.valueOf(voVenta.getCodigoPortal()))
				.setMaxResults(1).getSingleResult();
		if (portal == null)
			return false;
		venta.setPortal(portal);
		/** Creo un DespachoVentaPreventivo para proponer el despacho despues **/
		ArrayList<Despacho> despachosActivos = new ArrayList<Despacho>();
		Query queryDespachos = manager
				.createQuery("select d from Despacho d where d.estaActivo = true");
		despachosActivos = (ArrayList<Despacho>) queryDespachos.getResultList();
		if (despachosActivos.size() <= 0)
			return false;
		manager.persist(venta);
		float cordenadasX = Float.valueOf(voVenta.getCoordenadasUsuario()
				.split(",")[0]);
		float cordenadasY = Float.valueOf(voVenta.getCoordenadasUsuario()
				.split(",")[1]);
		DespachoVentaPreventivo despachoVentaPreventivo = new DespachoVentaPreventivo();
		despachoVentaPreventivo.setVenta(venta);
		// Busco el despacho más cercano al usuario segun sus cordenadas
		float dif = -1;
		for (Despacho despacho : despachosActivos) {
			float corDespX = Float
					.valueOf(despacho.getCoordenadas().split(",")[0]);
			float corDespY = Float
					.valueOf(despacho.getCoordenadas().split(",")[1]);
			if (dif == -1
					|| cordenadasX + cordenadasY - corDespX - corDespY < dif) {
				despachoVentaPreventivo.setDespacho(despacho);
				dif = cordenadasX + cordenadasY - corDespX - corDespY;
			}
		}
		manager.persist(despachoVentaPreventivo);
		return true;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<DespachoVentaPreventivo> obtenerVentasSinOrdenesDeDespacho() {

		ArrayList<Venta> idsVentas = new ArrayList<Venta>();
		ArrayList<Long> ids = new ArrayList<Long>();
		Query query = manager
				.createQuery("select v from Venta v where v.ordenDespacho IS NULL");
		idsVentas = (ArrayList<Venta>) query.getResultList();
		ArrayList<DespachoVentaPreventivo> despachoVentaPreventivos = new ArrayList<DespachoVentaPreventivo>();

		for (Venta v : idsVentas) 
			ids.add(v.getId());

		for (Long idVenta : ids) {
			DespachoVentaPreventivo despachoVentaPreventivo = (DespachoVentaPreventivo) manager
					.createQuery(
							"select d from DespachoVentaPreventivo d where d.venta.id=:idVenta")
					.setParameter("idVenta", idVenta).setMaxResults(1)
					.getSingleResult();
			despachoVentaPreventivos.add(despachoVentaPreventivo);

		}

		return despachoVentaPreventivos;
	}

	@Override
	public void asociarOrdenesDeDespachoAVentas(ArrayList<Long> idsVentas,
			ArrayList<Long> idsDespachos) {
		int i = 0;
		try {
			for (Long idDespacho : idsDespachos) {
				Despacho despacho = manager.find(Despacho.class, idDespacho);
				Venta venta = manager
						.find(Venta.class, (Long) idsVentas.get(i));

				OrdenDespacho ordenDespacho = new OrdenDespacho();
				ordenDespacho.setDespacho(despacho);
				ordenDespacho.setVenta(venta);
				ordenDespacho.setFecha(new Date());
				ordenDespacho.setEstaEnviada(false);
				manager.persist(ordenDespacho);
				venta.setOrdenDespacho(ordenDespacho);
				manager.merge(venta);
				manager.flush();
				i++;
				// Envio de orden de despacho a Despacho --> segun WSDL de santi esta esto
				VoOrdenDeDespacho voOrdenDeDespacho = new VoOrdenDeDespacho();
				voOrdenDeDespacho.setIdVenta(Integer.valueOf(""+venta.getCodigo()));
				voOrdenDeDespacho.setIdOrdenDeDespacho(Integer.valueOf(String.valueOf(ordenDespacho.getId())));
				voOrdenDeDespacho.setNombreLogisticaYMonitoreo("LOGISTICA2"); //SIEMPRE SOMOS LOGISTICA 2 NOSOTROS
				voOrdenDeDespacho.setNombrePortalWeb(venta.getPortal().getDescripcion());
				for (ItemVenta itemVenta : venta.getItemsVenta()){
					VoDetalleOrdenDeDespacho voDetalleOrdenDeDespacho = new VoDetalleOrdenDeDespacho();
					voDetalleOrdenDeDespacho.setCantidad(Integer.valueOf(String.valueOf(itemVenta.getCantidad())));
					voDetalleOrdenDeDespacho.setCodigoArticulo(Integer.valueOf(String.valueOf(itemVenta.getProducto().getCodigo())));
					voOrdenDeDespacho.getDetallesOrdenDeDespachoVO().add(voDetalleOrdenDeDespacho);
				}
				if(venta.getOrdenDespacho().getDespacho().getNombre().equalsIgnoreCase("DESPACHO1")){
					System.out.println("DESPACHO1");
				    System.out.println("***********************");
				    System.out.println("Create Web Service Client...");
				    AdministradorOrdenDeDespachoBeanService service1 = new AdministradorOrdenDeDespachoBeanService();
				    System.out.println("Create Web Service...");
				    AdministradorOrdenDeDespachoBean port1 = service1.getAdministradorOrdenDeDespachoBeanPort();
				    
				    System.out.println("Call Web Service Operation...");
				    System.out.println("Server said: " + port1.recepcionOrdenDeDespacho(voOrdenDeDespacho));
				    System.out.println("***********************");
				    System.out.println("Call Over!");
				}else{
					URL url = new URL("http://172.16.164.40:8080/TPO_Despacho_Barril_Magaldi/AdministradorOrdenDeDespachoBean?wsdl");
					System.out.println("DESPACHO2");
					System.out.println("***********************");
				    System.out.println("Create Web Service Client...");
				    AdministradorOrdenDeDespachoBeanService service1 = new AdministradorOrdenDeDespachoBeanService(url);
				    System.out.println("Create Web Service...");
				    AdministradorOrdenDeDespachoBean port1 = service1.getAdministradorOrdenDeDespachoBeanPort();
				    System.out.println("Call Web Service Operation...");
				    System.out.println("Server said: " + port1.recepcionOrdenDeDespacho(voOrdenDeDespacho));
				    System.out.println("***********************");
				    System.out.println("Call Over!");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Venta> obtenerVentas() {
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		Query query = manager.createQuery("select v from Venta v");
		ventas = (ArrayList<Venta>) query.getResultList();
		return ventas;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Venta> obtenerVentasDePortal(long idPortal) {
		Portal portal = (Portal) manager
				.createQuery("select p from Portal p where p.id = :idPortal")
				.setParameter("idPortal", idPortal).setMaxResults(1)
				.getSingleResult();
		ArrayList<Venta> ventas = new ArrayList<Venta>();
		if (portal != null) {
			Query query = manager.createQuery("select v from Venta v where v.portal.id=:idPortal")
					.setParameter("idPortal", portal.getId())
					.setMaxResults(10);
			ventas = (ArrayList<Venta>) query.getResultList();
		}
		return ventas;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Despacho> obtenerDespachosActivos() {
		ArrayList<Despacho> despachos = new ArrayList<Despacho>();
		Query query = manager
				.createQuery("select d from Despacho d where d.estaActivo = true order by d.id");
		despachos = (ArrayList<Despacho>) query.getResultList();
		return despachos;
	}

	@Override
	public Venta obtenerVenta(long idVenta) {
		Venta venta = new Venta();
		Query query = manager
				.createQuery("SELECT v FROM Venta v where v.id = :idVenta")
				.setMaxResults(1).setParameter("idVenta", idVenta);
		venta = (Venta) query.getSingleResult();
		return venta;
	}

	@Override
	public Venta obtenerVentaPorCodigo(long codVta) {
		Venta venta = new Venta();
		Query query = manager
				.createQuery("SELECT v FROM Venta v where v.codigo = :codigoVenta")
				.setMaxResults(1).setParameter("codigoVenta", codVta);
		venta = (Venta) query.getSingleResult();
		return venta;
	}
}