package tpo.ia.vos;

import java.io.Serializable;
import java.util.List;


public class VOOrdenDeDespacho implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int codigoOrdenDeDespacho;
	private String nombrePortalWeb;
	private String nombreLogisticaYMonitoreo;
	private List<VODetalleOrdenDeDespacho> detallerOrdenDeDespachoVO;
	
	/* GETTERS Y SETTERS */
	
	public int getCodigoOrdenDeDespacho() {
		return codigoOrdenDeDespacho;
	}
	
	public void setCodigoOrdenDeDespacho(int codigoOrdenDeDespacho) {
		this.codigoOrdenDeDespacho = codigoOrdenDeDespacho;
	}
	
	public String getNombreLogisticaYMonitoreo() {
		return nombreLogisticaYMonitoreo;
	}
	
	public void setNombreLogisticaYMonitoreo(String nombreLogisticaYMonitoreo) {
		this.nombreLogisticaYMonitoreo = nombreLogisticaYMonitoreo;
	}
	
	public void setNombrePortalWeb(String nombrePortalWeb) {
		this.nombrePortalWeb = nombrePortalWeb;
	}
	
	public String getNombrePortalWeb() {
		return nombrePortalWeb;
	}
	
	public List<VODetalleOrdenDeDespacho> getDetallerOrdenDeDespachoVO() {
		return detallerOrdenDeDespachoVO;
	}
	
	public void setDetallerOrdenDeDespachoVO(
			List<VODetalleOrdenDeDespacho> detallerOrdenDeDespachoVO) {
		this.detallerOrdenDeDespachoVO = detallerOrdenDeDespachoVO;
	}
	
}
