package tpo.ia.vos;

import java.io.Serializable;

public class VOItemVenta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VOArticulo articulo;
	private Integer cantidad;
	private float precio;
	private Integer codigo;
	
	public VOItemVenta() {
	}

	/* GETTERS Y SETTERS */
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public float getPrecio() {
		return precio;
	}
	
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public VOArticulo getArticulo() {
		return articulo;
	}
	
	public void setArticulo(VOArticulo articulo) {
		this.articulo = articulo;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

}
