package dominio;

import java.io.Serializable;



public class Cliente implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private String coordenada;
	private long dni;
	private String nombre;
	private String apelido;

	/*GETTERS Y SETTERS*/
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
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
