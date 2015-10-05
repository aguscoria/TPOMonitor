package controladores;

import java.util.ArrayList;

import businessDelegate.BD;
import dominio.Despacho;
import dominio.DespachoVentaPreventivo;

public class COCrearOrdenesDespacho {

	BD  controlador = BD.getInstancia();
	
	
	private ArrayList<DespachoVentaPreventivo> 	despachoVentaPreventivos;
	private Long[] 								codigosVentas;
	private Long[] 								idsDespachosAsociadosAVentas;
	private String[] 							nombreDespachosAsociadosAVentas;
	private Long[]								idsVentas;
	private long 								idVenta1;
	private long 								idVenta2;
	private long 								idVenta3;
	private long 								idVenta4;
	private long 								idVenta5;
	private long 								idVenta6;
	private long 								idVenta7;
	private long 								idVenta8;
	private long 								idVenta9;
	private long 								idVenta10;
	//COMBOS
	private ArrayList<Long> 					comboDespachos1,
												comboDespachos2,
												comboDespachos3,
												comboDespachos4,
												comboDespachos5,
												comboDespachos6,
												comboDespachos7,
												comboDespachos8,
												comboDespachos9,
												comboDespachos10;
	private ArrayList<String>					comboNombresDespachos1,
												comboNombresDespachos2,
												comboNombresDespachos3,
												comboNombresDespachos4,
												comboNombresDespachos5,
												comboNombresDespachos6,
												comboNombresDespachos7,
												comboNombresDespachos8,	
												comboNombresDespachos9,
												comboNombresDespachos10;
	
	public void simulacion(){
		idsVentas[0] = 1L;
		idsVentas[1] = 2L;
		codigosVentas[0] = 120L;
		codigosVentas[1] = 150L;
		idsDespachosAsociadosAVentas[0] = 10L;
		idsDespachosAsociadosAVentas[1] = 20L;
		nombreDespachosAsociadosAVentas[0] = "Despacho1";
		nombreDespachosAsociadosAVentas[1] = "Despacho2";
		for(int i=2; i<10; i++){
			idsVentas[i] = 0L;
			codigosVentas[i] = 0L;
			idsDespachosAsociadosAVentas[i] = 0L;
			nombreDespachosAsociadosAVentas[i] = "-";
		}
		comboDespachos1 = new ArrayList<Long>();
		comboNombresDespachos1 = new ArrayList<String>();
		comboDespachos1.add(idsDespachosAsociadosAVentas[0]);
		comboNombresDespachos1.add(nombreDespachosAsociadosAVentas[0]);
		comboDespachos1.add(3L);
		comboNombresDespachos1.add("Despacho3");
		comboDespachos2 = new ArrayList<Long>();
		comboNombresDespachos2 = new ArrayList<String>();
		comboDespachos2.add(idsDespachosAsociadosAVentas[1]);
		comboNombresDespachos2.add(nombreDespachosAsociadosAVentas[1]);
		comboDespachos2.add(3L);
		comboNombresDespachos2.add("Despacho3");
		comboDespachos3 = new ArrayList<Long>();
		comboNombresDespachos3 = new ArrayList<String>();
		comboDespachos3.add(idsDespachosAsociadosAVentas[2]);
		comboNombresDespachos3.add(nombreDespachosAsociadosAVentas[2]);
		comboDespachos4 = new ArrayList<Long>();
		comboNombresDespachos4 = new ArrayList<String>();
		comboDespachos4.add(idsDespachosAsociadosAVentas[3]);
		comboNombresDespachos4.add(nombreDespachosAsociadosAVentas[3]);
		comboDespachos5 = new ArrayList<Long>();
		comboNombresDespachos5 = new ArrayList<String>();
		comboDespachos5.add(idsDespachosAsociadosAVentas[4]);
		comboNombresDespachos5.add(nombreDespachosAsociadosAVentas[4]);
		comboDespachos6 = new ArrayList<Long>();
		comboNombresDespachos6 = new ArrayList<String>();
		comboDespachos6.add(idsDespachosAsociadosAVentas[5]);
		comboNombresDespachos6.add(nombreDespachosAsociadosAVentas[5]);
		comboDespachos7 = new ArrayList<Long>();
		comboNombresDespachos7 = new ArrayList<String>();
		comboDespachos7.add(idsDespachosAsociadosAVentas[6]);
		comboNombresDespachos7.add(nombreDespachosAsociadosAVentas[6]);
		comboDespachos8 = new ArrayList<Long>();
		comboNombresDespachos8 = new ArrayList<String>();
		comboDespachos8.add(idsDespachosAsociadosAVentas[7]);
		comboNombresDespachos8.add(nombreDespachosAsociadosAVentas[7]);
		comboDespachos9 = new ArrayList<Long>();
		comboNombresDespachos9 = new ArrayList<String>();
		comboDespachos9.add(idsDespachosAsociadosAVentas[8]);
		comboNombresDespachos9.add(nombreDespachosAsociadosAVentas[8]);
		comboDespachos10 = new ArrayList<Long>();
		comboNombresDespachos10 = new ArrayList<String>();
		comboDespachos10.add(idsDespachosAsociadosAVentas[9]);
		comboNombresDespachos10.add(nombreDespachosAsociadosAVentas[9]);
		
	}
	
