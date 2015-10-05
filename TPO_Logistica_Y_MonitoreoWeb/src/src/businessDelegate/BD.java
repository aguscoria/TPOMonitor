package businessDelegate;

import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;

import sessionFacade.FachadaLogYMon;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.InformeAuditoria;
import dominio.OrdenDespacho;
import dominio.Portal;
import dominio.Producto;
import dominio.Venta;

public class BD {

	private static BD instancia;
	private FachadaLogYMon adminFachada;
	private BD() {
		lookupService();
	}

	public static BD getInstancia() {
		if (instancia == null)
			instancia = new BD();
		return instancia;
	}
	
	/* LOOKUP DE FACHADA */
	
	private void lookupService() {
		try {
//			final String appName = "TPO_Logistica_Y_MonitoreoEAR";
//			final String moduleName = "TPO_Logistica_Y_MonitoreoEJB";
//			final String sessionBeanName = "FachadaLogYMonBean";
//			final String viewClassName = FachadaLogYMon.class.getName();
//			Properties jndiProps = new Properties();
//			jndiProps.put(Context.INITIAL_CONTEXT_FACTORY,
//					"org.jboss.naming.remote.client.InitialContextFactory");
//			jndiProps.put(Context.PROVIDER_URL, "remote://127.0.0.1:4447/");
			// AdminUser: test
			// AdminPass: test1234.

			// username
			// usuario de servidor: managementuser
			// password: cristian10!
//			jndiProps.put(Context.SECURITY_PRINCIPAL, "appuser");
			// password
//			jndiProps.put(Context.SECURITY_CREDENTIALS, "cristian10!");
			// This is an important property to set if you want to do EJB
			// invocations via the remote-naming project
//			jndiProps.put("jboss.naming.client.ejb.context", true);
			// create a context passing these properties

			Context context = new InitialContext();
			
//			 adminFachada = (FachadaLogYMon) context
//					.lookup(appName + "/" + moduleName + "/" + sessionBeanName
//							+ "!" + viewClassName);
			 adminFachada = (FachadaLogYMon)context.lookup("java:global/TPO_Logistica_Y_MonitoreoEAR/TPO_Logistica_Y_MonitoreoEJB/FachadaLogYMonBean!sessionFacade.FachadaLogYMon");

		} catch (Exception e) {
			System.out.println("error al levantar servicio");
			e.printStackTrace();
		}
	}

	/* METODOS DE LA FACHADA */
	
	public ArrayList<DespachoVentaPreventivo> obtenerVentasSinOrdenesDeDespacho() {
		return adminFachada.obtenerVentasSinOrdenesDeDespacho();
	}

	public void asociarOrdenesDeDespachoAVentas(ArrayList<Long> idsVentas, ArrayList<Long> idsDespachos) {
		adminFachada.asociarOrdenesDeDespachoAVentas(idsVentas, idsDespachos);
	}

	public ArrayList<Venta> obtenerVentas() {
		return adminFachada.obtenerVentas();
	}

	public ArrayList<Venta> obtenerVentasDePortal(long idPortal){
		return adminFachada.obtenerVentasDePortal(idPortal);
	}

	public OrdenDespacho obtenerOrdenDespachoDeVenta(long idVenta){
		return adminFachada.obtenerOrdenDespachoDeVenta(idVenta);
	}

	public ArrayList<Despacho> obtenerDespachosActivos(){
		return adminFachada.obtenerDespachosActivos();
	}
	
	public ArrayList<Producto> obtenerProductosBestSeller(){
		return adminFachada.obtenerProductosBestSeller();
	}
	
	public void cambiarEstadoOrdenDeDespacho(long idOrdenDeDespacho){
		adminFachada.cambiarEstadoOrdenDespacho(idOrdenDeDespacho);
	}
	
	public ArrayList<InformeAuditoria> obtenerInformesAuditoriaNearOnLine(){
		return adminFachada.cargarInformesAuditoriaNearOnLine();
	}
	
	public ArrayList<Portal> obtenerPortales(){
		return adminFachada.obtenerPortales();
	}

	public Venta obtenerVenta(long idVenta){
		return adminFachada.obtenerVenta(idVenta);
	}

	public Venta obtenerVentaPorCodigo(long codVenta){
		return adminFachada.obtenerVentaPorCodigo(codVenta);
	}
	
}
