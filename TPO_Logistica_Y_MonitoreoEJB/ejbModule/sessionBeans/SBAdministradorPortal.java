package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Local;

import dominio.Portal;

@Local
public interface SBAdministradorPortal {

	public ArrayList<Portal> obtenerPortales();
	
}
