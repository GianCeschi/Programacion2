package streaming;

public class FiltroGeneroEspecifico extends Filtro {

	private String genero;
	
	public FiltroGeneroEspecifico(String genero) {
		this.genero = genero.toLowerCase();
	}
	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getGenero().toLowerCase().equals(genero);
	}

}
