package vivero;

public class CondicionPocoRiego extends Condicion {

	private int riego;
	
	public CondicionPocoRiego(int riego) {
		this.riego = riego;
	}
	@Override
	public boolean cumple(Planta planta) {
		if(planta.isPlantaInterior()) {
			if(planta.getRiego()<riego) { //RIEGO SERIA LA CONDICION MINIMA OSEA EL 3.
				return true;
			}
		}
		return false;
	}

}
