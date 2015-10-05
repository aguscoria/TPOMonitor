package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Local;

import tpo.ia.vos.VOVenta;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;
import dominio.Venta;

@Local
public interface SBAdministradorVenta {

	public boolean procesarVenta(VOVenta venta);
	
	public ArrayList<DespachoVentaPreventivo> obtenerVentasSinOrdenesDeDespacho();
	
	public void asociarOrdenesDeDespachoAVentas(ArrayList<Long> idsVentas,ArrayList<Long> idsDespachos);
	
	public ArrayList<Venta> obtenerVentas();
	
	public ArrayList<Venta> obtenerVentasDePortal(long idPortal);
	
	public ArrayList<Despacho> obtenerDespachosActivos();

	public Venta obtenerVenta (long idVenta);
	
	public Venta obtenerVentaPorCodigo(long codVta);
	
}
