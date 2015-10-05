package dominio;

import java.io.Serializable;



public class ItemVenta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private long cantidad;
	private Producto producto;
	
	/*GETTERS Y SETTERS*/
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public Producto getProducto() {
		return producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
}
