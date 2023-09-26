package tp6_ej1;


public class Pelicula extends Item {

	private String titulo;
	private String genero;
	private int cantCopiasDisponible;
	
	
	public Pelicula(String titulo, String genero, int cantCopias) {
		this.titulo = titulo;
		this.genero = genero;
		this.cantCopiasDisponible = cantCopias;
	}
	
	
	public boolean estaDisponible() {
		if(!hayCopiasDisponibles()) { //SI NO HAY COPIAS O LA UNICA ESTA ALQUILADA.
			return false;
		}
		else return true;
	}
	
	public boolean estaLibre() {
		return false;			//ESTE METODO LO CREO PARA EL AUTO, ACA ESTA EN USO SIEMPRE ES FALSE.
	}

	public boolean hayCopiasDisponibles() {
		return this.cantCopiasDisponible>0;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getCantCopiasDisponible() {
		return cantCopiasDisponible;
	}


	public void setCantCopiasDisponible(int cantCopiasDisponible) {
		this.cantCopiasDisponible = cantCopiasDisponible;
	}

	public String toString() {
		return "Titulo: " + titulo + " - Genero: " + genero; 
	}
}
