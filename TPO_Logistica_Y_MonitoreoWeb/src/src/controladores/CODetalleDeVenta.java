package controladores;

import java.util.ArrayList;

import businessDelegate.BD;
import dominio.ItemVenta;
import dominio.Venta;

public class CODetalleDeVenta {

	private BD controlador = BD.getInstancia();
	
	private ArrayList<DetalleVenta> articulos;
	private String montoTotal;

	
	public CODetalleDeVenta(long idVenta) {
		articulos = new ArrayList<CODetalleDeVenta.DetalleVenta>();
		montoTotal = "0";
		cargarDetalle(idVenta);
	}
	
	public void cargarDetalle(long idVenta){
		Venta venta = controlador.obtenerVenta(idVenta);
		for(ItemVenta itemVenta : venta.getItemsVenta()){
			DetalleVenta detalleVenta = new DetalleVenta();
			detalleVenta.setCantidad(Integer.valueOf(String.valueOf(itemVenta.getCantidad())));
			detalleVenta.setDescripcion(itemVenta.getProducto().getDescripcion());
			detalleVenta.setPrecio(itemVenta.getProducto().getPrecio());
			articulos.add(detalleVenta);
		}
		
		float monto = 0;
		for (ItemVenta itemVenta : venta.getItemsVenta()) {

			monto += itemVenta.getProducto().getPrecio()
					* itemVenta.getCantidad();
		}
		
		montoTotal = String.valueOf(monto);
	}
	
	/* CLASES NECESARIAS */
	
	public class DetalleVenta{
		
		private String descripcion;
		private int cantidad;
		private float precio;
		
		/* GETTERS Y SETTERS */
		
		public int getCantidad() {
			return cantidad;
		}
		
		public void setCantidad(int cantidad) {
			this.cantidad = cantidad;
		}
		
		public String getDescripcion() {
			return descripcion;
		}
		
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		
		public float getPrecio() {
			return precio;
		}
		
		public void setPrecio(float precio) {
			this.precio = precio;
		}
	}
	
	/* GETTERS Y SETTERS */

	public void setArticulos(ArrayList<DetalleVenta> articulos) {
		this.articulos = articulos;
	}
	
	public ArrayList<DetalleVenta> getArticulos() {
		return articulos;
	}
	
	public String getMontoTotal() {
		return montoTotal;
	}
	
	public void setMontoTotal(String montoTotal) {
		this.montoTotal = montoTotal;
	}
}
