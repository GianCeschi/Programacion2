package tp5_ej3;

import java.util.ArrayList;

public class Lote {

	private int superficie;
	private ArrayList<String> minerales;
	
	public Lote(int superficie) {
		this.superficie = superficie;
		this.minerales = new ArrayList<String>();
	}

	public int getSuperficie() {
		return superficie;
	}

	public void setSuperficie(int superficie) {
		this.superficie = superficie;
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
	
	
	//CHEQUEO SI EL LOTE TIENE EL MINERAL DEL CEREAL.
	public boolean tieneMineral(String mineral) {
		return minerales.contains(mineral);
	}
	
	//CHEQUEO METODO EQUALS DE LOTE.
	public boolean equals(Object o1) {
		try {
			Lote l = (Lote)o1;
			return l.getSuperficie() == superficie;

		}
		catch(Exception e) {
			return false;
		}
	}
}
