package controladores;

import java.util.ArrayList;

import businessDelegate.BD;
import dominio.Portal;

public class COVentasPorPortal {

	private BD controlador = BD.getInstancia();
	
	private String[] codVtas;
	private float montoTotal;
	private String[] estadosODVentas;
	private String[] idsVentas;
	private long idPortal;
	private ArrayList<String> nombresPortales;
	private ArrayList<Long> idPortales;
	
	public COVentasPorPortal() {
		codVtas = new String[10];
		montoTotal = 0;
		estadosODVentas = new String[10];
		idsVentas = new String[10];
		idPortal = 0;
		idPortales = new ArrayList<Long>();
		nombresPortales = new ArrayList<String>();
	}
	
	public void inicializarComponentes(){
		for(Portal portal : controlador.obtenerPortales()){
			idPortales.add(portal.getId());
			nombresPortales.add(portal.getDescripcion());
		}
	}
	
	/* GETTERS Y SETTERS */
	
	public ArrayList<Long> getIdPortales() {
		return idPortales;
	}
	
	public void setIdPortales(ArrayList<Long> idPortales) {
		this.idPortales = idPortales;
	}
	
	public ArrayList<String> getNombresPortales() {
		return nombresPortales;
	}
	
	public void setNombresPortales(ArrayList<String> nombresPortales) {
		this.nombresPortales = nombresPortales;
	}
	
	public long getIdPortal() {
		return idPortal;
	}
	
	public void setIdPortal(long idPortal) {
		this.idPortal = idPortal;
	}
	
	public String[] getCodVtas() {
		return codVtas;
	}
	
	public String[] getIdsVentas() {
		return idsVentas;
	}
	
	public String[] getEstadosODVentas() {
		return estadosODVentas;
	}
	
	public float getMontoTotal() {
		return montoTotal;
	}
	
	public void setCodVtas(String[] codVtas) {
		this.codVtas = codVtas;
	}
	
	public void setEstadosODVentas(String[] estadosODVentas) {
		this.estadosODVentas = estadosODVentas;
	}
	
	public void setIdsVentas(String[] idsVentas) {
		this.idsVentas = idsVentas;
	}
	
	public void setMontoTotal(float montoTotal) {
		this.montoTotal = montoTotal;
	}
	
}
