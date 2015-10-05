package test;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;

import sessionFacade.FachadaLogYMon;

public class TestPersistencia {

	public static void main(String[] args) throws Exception {
		   final String appName = "TPO_Logistica_Y_MonitoreoEAR";
	        final String moduleName = "TPO_Logistica_Y_MonitoreoEJB";
	        final String sessionBeanName = "FachadaLogYMonBean";
	        final String viewClassName = FachadaLogYMon.class.getName();
			 Properties jndiProps = new Properties();
			 jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
			 jndiProps.put(Context.PROVIDER_URL,"remote://127.0.0.1:4447/");
			 //AdminUser: test
			 //AdminPass: test1234.
			 
			 // username 
			 //usuario de servidor: managementuser
			 //password: cristian10!
			 jndiProps.put(Context.SECURITY_PRINCIPAL,"appuser");
			 // password
			 jndiProps.put(Context.SECURITY_CREDENTIALS,"cristian10!");
			 // This is an important property to set if you want to do EJB invocations via the remote-naming project
			 jndiProps.put("jboss.naming.client.ejb.context", true);
			 // create a context passing these properties
			
			 Context context = new InitialContext(jndiProps);
			 // lookup the bean     Foo
			 FachadaLogYMon fachadaLogYMon =(FachadaLogYMon)context.lookup("TPO_Logistica_Y_MonitoreoEAR/TPO_Logistica_Y_MonitoreoEJB/FachadaLogYMonBean!fachadas.FachadaLogYMon");
			 //AdministradorProductos administradorProductos =(AdministradorProductos)context.lookup("PruebaProyecto5-ear/PruebaProyecto5/AdministradorProductosBean!ia.ejemplos.sessions.AdministradorProductos");
		     //fachadaLogYMon.persistirBata();
	
	}

}
