package tp5_ej3;

import java.util.ArrayList;

public class Cereal {

	private String nombre;
	private ArrayList<String> minerales;
	
	public Cereal(String nombre) {
		this.nombre = nombre;
		this.minerales = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//AGREGO MINERALES.
	public void addMineral(String mineral) {
		if(!minerales.contains(mineral)) {
			minerales.add(mineral);
		}
	}
	
	//ELIMINO MINERALES.
	public void removeMineral(String mineral) {
		if(minerales.contains(mineral)) {
			minerales.remove(mineral);
		}
	}
	
	//TENGO QUE VER SI LE GUSTA EL LOTE
	public boolean leGustaLote(Lote l) {
		for(int i = 0; i<minerales.size();i++) {
			if(!l.tieneMineral(minerales.get(i))) {
				return false;
			}
		}
		return true;
	}
	
	//1) qué cereales pueden sembrarse en un determinado lote

	public boolean puedeEstarEnLote(Lote l) {
		if(leGustaLote(l)) {
			return true;
		}
		else return false;
	}
	
	//HAGO METODOS EQUALS DE OBJETO CEREAL 
	public boolean equals(Object o1) {
		try {
			Cereal c = (Cereal)o1;
			return c.getNombre().equals(nombre);

		}
		catch(Exception e) {
			return false;
		}
	}

}
