package vivero;

public class CondicionNombreCientifico extends Condicion {

	private String nombreCientifico;
	
	public CondicionNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico.toLowerCase();
	}
	@Override
	public boolean cumple(Planta planta) {
		return planta.getNombreCientifico().toLowerCase().contains(nombreCientifico);
	}

}
