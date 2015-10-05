package tpo.ia.vos;

import java.io.Serializable;

public class VORanking implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int idProducto;
	private int ranking;

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public long getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	
	
	
	
	
	
	
	

}