	public COCrearOrdenesDespacho(){
//		idsVentas = new Long[10];
//		codigosVentas = new Long[10];
//		idsDespachosAsociadosAVentas = new Long[10];
//		nombreDespachosAsociadosAVentas = new String[10];
//		simulacion();
		idVenta1 = 0;
		idVenta2 = 0;
		idVenta3 = 0;
		idVenta4 = 0;
		idVenta5 = 0;
		idVenta6 = 0;
		idVenta7 = 0;
		idVenta8 = 0;
		idVenta9 = 0;
		idVenta10 = 0;
		despachoVentaPreventivos = new ArrayList<DespachoVentaPreventivo>();
		idsVentas = new Long[10];
		codigosVentas = new Long[10];
		idsDespachosAsociadosAVentas = new Long[10];
		nombreDespachosAsociadosAVentas = new String[10];

		despachoVentaPreventivos = controlador.obtenerVentasSinOrdenesDeDespacho();
//		//Cargo las ventas con sus despachos preventivos
		int i = 0;
		for(DespachoVentaPreventivo despachoVentaPreventivo : despachoVentaPreventivos){
			if(i<10){
				if(i==0)
					idVenta1 = despachoVentaPreventivo.getVenta().getId();
				if(i==1)
					idVenta2 = despachoVentaPreventivo.getVenta().getId();
				if(i==2)
					idVenta3 = despachoVentaPreventivo.getVenta().getId();
				if(i==3)
					idVenta4 = despachoVentaPreventivo.getVenta().getId();
				if(i==4)
					idVenta5 = despachoVentaPreventivo.getVenta().getId();
				if(i==5)
					idVenta6 = despachoVentaPreventivo.getVenta().getId();
				if(i==6)
					idVenta7 = despachoVentaPreventivo.getVenta().getId();
				if(i==7)
					idVenta8 = despachoVentaPreventivo.getVenta().getId();
				if(i==8)
					idVenta9 = despachoVentaPreventivo.getVenta().getId();
				if(i==9)
					idVenta10 = despachoVentaPreventivo.getVenta().getId();
				codigosVentas[i] = despachoVentaPreventivo.getVenta().getCodigo();
				idsDespachosAsociadosAVentas[i] = despachoVentaPreventivo.getDespacho().getId();
				nombreDespachosAsociadosAVentas[i] = despachoVentaPreventivo.getDespacho().getNombre();
				i++;
			}
		}
		
		while (i<10){			
			idsVentas[i] = 0L;
			codigosVentas[i] = 0L;
			idsDespachosAsociadosAVentas[i] = 0L;
			nombreDespachosAsociadosAVentas[i] = "-";
			i++;
		}
//		//Cargo los combos de despachos para cada una de las ventas
		ArrayList<Despacho> despachosActivos = controlador.obtenerDespachosActivos();
		
		comboDespachos1 = new ArrayList<Long>();
		comboNombresDespachos1 = new ArrayList<String>();
		comboDespachos1.add(idsDespachosAsociadosAVentas[0]);
		comboNombresDespachos1.add(nombreDespachosAsociadosAVentas[0]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos1.contains(despacho.getId())){
				comboDespachos1.add(despacho.getId());
				comboNombresDespachos1.add(despacho.getNombre());
			}
		}
		
