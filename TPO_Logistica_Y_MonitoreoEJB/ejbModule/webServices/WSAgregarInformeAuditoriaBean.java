package webServices;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import sessionFacade.FachadaLogYMon;
import tpo.ia.vos.VOInformeAuditoria;
import dominio.InformeAuditoria;

@Stateless
@WebService
public class WSAgregarInformeAuditoriaBean implements WSAgregarInformeAuditoria {

	@EJB
	FachadaLogYMon fachadaLogistica;
	
    public WSAgregarInformeAuditoriaBean() {

    }

    @WebMethod
    public boolean agregarInformeAuditoria(VOInformeAuditoria informeAuditoria){
    	InformeAuditoria informeAuditoria2 = new InformeAuditoria();
    	try {
    		informeAuditoria2.setDescripcion(informeAuditoria.getDescripcion());
        	informeAuditoria2.setFecha(new Date());
        	fachadaLogistica.generarInformeAuditoria(informeAuditoria2);
        	return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    	
    }
}
