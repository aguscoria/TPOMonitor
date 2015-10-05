package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessDelegate.BD;
import dominio.Venta;

@WebServlet("/SVBuscarOrdenesDespacho")
public class SVBuscarOrdenesDespacho extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	BD  controlador = BD.getInstancia();
	
    public SVBuscarOrdenesDespacho() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String codVenta = request.getParameter("imputVenta");
		System.out.println("Cod de Venta: "+codVenta);
		long codigo = Long.valueOf(codVenta);
		Venta venta = controlador.obtenerVentaPorCodigo(codigo);
			if(venta != null){
			String enviada;
			String fecha;
			String despacho;
			codVenta = String.valueOf(venta.getCodigo());
			despacho = venta.getOrdenDespacho().getDespacho().getNombre();
			enviada = venta.getEstado().equalsIgnoreCase(Venta.CON_VENTADESPACHADA)? "Despachada" : "No despachada";
			fecha = String.valueOf(venta.getOrdenDespacho().getFecha());
			request.setAttribute("enviada", enviada);
			request.setAttribute("fecha", fecha);
			request.setAttribute("codVenta", codVenta);
			request.setAttribute("despacho", despacho);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/visorOrdenDespacho.jsp");
			dispatcher.forward(request, response);
		}else{
			//Si no existe la venta te deja ahí
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/ordenesDespacho.jsp");
			dispatcher.forward(request, response);
		}
	}

}
