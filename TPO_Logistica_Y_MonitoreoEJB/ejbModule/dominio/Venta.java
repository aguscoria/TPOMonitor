package dominio;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Venta")
public class Venta implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String estado;
	private Date fecha;
	private long codigo;
	private Cliente cliente;
	private Portal portal;
	private OrdenDespacho ordenDespacho;
	
	private List<ItemVenta> itemsVenta;

	//CONSTANTES
	public static final String CON_VENTANODESPACHADA 		= "ND";
	public static final String CON_VENTADESPACHADA 			= "SD";
	
	public float calcularMonto(){
		float monto = 0;
		for(ItemVenta itemVenta : this.getItemsVenta()){
			monto += itemVenta.getProducto().getPrecio()*itemVenta.getCantidad();
		}
		return monto;	
	}
	
	/*GETTERS Y SETTERS*/
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "id_Cliente")
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public long getCodigo() {
		return codigo;
	}
	
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	
	public Date getFecha() {
		return fecha;
	}
	
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@OneToMany(cascade = CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name = "id_Venta")
	public List<ItemVenta> getItemsVenta() {
		return itemsVenta;
	}
	
	public void setItemsVenta(List<ItemVenta> itemsVenta) {
		this.itemsVenta = itemsVenta;
	}

	@ManyToOne
	@JoinColumn(name="id_Portal")
	public Portal getPortal() {
		return portal;
	}
	
	public void setPortal(Portal portal) {
		this.portal = portal;
	}
	
	@OneToOne
	@JoinColumn(name="id_ordenDespacho")
	public OrdenDespacho getOrdenDespacho() {
		return ordenDespacho;
	}
	
	public void setOrdenDespacho(OrdenDespacho ordenDespacho) {
		this.ordenDespacho = ordenDespacho;
	}
	
}
