package sessionBeans;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dominio.Articulo;

/**
 * Session Bean implementation class AdministradorProductosBean
 */
@Stateless
@LocalBean
public class SBAdministradorProductosBean implements SBAdministradorProductos {

	@PersistenceContext(unitName = "LogisticaYMonitoreo")
	private EntityManager manager;
	
    public SBAdministradorProductosBean() {
    }

	@Override
	public void agregarNuevoProducto(Articulo producto) {
		manager.persist(producto);
	}

}
