package sessionBeans;

import java.util.ArrayList;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dominio.Producto;

@Stateless
public class SBAdministradorBestSellersBean implements
		SBAdministradorBestSellers {

	@PersistenceContext(unitName = "LogisticaYMonitoreo")
	private EntityManager manager;

	public SBAdministradorBestSellersBean() {
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Producto> obtenerProductosBestSeller() {
		ArrayList<Producto> productosBS = new ArrayList<Producto>();
		ArrayList<Producto> lista = (ArrayList<Producto>) manager
				.createQuery(
						"SELECT p FROM Producto p ORDER BY p.cantidadVentas desc, p.id")
				.setMaxResults(10).getResultList();
		if (lista != null)
			productosBS.addAll(lista);
		return productosBS;
	}
}
