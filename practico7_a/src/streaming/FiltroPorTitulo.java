package streaming;

public class FiltroPorTitulo extends Filtro {

	private String palabra;
	
	public FiltroPorTitulo(String palabra) {
		this.palabra = palabra.toLowerCase();
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getTitulo().toLowerCase().contains(palabra);
	}

}
