package vivero;

public class CondicionNivelSolInferior extends Condicion {

	private int nivelSol;
	
	public CondicionNivelSolInferior(int nivelSol) {
		this.nivelSol = nivelSol;
	}
	@Override
	public boolean cumple(Planta planta) {
		return planta.getSol()<nivelSol;
	}

}
