package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Local;

import dominio.Articulo;

@Local
public interface SBAdministradorBestSellers {
	
	public ArrayList<Articulo> obtenerProductosBestSeller();
	
}
