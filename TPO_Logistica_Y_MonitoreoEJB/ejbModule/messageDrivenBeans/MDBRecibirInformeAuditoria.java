package messageDrivenBeans;

import java.util.Date;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import sessionFacade.FachadaLogYMon;
import tpo.ia.vos.VOArticulo;
import tpo.ia.vos.VOInformeAuditoria;
import dominio.InformeAuditoria;

@MessageDriven(
		activationConfig = { @ActivationConfigProperty(
				propertyName = "destinationType", propertyValue = "javax.jms.Queue"), @ActivationConfigProperty(
				propertyName = "destination", propertyValue = "queue/colaInformeAuditoria")
		}, 
		mappedName = "queue/colaInformeAuditoria")
public class MDBRecibirInformeAuditoria implements MessageListener {

	@EJB
	FachadaLogYMon fachadaLogYMon;
	
    public MDBRecibirInformeAuditoria() {
    }
	
    public void onMessage(Message message) {
    	System.out.println("----------- Se recibio un mensaje de nuevo informe de auditoria -----------");
        try {
        	ObjectMessage objectMessage = (ObjectMessage) message;
        	VOInformeAuditoria voInformeAuditoria = (VOInformeAuditoria) objectMessage.getObject();
			InformeAuditoria informeAuditoria = new InformeAuditoria();
			informeAuditoria.setDescripcion(voInformeAuditoria.getDescripcion());
			informeAuditoria.setFecha(new Date());
			fachadaLogYMon.generarInformeAuditoria(informeAuditoria);
			System.out.println("----------- Se realizó el informe correctamente -----------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("----------- Error al realizar el informe de auditoría -----------");
		}
    }

}
