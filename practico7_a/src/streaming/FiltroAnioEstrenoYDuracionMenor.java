package streaming;

public class FiltroAnioEstrenoYDuracionMenor extends Filtro {

	private int anioEstreno, duracion;
	
	public FiltroAnioEstrenoYDuracionMenor(int anioEstreno, int duracion) {
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getAnioEstreno()<anioEstreno && peli.getDuracionMinutos()<duracion;
	}

}
