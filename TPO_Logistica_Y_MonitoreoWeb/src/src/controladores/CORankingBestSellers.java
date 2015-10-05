package controladores;

import java.util.ArrayList;

import businessDelegate.BD;
import dominio.Producto;

public class CORankingBestSellers {
	
	BD  controlador = BD.getInstancia();
	
	private String[] 		productos;
	private String[] 		cantidadVentas;
	
	public CORankingBestSellers(){
		super();
		ArrayList<Producto> productosBestSeller = new ArrayList<Producto>();
		productosBestSeller = controlador.obtenerProductosBestSeller();
		productos = new String[10];
		cantidadVentas = new String[10];
		int i = 0;
		for(Producto producto : productosBestSeller){
			productos[i] = producto.getDescripcion();
			cantidadVentas[i] = String.valueOf(producto.getCantidadVentas());
			i++;
		}
	}
	
	/* GETTERS Y SETTERS */

	public String[] getCantidadVentas() {
		return cantidadVentas;
	}
	
	public void setCantidadVentas(String[] cantidadVentas) {
		this.cantidadVentas = cantidadVentas;
	}
	
	public String[] getProductos() {
		return productos;
	}
	
	public void setProductos(String[] productos) {
		this.productos = productos;
	}
	
}
