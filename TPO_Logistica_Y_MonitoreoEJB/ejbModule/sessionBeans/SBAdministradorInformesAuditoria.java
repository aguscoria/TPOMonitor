package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Local;

import dominio.InformeAuditoria;

@Local
public interface SBAdministradorInformesAuditoria {

	public void generarInformeAuditoria(InformeAuditoria informeAuditoria);
	
	public ArrayList<InformeAuditoria> obtenerInformesAuditoriaNearOnLine();
	
}
