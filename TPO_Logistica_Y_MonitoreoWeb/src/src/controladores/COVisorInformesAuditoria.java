package controladores;

import businessDelegate.BD;
import dominio.InformeAuditoria;

public class COVisorInformesAuditoria {

	BD  controlador = BD.getInstancia();
	
	private String[] descInformes;
	private String[] fechaInformes;
	
	public COVisorInformesAuditoria() {
		descInformes = new String[10];
		fechaInformes = new String[10];
		cargarInformesNearOnLine();
	}
	
	public void cargarInformesNearOnLine(){
		int i = 0;
		for(InformeAuditoria informeAuditoria : controlador.obtenerInformesAuditoriaNearOnLine()){
			if(i < 10){
				descInformes[i] = informeAuditoria.getDescripcion();
				fechaInformes[i] = String.valueOf(informeAuditoria.getFecha());
				i++;
			}
		}
		// SI SON MENOS DE 10 COMPLETO EL RESTO EN BLANCO
		if(i<10){ 
			while(i<10){
				descInformes[i] = "";
				fechaInformes[i] = "";
				i++;
			}
		}
	}
	
	/* GETTERS Y SETTERS */
	
	public String[] getDescInformes() {
		return descInformes;
	}
	
	public void setDescInformes(String[] descInformes) {
		this.descInformes = descInformes;
	}
	
	public String[] getFechaInformes() {
		return fechaInformes;
	}
	
	public void setFechaInformes(String[] fechaInformes) {
		this.fechaInformes = fechaInformes;
	}
	
}
