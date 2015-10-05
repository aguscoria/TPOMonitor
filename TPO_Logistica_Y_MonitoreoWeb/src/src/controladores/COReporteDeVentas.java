package controladores;

import java.util.Date;

import businessDelegate.BD;
import dominio.ItemVenta;
import dominio.Venta;

public class COReporteDeVentas {

	BD controlador = BD.getInstancia();

	private String[] fechas;
	private String[] nVentas;
	private String[] montos;
	private String[] portales;
	private String[] clientes;
	private String[] estados;

	public COReporteDeVentas() {
		fechas = new String[10];
		nVentas = new String[10];
		montos = new String[10];
		portales = new String[10];
		clientes = new String[10];
		estados = new String[10];
		cargarVentas();
	}

	public void cargarVentas() {
		int i = 0;
		for (Venta venta : controlador.obtenerVentas()) {
			if (i < 10) {
				fechas[i] = String.valueOf(new Date());// String.valueOf(venta.getFecha());
				nVentas[i] = String.valueOf(venta.getCodigo());

				float monto = 0;
				for (ItemVenta itemVenta : venta.getItemsVenta()) {

					monto += itemVenta.getProducto().getPrecio()
							* itemVenta.getCantidad();
				}
				montos[i] = String.valueOf(monto);
				portales[i] = String
						.valueOf(venta.getPortal().getDescripcion());
				clientes[i] = String.valueOf(venta.getCliente().getApelido())
						+ ", " + String.valueOf(venta.getCliente().getNombre());
				estados[i] = venta.getEstado().equalsIgnoreCase(
						Venta.CON_VENTADESPACHADA) ? "Despachada"
						: "No despachada";
				i++;
			}
		}
		// SI SON MENOS DE 10 COMPLETO EL RESTO EN BLANCO
		if (i < 10) {
			while (i < 10) {
				fechas[i] = "";
				nVentas[i] = "";
				montos[i] = "";
				portales[i] = "";
				clientes[i] = "";
				estados[i] = "";
				i++;
			}
		}
	}

	public String[] getClientes() {
		return clientes;
	}

	public String[] getEstados() {
		return estados;
	}

	public String[] getFechas() {
		return fechas;
	}

	public String[] getMontos() {
		return montos;
	}

	public String[] getnVentas() {
		return nVentas;
	}

	public String[] getPortales() {
		return portales;
	}

	public void setClientes(String[] clientes) {
		this.clientes = clientes;
	}

	public void setEstados(String[] estados) {
		this.estados = estados;
	}

	public void setFechas(String[] fechas) {
		this.fechas = fechas;
	}

	public void setMontos(String[] montos) {
		this.montos = montos;
	}

	public void setnVentas(String[] nVentas) {
		this.nVentas = nVentas;
	}

	public void setPortales(String[] portales) {
		this.portales = portales;
	}

}
