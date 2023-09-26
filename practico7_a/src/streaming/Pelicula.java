package streaming;

import java.util.ArrayList;

public class Pelicula {

	private String titulo, sinopsis, genero, director;
	private int anioEstreno, duracionMinutos, edadMinimaRequerida;
	private ArrayList<String> actores;
	
	public Pelicula(String titulo, String sinopsis, String genero, String director, int anioEstreno, int duracionMinutos, int edadMinimaRequerida) {
		this.titulo = titulo;
		this.sinopsis = sinopsis;
		this.genero = genero;
		this.director = director;
		this.anioEstreno = anioEstreno;
		this.duracionMinutos = duracionMinutos;
		this.edadMinimaRequerida = edadMinimaRequerida;
		this.actores = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(int anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public int getDuracionMinutos() {
		return duracionMinutos;
	}

	public void setDuracionMinutos(int duracionMinutos) {
		this.duracionMinutos = duracionMinutos;
	}

	public int getEdadMinimaRequerida() {
		return edadMinimaRequerida;
	}

	public void setEdadMinimaRequerida(int edadMinimaRequerida) {
		this.edadMinimaRequerida = edadMinimaRequerida;
	}
	
	public ArrayList<String> getActores(){
		return new ArrayList<String>(actores);
	}
	
	public void addActor(String a) {
		if(!actores.contains(a)) {
			actores.add(a);
		}
	}
	
	public boolean equals(Object o) {
		try {
			Pelicula p = (Pelicula)o;
			return p.getTitulo().equals(titulo);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return "Titulo: " + titulo + " - Sinopsis: " + sinopsis + " - Genero: " + genero;
	}
}
