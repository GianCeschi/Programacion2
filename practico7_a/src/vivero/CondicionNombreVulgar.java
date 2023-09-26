package vivero;

public class CondicionNombreVulgar extends Condicion {

	private String nombreVulgar;
	
	public CondicionNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;  // EN LOS ARRAYLIST NO ME FUNCIONA EL .toLowerCase();
	}
	@Override
	public boolean cumple(Planta planta) {
		return planta.getNombresVulgares().contains(nombreVulgar);
	}

}
