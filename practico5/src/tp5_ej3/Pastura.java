package tp5_ej3;

public class Pastura extends Cereal {

	public static final int SUPERFICIE_MINIMA = 50;

	public Pastura(String nombre) {
		super(nombre);
	}

	
	//CHEQUEA SI EL LOTE CUMPLE CON EL TAMANIO
	public boolean cumpleSuperficieMinima(Lote l) {
		if(l.getSuperficie()>SUPERFICIE_MINIMA) {
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean leGustaLote(Lote l) {
		if((super.leGustaLote(l))&&(cumpleSuperficieMinima(l))){
			return true;
		}
		else return false;
	}
	
	@Override
	public boolean puedeEstarEnLote(Lote l) {
		if(leGustaLote(l)) {
			return true;
		}
		else return false;
	}
}
