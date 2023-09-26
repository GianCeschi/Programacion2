package vivero;

public class CondicionClasificacion extends Condicion {

	private String clasificacion;
	
	public CondicionClasificacion(String clasificacion) {
		this.clasificacion = clasificacion.toLowerCase();
	}
	
	@Override
	public boolean cumple(Planta planta) {
		return planta.getClasificacionSuperior().toLowerCase().equals(clasificacion);
	}

}
