package dominio;

import java.io.Serializable;



public class Cliente implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idCliente;
	private String coordenada;
	private long dni;
	private String nombre;
	private String apelido;

	/*GETTERS Y SETTERS*/
	
	
	public long getIdCliente() {
		return idCliente;
	}
	
	public void setId(long idCliente) {
		this.idCliente = idCliente;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApelido() {
		return apelido;
	}
	
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
		
	public long getDni() {
		return dni;
	}
	
	public void setDni(long dni) {
		this.dni = dni;
	}

	public String getCoordenada() {
		return coordenada;
	}
	
	public void setCoordenada(String coordenada) {
		this.coordenada = coordenada;
	}
	
}
