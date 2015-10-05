package sessionBeans;

import java.util.ArrayList;
import java.util.Date;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import dominio.InformeAuditoria;

@Stateless
@LocalBean
public class SBAdministradorInformesAuditoriaBean implements SBAdministradorInformesAuditoria {

	@PersistenceContext(unitName="LogisticaYMonitoreo")
	private EntityManager manager;
	
    public SBAdministradorInformesAuditoriaBean() {
    }

	@Override
	public void generarInformeAuditoria(InformeAuditoria informeAuditoria) {
		manager.persist(informeAuditoria);
	}

	@SuppressWarnings("unchecked")
	@Override
	public ArrayList<InformeAuditoria> obtenerInformesAuditoriaNearOnLine() {
		ArrayList<InformeAuditoria> informesNearOnLine = new ArrayList<InformeAuditoria>();
		Date fechaNearOnLine = new Date(new Date().getTime()-3000);//--> Le resto 3 segundos a la fecha actual.
		Query query = manager.createQuery("select i from InformeAuditoria i order by i.id desc").setMaxResults(10);
		informesNearOnLine = (ArrayList<InformeAuditoria>)query.getResultList();
		return informesNearOnLine;
	}

}
