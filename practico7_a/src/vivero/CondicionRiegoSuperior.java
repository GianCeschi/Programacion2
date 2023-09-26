package vivero;

public class CondicionRiegoSuperior extends Condicion {

	private int riego;
	
	public CondicionRiegoSuperior(int riego) {
		this.riego = riego;
	}
	@Override
	public boolean cumple(Planta planta) {
		return planta.getRiego()>riego;
	}

}
