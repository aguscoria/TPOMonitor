package dominio;

import java.io.Serializable;
import java.util.Date;



public class InformeAuditoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private Date fecha;
	private String descripcion;
	
	/*GETTERS Y SETTERS*/
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
