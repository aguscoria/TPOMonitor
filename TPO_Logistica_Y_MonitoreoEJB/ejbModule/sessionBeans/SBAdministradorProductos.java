package sessionBeans;

import javax.ejb.Local;

import dominio.Articulo;

@Local
public interface SBAdministradorProductos {

	public void agregarNuevoProducto(Articulo producto);
	
}
