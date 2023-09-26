package tp5_ej3;

import java.util.ArrayList;

public class Cooperativa {

	public static final String MINERAL_ESPECIAL = "Sodio";
	
	private String nombre;
	private ArrayList<Cereal> cereales;
	private ArrayList<Lote> lotes;
	private ArrayList<String> minerales;
	
	public Cooperativa(String nombre) {
		super();
		this.nombre = nombre;
		this.cereales = new ArrayList<Cereal>();
		this.lotes = new ArrayList<Lote>();
		this.minerales = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//AGREGO CEREAL Y LOTE
	
	public void addCereal(Cereal c) {
		if(!cereales.contains(c)) {
			cereales.add(c);
		}
	}
	
	public void addLote(Lote l) {
		if(!lotes.contains(l)) {
			lotes.add(l);
		}
	}
	
	public void addMineral(String min) {
		if(!minerales.contains(min)) {
			minerales.add(min);
		}
	}
	
	public String listadoCereales(Lote l1) {
		String listado = "Cereales que pueden estar en ese lote:\n";
		for (int i=0; i<cereales.size();i++) {
			if(cereales.get(i).puedeEstarEnLote(l1)) {
				listado += "Nombre: " + cereales.get(i).getNombre() + "\n";
			}
		}
		return listado;
	}
	
	//2) en qué lotes se puede sembrar un determinado cereal
	public boolean puedeEstarCereal(Cereal c, Lote l) {
		if(c.leGustaLote(l)) {
			return true;
		}
		else return false;
	}
	
	//UN LOTE ES ESPECIAL SI TIENE FOSFORO COMO MINERAL
	public boolean esEspecial(Lote l) {
		return l.tieneMineral(MINERAL_ESPECIAL);
	}
}
