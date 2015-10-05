package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessDelegate.BD;
import dominio.ItemVenta;
import dominio.Portal;
import dominio.Venta;

@WebServlet("/SVReporteVentasPorPortal")
public class SVReporteVentasPorPortal extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private BD controlador = BD.getInstancia();
	
    public SVReporteVentasPorPortal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombrePortal = request.getParameter("imputVenta");
		long idPortal = 0;
		for(Portal p : controlador.obtenerPortales()){
			if(p.getDescripcion().equalsIgnoreCase(nombrePortal))
				idPortal = p.getId();
		}
		int i = 0;
		float monto = 0;
		ArrayList<String> idsVentas = new ArrayList<String>();
		ArrayList<String> estadosOrdDespachoVtas = new ArrayList<String>();
		ArrayList<String> codVentas = new ArrayList<String>();
		for(Venta venta : controlador.obtenerVentasDePortal(idPortal)){
			idsVentas.add(""+venta.getId());
			codVentas.add(""+venta.getCodigo());
			if(venta.getOrdenDespacho() != null)
				estadosOrdDespachoVtas.add(venta.getOrdenDespacho().getEstaEnviada()? "Despachada" : "No despachada");
			else
				estadosOrdDespachoVtas.add("Sin orden de despacho");
			
			float mont = 0;
			for (ItemVenta itemVenta : venta.getItemsVenta()) {

				mont += itemVenta.getProducto().getPrecio()
						* itemVenta.getCantidad();
			}
			monto += mont;
			i++;
		}
		while(i<10){
			idsVentas.add("");
			codVentas.add("");
			estadosOrdDespachoVtas.add("");
			i++;
		}
		request.setAttribute("montoTotal", monto);
		request.setAttribute("codVenta1", codVentas.get(0));
		request.setAttribute("estado1", estadosOrdDespachoVtas.get(0));
		request.setAttribute("codVenta2", codVentas.get(1));
		request.setAttribute("estado2", estadosOrdDespachoVtas.get(1));
		request.setAttribute("codVenta3", codVentas.get(2));
		request.setAttribute("estado3", estadosOrdDespachoVtas.get(2));
		request.setAttribute("codVenta4", codVentas.get(3));
		request.setAttribute("estado4", estadosOrdDespachoVtas.get(3));
		request.setAttribute("codVenta5", codVentas.get(4));
		request.setAttribute("estado5", estadosOrdDespachoVtas.get(4));
		request.setAttribute("codVenta6", codVentas.get(5));
		request.setAttribute("estado6", estadosOrdDespachoVtas.get(5));
		request.setAttribute("codVenta7", codVentas.get(6));
		request.setAttribute("estado7", estadosOrdDespachoVtas.get(6));
		request.setAttribute("codVenta8", codVentas.get(7));
		request.setAttribute("estado8", estadosOrdDespachoVtas.get(7));
		request.setAttribute("codVenta9", codVentas.get(8));
		request.setAttribute("estado9", estadosOrdDespachoVtas.get(8));
		request.setAttribute("codVenta10", codVentas.get(9));
		request.setAttribute("estado10", estadosOrdDespachoVtas.get(9));
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/visorReporteDeVentasPorPortal.jsp");
		dispatcher.forward(request, response);
	}

}
