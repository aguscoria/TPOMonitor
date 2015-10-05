package dominio;

import java.io.Serializable;




public class Producto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private long codigo;
	private String descripcion;
	private float precio;
	private long cantidadVentas;
	
	/*GETTERS Y SETTERS*/
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCantidadVentas() {
		return cantidadVentas;
	}
	
	public void setCantidadVentas(long cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
