package streaming;

public class DuracionMenor120MinGeneroDistintoComedia extends Rentabilidad {

	private String genero;
	private int duracion;
	
	public DuracionMenor120MinGeneroDistintoComedia(String genero, int duracion) {
		this.genero = genero.toLowerCase();
		this.duracion = duracion;
	}
	@Override
	public boolean esRentable(Pelicula peli) {
		return peli.getDuracionMinutos()<duracion && peli.getGenero().toLowerCase()!=genero;
	}

}
