package dominio;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="DespachoVentaPreventivo")
public class DespachoVentaPreventivo implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long id;
	private Despacho despacho;
	private Venta venta;
	
	/* GETTERS Y SETTERS */
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@OneToOne
	@JoinColumn(name="id_Venta")
	public Venta getVenta() {
		return venta;
	}
	
	public void setVenta(Venta venta) {
		this.venta = venta;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_Despacho")
	public Despacho getDespacho() {
		return despacho;
	}
	
	public void setDespacho(Despacho despacho) {
		this.despacho = despacho;
	}
	
}
