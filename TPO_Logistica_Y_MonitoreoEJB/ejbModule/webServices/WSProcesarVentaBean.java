package webServices;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;

import sessionFacade.FachadaLogYMon;
import tpo.ia.vos.VOVenta;

@Stateless
@WebService
public class WSProcesarVentaBean implements WSProcesarVenta {
	
	@EJB
	FachadaLogYMon fachadaLogistica;

	public WSProcesarVentaBean() {
	}

	@WebMethod
	public boolean procesarVenta(VOVenta venta) {
		return fachadaLogistica.procesarVenta(venta);
	}	
	
}
