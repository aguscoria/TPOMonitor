package dominio;

import java.io.Serializable;


public class Despacho implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private boolean estaActivo;
	private String coordenadas;
	private String nombre;
	
	/*GETTERS Y SETTERS*/
	
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCoordenadas() {
		return coordenadas;
	}
	
	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public boolean getEstaActivo(){
		return estaActivo;
	}
	
	public void setEstaActivo(boolean estaActivo) {
		this.estaActivo = estaActivo;
	}
	
}
