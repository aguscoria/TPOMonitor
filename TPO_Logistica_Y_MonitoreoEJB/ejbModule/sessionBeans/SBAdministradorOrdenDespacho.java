package sessionBeans;

import javax.ejb.Local;

import dominio.OrdenDespacho;

@Local
public interface SBAdministradorOrdenDespacho {
	
	public boolean cambiarEstadoOrdenDespacho(Long idOrdenDespacho);

	public OrdenDespacho obtenerOrdenDespachoDeVenta(long idVenta);
	
}
