package tp3_ej3;

import java.util.ArrayList;

public class Personaje {

	private String nombreReal;
	private String nombreSuper;
	private String categoria;
	private ArrayList<Cualidad>cualidades;
	
	public Personaje(String nombreReal, String nombreSuper, String categ) {
		this.nombreReal = nombreReal;
		this.nombreSuper = nombreSuper;
		this.categoria = categ;
		this.cualidades = new ArrayList<Cualidad>();
	}

	
	public ArrayList<Cualidad> getCualidades() {
		return cualidades;
	}


	public void setCualidades(ArrayList<Cualidad> cualidades) {
		this.cualidades = cualidades;
	}


	public void addCualidad(Cualidad c) {
		if(!cualidades.contains(c)) {
			cualidades.add(c);
		}
	}
	
	public void removeCualidad(Cualidad c) {
		if(cualidades.contains(c)) {
			cualidades.remove(c);
		}
	}
	
	public double getFuerza() {
		double cualidad = 0;
		for(int i = 0; i<cualidades.size();i++) {
			 cualidad = cualidades.get(i).getFuerza();
		}
		return cualidad;
	}
	
	public double getVelocidad() {
		double cualidad = 0;
		for(int i = 0; i<cualidades.size();i++) {
			 cualidad = cualidades.get(i).getVelocidad();
		}
		return cualidad;
	}
/*	PARA MEJORAR EL COD PODRIA HACER UN SOLO METODO PORQUE SINO SON LOS 4 SIMILARES.
	public double getCualidad(Cualidad c) {
		double cualidad = 0;
		for(int i= 0; i<cualidades.size();i++) {
			if(cualidades.get(i)==c.getVisionNocturna()) {
				cualidad += c.getVisionNocturna();
			}
		}
		return cualidad;
	}
	*/
	public String getNombreReal() {
		return nombreReal;
	}

	public void setNombreReal(String nombreReal) {
		this.nombreReal = nombreReal;
	}

	public String getNombreSuper() {
		return nombreSuper;
	}

	public void setNombreSuper(String nombreSuper) {
		this.nombreSuper = nombreSuper;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}
