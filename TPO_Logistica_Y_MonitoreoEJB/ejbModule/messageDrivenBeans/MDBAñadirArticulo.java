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
import dominio.InformeAuditoria;
import dominio.Producto;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "queue/colaArticulo") }, mappedName = "queue/colaArticulo")
public class MDBAñadirArticulo implements MessageListener {

	@EJB
	FachadaLogYMon fachadaLogYMon;

	public MDBAñadirArticulo() {
	}

	public void onMessage(Message message) {

		System.out
				.println("----------- Se recibio un mensaje de nuevo articulo -----------");
		try {
			ObjectMessage objectMessage = (ObjectMessage) message;
			VOArticulo articuloNuevo = (VOArticulo) objectMessage.getObject();
			Producto producto = new Producto();
			producto.setCantidadVentas(0);
			producto.setPrecio(articuloNuevo.getPrecio());
			producto.setDescripcion(articuloNuevo.getDescripcion());
			producto.setCodigo(articuloNuevo.getCodigo());
			fachadaLogYMon.generarNuevoProducto(producto);
			InformeAuditoria informeAuditoria = new InformeAuditoria();
			informeAuditoria.setFecha(new Date());
			String descripcionInformeAuditoria = "Se agregó el producto"
					+ producto.getDescripcion() + " cuyo codigo es "
					+ producto.getCodigo() + ".";
			informeAuditoria.setDescripcion(descripcionInformeAuditoria);
			fachadaLogYMon.generarInformeAuditoria(informeAuditoria);
			System.out.println("----------- Se persistio el artículo "
					+ producto.getDescripcion() + " -----------");
		} catch (Exception e) {
			e.printStackTrace();
			System.out
					.println("----------- Error al persistir el artículo -----------");
		}
	}

}
