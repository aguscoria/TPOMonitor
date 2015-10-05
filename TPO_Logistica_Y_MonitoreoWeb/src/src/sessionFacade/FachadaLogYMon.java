package sessionFacade;

import java.util.ArrayList;

import javax.ejb.Stateless;

import tpo.ia.vos.VOVenta;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.InformeAuditoria;
import dominio.OrdenDespacho;
import dominio.Portal;
import dominio.Producto;
import dominio.Venta;

@Stateless
public interface FachadaLogYMon {
	
	/* METODOS DE REST */
	
	public void generarNuevoProducto(Producto producto);
	
	/* METODOS DE WEB-SERVICE */
	
	public boolean procesarVenta(VOVenta venta);
	
	public boolean cambiarEstadoOrdenDespacho(Long idOrdenDespacho);
	
	public void generarInformeAuditoria(InformeAuditoria informeAuditoria);
	
	/* METODOS DE JSP */
	
	public ArrayList<DespachoVentaPreventivo> obtenerVentasSinOrdenesDeDespacho();
	
	public void asociarOrdenesDeDespachoAVentas(ArrayList<Long> idsVentas,ArrayList<Long> idsDespachos);
		
	public ArrayList<Venta> obtenerVentas();
	
	public ArrayList<Venta> obtenerVentasDePortal(long idPortal);
	
	public OrdenDespacho obtenerOrdenDespachoDeVenta(long idVenta);
	
	public ArrayList<Despacho> obtenerDespachosActivos();
	
	public ArrayList<Producto> obtenerProductosBestSeller();
	
	public ArrayList<InformeAuditoria> cargarInformesAuditoriaNearOnLine();
	
	public ArrayList<Portal> obtenerPortales();
	
	public Venta obtenerVenta(long idVenta);
	
	public Venta obtenerVentaPorCodigo(long codVenta);
	
}
