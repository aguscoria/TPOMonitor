package sessionFacade;

import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import sessionBeans.SBAdministradorBestSellers;
import sessionBeans.SBAdministradorInformesAuditoria;
import sessionBeans.SBAdministradorOrdenDespacho;
import sessionBeans.SBAdministradorPortal;
import sessionBeans.SBAdministradorProductos;
import sessionBeans.SBAdministradorVenta;
import tpo.ia.vos.VOVenta;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.InformeAuditoria;
import dominio.OrdenDespacho;
import dominio.Portal;
import dominio.Producto;
import dominio.Venta;

@Stateless
public class FachadaLogYMonBean implements FachadaLogYMon {
		
	@EJB 
	SBAdministradorVenta administradorVenta;
	@EJB
	SBAdministradorOrdenDespacho administradorOrdenDespacho;
	@EJB 
	SBAdministradorBestSellers administradorBestSellers;
	@EJB
	SBAdministradorInformesAuditoria administradorInformesAuditoria;
	@EJB
	SBAdministradorProductos administradorProductos;
	@EJB
	SBAdministradorPortal administradorPortal;
	
	public FachadaLogYMonBean() {

	}

	@Override
	public boolean procesarVenta(VOVenta venta) {
		return administradorVenta.procesarVenta(venta);
	}

	@Override
	public ArrayList<DespachoVentaPreventivo> obtenerVentasSinOrdenesDeDespacho() {
		return administradorVenta.obtenerVentasSinOrdenesDeDespacho();
	}

	@Override
	public void asociarOrdenesDeDespachoAVentas(ArrayList<Long> idsVentas,ArrayList<Long> idsDespachos){
		administradorVenta.asociarOrdenesDeDespachoAVentas(idsVentas, idsDespachos);
	}

	@Override
	public boolean cambiarEstadoOrdenDespacho(Long idOrdenDespacho) {
		
		return administradorOrdenDespacho.cambiarEstadoOrdenDespacho(idOrdenDespacho);
	}
	
	@Override
	public ArrayList<Producto> obtenerProductosBestSeller(){
		return administradorBestSellers.obtenerProductosBestSeller();
	}

	@Override
	public ArrayList<Venta> obtenerVentas() {
		return administradorVenta.obtenerVentas();
	}

	@Override
	public ArrayList<Venta> obtenerVentasDePortal(long idPortal) {
		return administradorVenta.obtenerVentasDePortal(idPortal);
	}

	@Override
	public OrdenDespacho obtenerOrdenDespachoDeVenta(long idVenta) {
		return administradorOrdenDespacho.obtenerOrdenDespachoDeVenta(idVenta);
	}

	@Override
	public ArrayList<Despacho> obtenerDespachosActivos() {
		return administradorVenta.obtenerDespachosActivos();
	}

	@Override
	public void generarInformeAuditoria(InformeAuditoria informeAuditoria) {
		administradorInformesAuditoria.generarInformeAuditoria(informeAuditoria);
	}

	@Override
	public void generarNuevoProducto(Producto producto) {
		administradorProductos.agregarNuevoProducto(producto);
	}

	@Override
	public ArrayList<InformeAuditoria> cargarInformesAuditoriaNearOnLine() {
		return administradorInformesAuditoria.obtenerInformesAuditoriaNearOnLine();
	}

	@Override
	public ArrayList<Portal> obtenerPortales() {
		return administradorPortal.obtenerPortales();
	}

	@Override
	public Venta obtenerVenta(long idVenta) {
		return administradorVenta.obtenerVenta(idVenta);
	}

	@Override
	public Venta obtenerVentaPorCodigo(long codVenta) {
		return administradorVenta.obtenerVentaPorCodigo(codVenta);
	}
	
}
