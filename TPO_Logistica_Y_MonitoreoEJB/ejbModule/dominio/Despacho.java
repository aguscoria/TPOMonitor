package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Despacho")
public class Despacho implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private boolean estaActivo;
	private String coordenadas;
	private String nombre;
	
	/*GETTERS Y SETTERS*/
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
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
