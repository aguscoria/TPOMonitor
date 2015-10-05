package tpo.ia.vos;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class VOVenta implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String dni;
	private Integer codigoVenta;
	private Date fechaHoraVenta;
	private String coordenadasUsuario;
	private Float montoTotal;
	private String codigoPortal;
	private String estado;
	private ArrayList<VOItemVenta> collectionItems;

	public VOVenta() {
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(int codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public Date getFechaHoraVenta() {
		return fechaHoraVenta;
	}

	public void setFechaHoraVenta(Date fechaHoraVenta) {
		this.fechaHoraVenta = fechaHoraVenta;
	}

	public String getCoordenadasUsuario() {
		return coordenadasUsuario;
	}

	public void setCoordenadasUsuario(String coordenadasUsuario) {
		this.coordenadasUsuario = coordenadasUsuario;
	}

	public Float getMontoTotal() {
		return montoTotal;
	}

	public void setMontoTotal(Float montoTotal) {
		this.montoTotal = montoTotal;
	}

	public String getCodigoPortal() {
		return codigoPortal;
	}

	public void setCodigoPortal(String codigoPortal) {
		this.codigoPortal = codigoPortal;
	}

	public ArrayList<VOItemVenta> getCollectionItems() {
		return collectionItems;
	}

	public void setCollectionItems(ArrayList<VOItemVenta> collectionItems) {
		this.collectionItems = collectionItems;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}

}
