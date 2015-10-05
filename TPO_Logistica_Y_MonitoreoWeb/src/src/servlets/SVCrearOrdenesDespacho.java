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

@WebServlet("/SVCrearOrdenesDespacho")
public class SVCrearOrdenesDespacho extends HttpServlet {
	
	BD  controlador = BD.getInstancia();
	;
	private static final long serialVersionUID = 1L;
       
    public SVCrearOrdenesDespacho() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Despachos y ventas a asociar:");
		ArrayList<Long> ventas = new ArrayList<Long>();
		ArrayList<Long> despachos = new ArrayList<Long>();
		String idVenta1 = request.getParameter("idVta1").toString();
		System.out.println("idVenta1: "+idVenta1);
		String idDespacho1 =request.getParameter("comboDesp1").toString();
		System.out.println(idDespacho1+"\n"+"------------"+"\n");
		String idVenta2 = request.getParameter("idVta2").toString();
		System.out.println(idVenta2);
		String idDespacho2 =request.getParameter("comboDesp2").toString();
		System.out.println(idDespacho2+"\n"+"------------"+"\n");
		String idVenta3 = request.getParameter("idVta3").toString();
		System.out.println(idVenta3);
		String idDespacho3 =request.getParameter("comboDesp3").toString();
		System.out.println(idDespacho3+"\n"+"------------"+"\n");
		String idVenta4 = request.getParameter("idVta4").toString();
		System.out.println(idVenta4);
		String idDespacho4 =request.getParameter("comboDesp4").toString();
		System.out.println(idDespacho4+"\n"+"------------"+"\n");
		String idVenta5 = request.getParameter("idVta5").toString();
		System.out.println(idVenta5);
		String idDespacho5 =request.getParameter("comboDesp5").toString();
		System.out.println(idDespacho5+"\n"+"------------"+"\n");
		String idVenta6 = request.getParameter("idVta6").toString();
		System.out.println(idVenta6);
		String idDespacho6 =request.getParameter("comboDesp6").toString();
		System.out.println(idDespacho6+"\n"+"------------"+"\n");
		String idVenta7 = request.getParameter("idVta7").toString();
		System.out.println(idVenta7);
		String idDespacho7 =request.getParameter("comboDesp7").toString();
		System.out.println(idDespacho7+"\n"+"------------"+"\n");
		String idVenta8 = request.getParameter("idVta8").toString();
		System.out.println(idVenta8);
		String idDespacho8 =request.getParameter("comboDesp8").toString();
		System.out.println(idDespacho8+"\n"+"------------"+"\n");
		String idVenta9 = request.getParameter("idVta9").toString();
		System.out.println(idVenta9);
		String idDespacho9 =request.getParameter("comboDesp9").toString();
		System.out.println(idDespacho9+"\n"+"------------"+"\n");
		String idVenta10 = request.getParameter("idVta10").toString();
		System.out.println(idVenta10);
		String idDespacho10 =request.getParameter("comboDesp10").toString();
		System.out.println(idDespacho10+"\n"+"------------"+"\n");
		
		
		if(Long.valueOf(idVenta1) != 0){
			ventas.add(Long.valueOf(idVenta1));
			despachos.add(Long.valueOf(idDespacho1));
		}
		if(Long.valueOf(idVenta2) != 0){
			ventas.add(Long.valueOf(idVenta2));
			despachos.add(Long.valueOf(idDespacho2));
		}
		if(Long.valueOf(idVenta3) != 0){
			ventas.add(Long.valueOf(idVenta3));
			despachos.add(Long.valueOf(idDespacho3));
		}
		if(Long.valueOf(idVenta4) != 0){
			ventas.add(Long.valueOf(idVenta4));
			despachos.add(Long.valueOf(idDespacho4));
		}
		if(Long.valueOf(idVenta5) != 0){
			ventas.add(Long.valueOf(idVenta5));
			despachos.add(Long.valueOf(idDespacho5));
		}
		if(Long.valueOf(idVenta6) != 0){
			ventas.add(Long.valueOf(idVenta6));
			despachos.add(Long.valueOf(idDespacho6));
		}
		if(Long.valueOf(idVenta7) != 0){
			ventas.add(Long.valueOf(idVenta7));
			despachos.add(Long.valueOf(idDespacho7));
		}
		if(Long.valueOf(idVenta8) != 0){
			ventas.add(Long.valueOf(idVenta8));
			despachos.add(Long.valueOf(idDespacho8));
		}
		if(Long.valueOf(idVenta9) != 0){
			ventas.add(Long.valueOf(idVenta9));
			despachos.add(Long.valueOf(idDespacho9));
		}
		if(Long.valueOf(idVenta10) != 0){
			ventas.add(Long.valueOf(idVenta10));
			despachos.add(Long.valueOf(idDespacho10));
		}
		controlador.asociarOrdenesDeDespachoAVentas(ventas, despachos);
		System.out.println("Se crearon bien las ordenes de despacho para las vetnas.\n");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}

}
