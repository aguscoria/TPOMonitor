package sessionBeans;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.Portal;

@Stateless
@LocalBean
public class SBAdministradorPortalBean implements SBAdministradorPortal {

    public SBAdministradorPortalBean() {
    }
    
    @PersistenceContext(unitName = "LogisticaYMonitoreo")
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<Portal> obtenerPortales() {
		ArrayList<Portal> portales = new ArrayList<Portal>();
		Query query = manager.createQuery("SELECT p FROM Portal p");
		portales = (ArrayList<Portal>)query.getResultList();
		return portales;
	}
    
    

}
