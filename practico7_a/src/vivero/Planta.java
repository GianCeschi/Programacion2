package vivero;

import java.util.ArrayList;

public class Planta {
	private String nombreCientifico, clasificacionSuperior,familia,clase;
	private ArrayList<String>nombresVulgares;
	private int riego,sol;
	private boolean plantaInterior;
	public Planta(String nombreCientifico, String clasificacionSuperior, String familia, String clase, int riego,int sol, boolean plantaInterior) {
		super();
		this.nombreCientifico = nombreCientifico;
		this.clasificacionSuperior = clasificacionSuperior;
		this.familia = familia;
		this.clase = clase;
		this.riego = riego;
		this.sol = sol;
		this.plantaInterior = plantaInterior;
		this.nombresVulgares = new ArrayList<String>();
	}
	
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public String getClasificacionSuperior() {
		return clasificacionSuperior;
	}
	public void setClasificacionSuperior(String clasificacionSuperior) {
		this.clasificacionSuperior = clasificacionSuperior;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	public String getClase() {
		return clase;
	}
	public void setClase(String clase) {
		this.clase = clase;
	}
	public int getRiego() {
		return riego;
	}
	public void setRiego(int riego) {
		this.riego = riego;
	}
	public int getSol() {
		return sol;
	}
	public void setSol(int sol) {
		this.sol = sol;
	}
	public boolean isPlantaInterior() {
		return plantaInterior;
	}
	public void setPlantaInterior(boolean plantaInterior) {
		this.plantaInterior = plantaInterior;
	}
	
	public void addNombreVulgar(String nv) {
		if(!nombresVulgares.contains(nv)) {
			nombresVulgares.add(nv);
		}
	}
	
	public ArrayList<String> getNombresVulgares(){
		return new ArrayList<String>(nombresVulgares);
	}
	
	public boolean equals(Object o) {
		try {
			Planta p = (Planta)o;
			return p.getNombreCientifico().equals(nombreCientifico);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return "Nombre cientifico: " + nombreCientifico + " - Clasificacion: " + clasificacionSuperior + " - Familia: " + familia + " - Nombres Vulgares: " 
				+ nombresVulgares;
	}
	
	
	
}
