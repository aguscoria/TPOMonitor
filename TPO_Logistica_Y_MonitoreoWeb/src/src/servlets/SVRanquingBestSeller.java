package servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import tpo.ia.vos.VORanking;
import businessDelegate.BD;
import dominio.Producto;

@WebServlet("/SVRanquingBestSeller")
public class SVRanquingBestSeller extends HttpServlet {
	
	BD  controlador = BD.getInstancia();
	
	private static final long serialVersionUID = 1L;
       
    public SVRanquingBestSeller() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		ArrayList<Producto> productos = controlador.obtenerProductosBestSeller();
		int i = 1;
		for (Producto producto : productos) {
			VORanking voArticuloBestSeller = new VORanking();
			voArticuloBestSeller.setIdProducto(Integer.parseInt(String.valueOf(producto.getCodigo())));
			voArticuloBestSeller.setRanking(i);
			try {
				
				ArrayList<String> ips = new ArrayList<String>();
				ips.add("172.16.164.43");
				ips.add("172.16.164.42");
				for(int j = 0; j<=1; j++){
					ObjectWriter ow = new ObjectMapper().writer()
							.withDefaultPrettyPrinter();
					String json = ow.writeValueAsString(voArticuloBestSeller);
					URL url = null;
					if(ips.get(j).equalsIgnoreCase("172.16.164.43"))
						url = new URL(
								"http://"+ips.get(j)+":8080/IDA_TPO_PW_CLI/RecepcionDeRanking");
					else
						url = new URL(
								"http://"+ips.get(j)+":8080/PortalDeComprasWeb/PortalRestRanking");
					HttpURLConnection con = (HttpURLConnection) url
							.openConnection();
					con.setRequestMethod("POST");
					con.setDoOutput(true);
					con.setDoInput(true);
					con.setUseCaches(false);
					con.setAllowUserInteraction(false);
					con.setRequestProperty("Content-Type",
							"application/json; charset=utf8");
					OutputStream os = con.getOutputStream();
					os.write(json.getBytes("UTF-8"));
					os.close();
		
					if (con.getResponseCode() != 200) {
						throw new IOException(con.getResponseMessage());
					}
					BufferedReader rd = new BufferedReader(new InputStreamReader(
							con.getInputStream()));
					StringBuilder sb = new StringBuilder();
					String line;
					while ((line = rd.readLine()) != null) {
						sb.append(line);
					}
					rd.close();
		
					con.disconnect();
					String respuesta = sb.toString();	
				}
				i++;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
	}
}
