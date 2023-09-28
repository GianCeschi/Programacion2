package streaming;

//ESTA ES UNA CLASE QUE HEREDA DE FILTRO. DESPUES CON PATRONES DE DISEÑO. VEMOS ESTOS DETALLES
public class DuracionMenor120MinGeneroDistintoComedia extends Filtro {

	private String genero;
	private int duracion;
	
	public DuracionMenor120MinGeneroDistintoComedia(String genero, int duracion) {
		this.genero = genero.toLowerCase();
		this.duracion = duracion;
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getDuracionMinutos()<duracion && peli.getGenero().toLowerCase()!=genero;
	}

}
