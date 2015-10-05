package sessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.OrdenDespacho;
import dominio.Venta;

@Stateless
public class SBAdministradorOrdenDespachoBean implements SBAdministradorOrdenDespacho {

	@PersistenceContext(unitName="LogisticaYMonitoreo")
	private EntityManager manager;
	
    public SBAdministradorOrdenDespachoBean() {
        super();
    }

	public boolean cambiarEstadoOrdenDespacho(Long idOrdenDespacho) {
	
		
		
		OrdenDespacho ordenDespacho=(OrdenDespacho)manager.find(OrdenDespacho.class, Long.valueOf(idOrdenDespacho));
		ordenDespacho.setEstaEnviada(true);
		Venta venta = (Venta)ordenDespacho.getVenta();
		
		venta.setEstado(venta.CON_VENTADESPACHADA);
		manager.merge(ordenDespacho);
		manager.merge(venta);
		OrdenDespacho ordenDespachoTest=(OrdenDespacho)manager.find(OrdenDespacho.class, idOrdenDespacho);
		if(ordenDespachoTest.getEstaEnviada())
		return true;
		else
		return false;
		}
	

	@Override
	public OrdenDespacho obtenerOrdenDespachoDeVenta(long idVenta) {
		OrdenDespacho ordenDespacho = new OrdenDespacho();
		Query query = manager.createQuery("select o from OrdenDespacho o where o.venta.id =:idVenta").setParameter("idVenta", idVenta).setMaxResults(1);
		ordenDespacho = (OrdenDespacho)query.getSingleResult();
		System.out.println(ordenDespacho.getVenta().getId());
		System.out.println(ordenDespacho.getDespacho().getId());
		
		
		return ordenDespacho;
	}


	
}
