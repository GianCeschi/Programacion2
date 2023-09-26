package vivero;

public class CondicionRiegoInferior extends Condicion {

	private int riego;
	
	public CondicionRiegoInferior(int riego) {
		this.riego = riego;
	}
	@Override
	public boolean cumple(Planta planta) {
		return planta.getRiego()<riego;
	}

}
