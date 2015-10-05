package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessDelegate.BD;

@WebServlet("/SVVisorInformesAuditoria")
public class SVVisorInformesAuditoria extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	BD controlador = BD.getInstancia();
	
    public SVVisorInformesAuditoria() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/LogisticaYMonitoreo/");
		dispatcher.forward(request, response);
	}

}
