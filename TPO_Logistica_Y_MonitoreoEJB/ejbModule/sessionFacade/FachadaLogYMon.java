package sessionFacade;

import java.util.ArrayList;

import javax.ejb.Remote;

import tpo.ia.vos.VOVenta;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.InformeAuditoria;
import dominio.OrdenDespacho;
import dominio.Portal;
import dominio.Articulo;
import dominio.Venta;

@Remote
public interface FachadaLogYMon {
	
	/* METODOS DE REST */
	
	public void generarNuevoProducto(Articulo producto);
	
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
	
	public ArrayList<Articulo> obtenerProductosBestSeller();
	
	public ArrayList<InformeAuditoria> cargarInformesAuditoriaNearOnLine();
	
	public ArrayList<Portal> obtenerPortales();
	
	public Venta obtenerVenta(long idVenta);
	
	public Venta obtenerVentaPorCodigo(long codVenta);
	
}
