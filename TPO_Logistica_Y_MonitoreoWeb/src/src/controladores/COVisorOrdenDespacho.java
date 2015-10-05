package controladores;

import javax.ejb.EJB;

import sessionFacade.FachadaLogYMon;
import dominio.Venta;

public class COVisorOrdenDespacho {

//	private BD controlador = BD.getInstancia();
	@EJB FachadaLogYMon controlador;
	
	private String enviada;
	private String fecha;
	private String despacho;
	private String codVenta;
	
	public COVisorOrdenDespacho(long idVenta) {
		enviada = new String();
		fecha = new String();
		despacho = new String();
		codVenta = new String();
		cargarDatosOrdenDespacho(idVenta);
	}
	
	public void cargarDatosOrdenDespacho(long idVenta){
		Venta venta = controlador.obtenerVenta(idVenta);
		codVenta = String.valueOf(venta.getCodigo());
		despacho = venta.getOrdenDespacho().getDespacho().getNombre();
		enviada = venta.getEstado().equalsIgnoreCase(Venta.CON_VENTADESPACHADA)? "Despachada" : "No despachada";
		fecha = String.valueOf(venta.getOrdenDespacho().getFecha());
	}
	
	/* GETTERS Y SETTERS */
	
	public String getEnviada() {
		return enviada;
	}
	
	public void setEnviada(String enviada) {
		this.enviada = enviada;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getDespacho() {
		return despacho;
	}
	
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	
	public String getCodVenta() {
		return codVenta;
	}
	
	public void setCodVenta(String codVenta) {
		this.codVenta = codVenta;
	}
	
}
