package sessionBeans;

import javax.ejb.Local;

import dominio.Producto;

@Local
public interface SBAdministradorProductos {

	public void agregarNuevoProducto(Producto producto);
	
}
