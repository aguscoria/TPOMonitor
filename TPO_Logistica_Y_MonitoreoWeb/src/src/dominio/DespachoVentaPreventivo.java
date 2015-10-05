package dominio;

import java.io.Serializable;




public class DespachoVentaPreventivo implements Serializable{


	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Despacho despacho;
	private Venta venta;
	
	/* GETTERS Y SETTERS */
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	
	public Venta getVenta() {
		return venta;
	}
	
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	
	public Despacho getDespacho() {
		return despacho;
	}
	
	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}
	
}
