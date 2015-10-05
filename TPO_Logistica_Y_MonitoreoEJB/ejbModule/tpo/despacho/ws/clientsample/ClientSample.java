package tpo.despacho.ws.clientsample;

import tpo.despacho.ws.*;

public class ClientSample {

	public static void main(String[] args) {
		VoOrdenDeDespacho voOrdenDeDespacho = new VoOrdenDeDespacho();
		voOrdenDeDespacho.setIdVenta(2);
		voOrdenDeDespacho.setIdOrdenDeDespacho(1);
		voOrdenDeDespacho.setNombreLogisticaYMonitoreo("LOGISTICA2");
		voOrdenDeDespacho.setNombrePortalWeb("PORTALWEB2");
		VoDetalleOrdenDeDespacho voDetalleOrdenDeDespacho = new VoDetalleOrdenDeDespacho();
		voDetalleOrdenDeDespacho.setCantidad(2);
		voDetalleOrdenDeDespacho.setCodigoArticulo(123121);
		VoDetalleOrdenDeDespacho voDetalleOrdenDeDespacho2 = new VoDetalleOrdenDeDespacho();
		voDetalleOrdenDeDespacho.setCantidad(1);
		voDetalleOrdenDeDespacho.setCodigoArticulo(1351953);
		voOrdenDeDespacho.getDetallesOrdenDeDespachoVO().add(voDetalleOrdenDeDespacho);
		voOrdenDeDespacho.getDetallesOrdenDeDespachoVO().add(voDetalleOrdenDeDespacho2);
	        System.out.println("***********************");
	        System.out.println("Create Web Service Client...");
	        AdministradorOrdenDeDespachoBeanService service1 = new AdministradorOrdenDeDespachoBeanService();
	        System.out.println("Create Web Service...");
	        AdministradorOrdenDeDespachoBean port1 = service1.getAdministradorOrdenDeDespachoBeanPort();
	        System.out.println("Call Web Service Operation...");
	        System.out.println("Server said: " + port1.recepcionOrdenDeDespacho(voOrdenDeDespacho));
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("Create Web Service...");
	        AdministradorOrdenDeDespachoBean port2 = service1.getAdministradorOrdenDeDespachoBeanPort();
	        System.out.println("Call Web Service Operation...");
	        
	        //Please input the parameters instead of 'null' for the upper method!
	
	        System.out.println("***********************");
	        System.out.println("Call Over!");
	}
}
