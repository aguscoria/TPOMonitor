package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "ItemVenta")
public class ItemVenta implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private long cantidad;
	private Articulo producto;
	
	/*GETTERS Y SETTERS*/
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public long getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_Producto")
	public Articulo getProducto() {
		return producto;
	}
	
	public void setProducto(Articulo producto) {
		this.producto = producto;
	}
	
}