		comboDespachos2 = new ArrayList<Long>();
		comboNombresDespachos2 = new ArrayList<String>();
		comboDespachos2.add(idsDespachosAsociadosAVentas[1]);
		comboNombresDespachos2.add(nombreDespachosAsociadosAVentas[1]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos2.contains(despacho.getId())){
				comboDespachos2.add(despacho.getId());
				comboNombresDespachos2.add(despacho.getNombre());
			}
		}

		comboDespachos3 = new ArrayList<Long>();
		comboNombresDespachos3 = new ArrayList<String>();
		comboDespachos3.add(idsDespachosAsociadosAVentas[2]);
		comboNombresDespachos3.add(nombreDespachosAsociadosAVentas[2]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos3.contains(despacho.getId())){
				comboDespachos3.add(despacho.getId());
				comboNombresDespachos3.add(despacho.getNombre());
			}
		}

		comboDespachos4 = new ArrayList<Long>();
		comboNombresDespachos4 = new ArrayList<String>();
		comboDespachos4.add(idsDespachosAsociadosAVentas[3]);
		comboNombresDespachos4.add(nombreDespachosAsociadosAVentas[3]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos4.contains(despacho.getId())){
				comboDespachos4.add(despacho.getId());
				comboNombresDespachos4.add(despacho.getNombre());
			}
		}
			
		comboDespachos5 = new ArrayList<Long>();
		comboNombresDespachos5 = new ArrayList<String>();
		comboDespachos5.add(idsDespachosAsociadosAVentas[4]);
		comboNombresDespachos5.add(nombreDespachosAsociadosAVentas[4]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos5.contains(despacho.getId())){
				comboDespachos5.add(despacho.getId());
				comboNombresDespachos5.add(despacho.getNombre());
			}
		}
			
		comboDespachos6 = new ArrayList<Long>();
		comboNombresDespachos6 = new ArrayList<String>();
		comboDespachos6.add(idsDespachosAsociadosAVentas[5]);
		comboNombresDespachos6.add(nombreDespachosAsociadosAVentas[5]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos6.contains(despacho.getId())){
				comboDespachos6.add(despacho.getId());
				comboNombresDespachos6.add(despacho.getNombre());
			}
		}

		comboDespachos7 = new ArrayList<Long>();
		comboNombresDespachos7 = new ArrayList<String>();
		comboDespachos7.add(idsDespachosAsociadosAVentas[6]);
		comboNombresDespachos7.add(nombreDespachosAsociadosAVentas[6]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos7.contains(despacho.getId())){
				comboDespachos7.add(despacho.getId());
				comboNombresDespachos7.add(despacho.getNombre());
			}
		}

		comboDespachos8 = new ArrayList<Long>();
		comboNombresDespachos8 = new ArrayList<String>();
		comboDespachos8.add(idsDespachosAsociadosAVentas[7]);
		comboNombresDespachos8.add(nombreDespachosAsociadosAVentas[7]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos8.contains(despacho.getId())){
				comboDespachos8.add(despacho.getId());
				comboNombresDespachos8.add(despacho.getNombre());
			}
		}

		comboDespachos9 = new ArrayList<Long>();
		comboNombresDespachos9 = new ArrayList<String>();
		comboDespachos9.add(idsDespachosAsociadosAVentas[8]);
		comboNombresDespachos9.add(nombreDespachosAsociadosAVentas[8]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos9.contains(despacho.getId())){
				comboDespachos9.add(despacho.getId());
				comboNombresDespachos9.add(despacho.getNombre());
			}
		}

		comboDespachos10 = new ArrayList<Long>();
		comboNombresDespachos10 = new ArrayList<String>();
		comboDespachos10.add(idsDespachosAsociadosAVentas[9]);
		comboNombresDespachos10.add(nombreDespachosAsociadosAVentas[9]);
		for(Despacho despacho : despachosActivos){
			if(!comboDespachos10.contains(despacho.getId())){
				comboDespachos10.add(despacho.getId());
				comboNombresDespachos10.add(despacho.getNombre());
			}
		}	
	}
	
	/* METODOS DE LA CLASE */	
	
