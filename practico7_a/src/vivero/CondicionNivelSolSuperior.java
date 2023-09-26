package vivero;

public class CondicionNivelSolSuperior extends Condicion {

	private int nivelSol;
	
	public CondicionNivelSolSuperior(int nivelSol) {
		this.nivelSol = nivelSol;
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return planta.getSol()>nivelSol;
	}

}
