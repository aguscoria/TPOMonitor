package org.jboss.samples.rs.webservices;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import tpo.ia.vos.VOCambiarEstadoOrdenDespacho;
import businessDelegate.BD;

@Path("/CambiarEstadoOrdenDeDespacho")
public class CambiarEstadoOrdenDeDespachoBean {

	BD controlador;
		
	@SuppressWarnings("static-access")
	@POST
	@Path("/")
	@Consumes("application/json")
	public String cambiarEstado( VOCambiarEstadoOrdenDespacho ordenDeDespacho  ) {
		try {
			int idOrden = ordenDeDespacho.getIdOrdenDeDespacho();
			controlador.getInstancia().cambiarEstadoOrdenDeDespacho(idOrden);
			return "OK";
		} catch (Exception e) {
			e.printStackTrace();
			return "ERROR";
		}
		
	}

}