//	public void asociasOrdenesDespachoAVentas(){
//		//ACA HAY QUE VERIFICAR EL VALOR SELECCIONADO PARA CADA COMBO
//		boolean operacionOK = controlador.asociarOrdenesDeDespachoAVentas(idsventasConOrdenesDeDespacho, idsdespachosAsociadosAVentas);
//		if(!operacionOK)
//			System.err.println("Error al asociar ordenes de despaco a ventas.");
//	}
	
	/* GETTERS Y SETTERS */
	
	public ArrayList<DespachoVentaPreventivo> getDespachoVentaPreventivos() {
		return despachoVentaPreventivos;
	}
	
	public void setDespachoVentaPreventivos(
			ArrayList<DespachoVentaPreventivo> despachoVentaPreventivos) {
		this.despachoVentaPreventivos = despachoVentaPreventivos;
	}
	
	public ArrayList<Long> getComboDespachos1() {
		return comboDespachos1;
	}
	
	public ArrayList<Long> getComboDespachos10() {
		return comboDespachos10;
	}
	
	public ArrayList<Long> getComboDespachos2() {
		return comboDespachos2;
	}
	
	public ArrayList<Long> getComboDespachos3() {
		return comboDespachos3;
	}
	
	public ArrayList<Long> getComboDespachos4() {
		return comboDespachos4;
	}
	
	public ArrayList<Long> getComboDespachos5() {
		return comboDespachos5;
	}
	
	public ArrayList<Long> getComboDespachos6() {
		return comboDespachos6;
	}
	
	public ArrayList<Long> getComboDespachos7() {
		return comboDespachos7;
	}
	
	public ArrayList<Long> getComboDespachos8() {
		return comboDespachos8;
	}
	
	public ArrayList<Long> getComboDespachos9() {
		return comboDespachos9;
	}
	
	public void setComboDespachos1(ArrayList<Long> comboDespachos1) {
		this.comboDespachos1 = comboDespachos1;
	}
	
	public void setComboDespachos10(ArrayList<Long> comboDespachos10) {
		this.comboDespachos10 = comboDespachos10;
	}
	
	public void setComboDespachos2(ArrayList<Long> comboDespachos2) {
		this.comboDespachos2 = comboDespachos2;
	}
	
	public void setComboDespachos3(ArrayList<Long> comboDespachos3) {
		this.comboDespachos3 = comboDespachos3;
	}
	
	public void setComboDespachos4(ArrayList<Long> comboDespachos4) {
		this.comboDespachos4 = comboDespachos4;
	}
	
	public void setComboDespachos5(ArrayList<Long> comboDespachos5) {
		this.comboDespachos5 = comboDespachos5;
	}
	
	public void setComboDespachos6(ArrayList<Long> comboDespachos6) {
		this.comboDespachos6 = comboDespachos6;
	}
	
	public void setComboDespachos7(ArrayList<Long> comboDespachos7) {
		this.comboDespachos7 = comboDespachos7;
	}
	
	public void setComboDespachos8(ArrayList<Long> comboDespachos8) {
		this.comboDespachos8 = comboDespachos8;
	}
	
	public void setComboDespachos9(ArrayList<Long> comboDespachos9) {
		this.comboDespachos9 = comboDespachos9;
	}
	
	public Long[] getCodigosVentas() {
		return codigosVentas;
	}
	
	public void setCodigosVentas(Long[] codigosVentas) {
		this.codigosVentas = codigosVentas;
	}
	
	public void setComboNombresDespachos1(
			ArrayList<String> comboNombresDespachos1) {
		this.comboNombresDespachos1 = comboNombresDespachos1;
	}
	
	public void setComboNombresDespachos10(
			ArrayList<String> comboNombresDespachos10) {
		this.comboNombresDespachos10 = comboNombresDespachos10;
	}
	
	public void setComboNombresDespachos2(
			ArrayList<String> comboNombresDespachos2) {
		this.comboNombresDespachos2 = comboNombresDespachos2;
	}
	
	public void setComboNombresDespachos3(
			ArrayList<String> comboNombresDespachos3) {
		this.comboNombresDespachos3 = comboNombresDespachos3;
	}
	
	public void setComboNombresDespachos4(
			ArrayList<String> comboNombresDespachos4) {
		this.comboNombresDespachos4 = comboNombresDespachos4;
	}
	
	public void setComboNombresDespachos5(
			ArrayList<String> comboNombresDespachos5) {
		this.comboNombresDespachos5 = comboNombresDespachos5;
	}
	
	public void setComboNombresDespachos6(
			ArrayList<String> comboNombresDespachos6) {
		this.comboNombresDespachos6 = comboNombresDespachos6;
	}
	
	public void setComboNombresDespachos7(
			ArrayList<String> comboNombresDespachos7) {
		this.comboNombresDespachos7 = comboNombresDespachos7;
	}
	
	public void setComboNombresDespachos8(
			ArrayList<String> comboNombresDespachos8) {
		this.comboNombresDespachos8 = comboNombresDespachos8;
	}
	
	public void setComboNombresDespachos9(
			ArrayList<String> comboNombresDespachos9) {
		this.comboNombresDespachos9 = comboNombresDespachos9;
	}
	
	public ArrayList<String> getComboNombresDespachos1() {
		return comboNombresDespachos1;
	}
	
	public ArrayList<String> getComboNombresDespachos10() {
		return comboNombresDespachos10;
	}
	
	public ArrayList<String> getComboNombresDespachos2() {
		return comboNombresDespachos2;
	}
	
	public ArrayList<String> getComboNombresDespachos3() {
		return comboNombresDespachos3;
	}
	
	public ArrayList<String> getComboNombresDespachos4() {
		return comboNombresDespachos4;
	}
	
	public ArrayList<String> getComboNombresDespachos5() {
		return comboNombresDespachos5;
	}
	
	public ArrayList<String> getComboNombresDespachos6() {
		return comboNombresDespachos6;
	}
	
	public ArrayList<String> getComboNombresDespachos7() {
		return comboNombresDespachos7;
	}
	
	public ArrayList<String> getComboNombresDespachos8() {
		return comboNombresDespachos8;
	}
	
	public ArrayList<String> getComboNombresDespachos9() {
		return comboNombresDespachos9;
	}
	
	public void setIdsDespachosAsociadosAVentas(
			Long[] idsDespachosAsociadosAVentas) {
		this.idsDespachosAsociadosAVentas = idsDespachosAsociadosAVentas;
	}
	
	public Long[] getIdsDespachosAsociadosAVentas() {
		return idsDespachosAsociadosAVentas;
	}
	
	public void setIdsVentas(Long[] idsVentas) {
		this.idsVentas = idsVentas;
	}
	
	public Long[] getIdsVentas() {
		return idsVentas;
	}
	
	public String[] getNombreDespachosAsociadosAVentas() {
		return nombreDespachosAsociadosAVentas;
	}
	
	public void setNombreDespachosAsociadosAVentas(
			String[] nombreDespachosAsociadosAVentas) {
		this.nombreDespachosAsociadosAVentas = nombreDespachosAsociadosAVentas;
	}
	
	public long getIdVenta1() {
		return idVenta1;
	}
	
	public long getIdVenta10() {
		return idVenta10;
	}
	
	public long getIdVenta2() {
		return idVenta2;
	}
	
	public long getIdVenta3() {
		return idVenta3;
	}
	public long getIdVenta4() {
		return idVenta4;
	}
	public long getIdVenta5() {
		return idVenta5;
	}
	public long getIdVenta6() {
		return idVenta6;
	}
	public long getIdVenta7() {
		return idVenta7;
	}
	public long getIdVenta8() {
		return idVenta8;
	}
	public long getIdVenta9() {
		return idVenta9;
	}
	public void setIdVenta1(long idVenta1) {
		this.idVenta1 = idVenta1;
	}
	
	public void setIdVenta10(long idVenta10) {
		this.idVenta10 = idVenta10;
	}
	public void setIdVenta2(long idVenta2) {
		this.idVenta2 = idVenta2;
	}
	public void setIdVenta3(long idVenta3) {
		this.idVenta3 = idVenta3;
	}
	public void setIdVenta4(long idVenta4) {
		this.idVenta4 = idVenta4;
	}
	
	public void setIdVenta5(long idVenta5) {
		this.idVenta5 = idVenta5;
	}
	public void setIdVenta6(long idVenta6) {
		this.idVenta6 = idVenta6;
	}
	public void setIdVenta7(long idVenta7) {
		this.idVenta7 = idVenta7;
	}
	public void setIdVenta8(long idVenta8) {
		this.idVenta8 = idVenta8;
	}
	public void setIdVenta9(long idVenta9) {
		this.idVenta9 = idVenta9;
	}
	
}
