package rest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.ws.rs.core.Response;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;

import sessionBeans.SBAdministradorBestSellers;
import tpo.ia.vos.VORanking;
import dominio.Articulo;


public class REnviarBestSeller {

//	@EJB
//	SBAdministradorBestSellers administradorBestSellers;

//	public void enviarRanking() {
//	
//		 ArrayList<Producto> productos =
//				 administradorBestSellers.obtenerProductosBestSeller();
//		 int i = 1;
//		 for(Producto producto : productos){
//			 System.out.println(producto.getDescripcion());
//			 VORanking voArticuloBestSeller = new VORanking();
//			 voArticuloBestSeller.setIdProducto(Integer.parseInt(String.valueOf(producto.getCodigo())));
//			 voArticuloBestSeller.setRanking(i);
//			 try {	
//				 ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//				 String json = ow.writeValueAsString(voArticuloBestSeller);
//				 URL url = new URL("http://25.95.7.159:8080/IDA_TPO_PW_CLI/RecepcionDeRanking");
//				 HttpURLConnection con = (HttpURLConnection)url.openConnection();
//				 con.setRequestMethod("POST");
//				 con.setDoOutput(true);
//				 con.setDoInput(true);
//				 con.setUseCaches(false);
//				 con.setAllowUserInteraction(false);
//				 con.setRequestProperty("Content-Type", "application/json; charset=utf8");
//				 OutputStream os = con.getOutputStream();
//				 os.write(json.getBytes("UTF-8"));
//				 os.close();
//				 	 
//				if (con.getResponseCode() != 200){
//					throw new IOException(con.getResponseMessage());
//				}
//				BufferedReader rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
//				StringBuilder sb = new StringBuilder();
//				String line;
//				while((line = rd.readLine()) != null){
//				 	sb.append(line);
//				}
//				rd.close();
//					 	 
//				con.disconnect();
//				String respuesta = sb.toString();
//				 
////				 ResteasyClient client = new ResteasyClientBuilder().build();
////				 ResteasyWebTarget target = client
////		                     .target("http://25.95.7.159:8080/IDA_TPO_PW_CLI/RecepcionDeRanking");
////				 Response response = target.request().post(Entity.entity(voArticuloBestSeller, "application/json"));
////				 if (response.getStatus() != 200) {
////		                 throw new RuntimeException("Failed : HTTP error code : "+ response.getStatus());
////				 }
////				 System.out.println("Server response : \n");
////				 
////				 System.out.println(response.readEntity(String.class));
////				 response.close();
//			 } catch (Exception e) {
//				 e.printStackTrace();
//			 }
//		 }	
//	}
//		 
							 
}
	
	