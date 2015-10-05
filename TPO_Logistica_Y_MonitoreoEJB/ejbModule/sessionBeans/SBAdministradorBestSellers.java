package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Local;

import dominio.Producto;

@Local
public interface SBAdministradorBestSellers {
	
	public ArrayList<Producto> obtenerProductosBestSeller();
	
}
