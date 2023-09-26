package streaming;

import java.util.ArrayList;

public class PlataformaStreaming {

	private String nombre;
	private ArrayList<Pelicula>peliculas;
	private Rentabilidad rent; //VER SI ESTA BIEN 
	
	public PlataformaStreaming(String nombre, Rentabilidad rent) {
		this.nombre = nombre;
		this.rent = rent; //NO OLVIDAR DE HACER ESTO.
		this.peliculas = new ArrayList<Pelicula>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Pelicula> getPeliculas(){
		return new ArrayList<Pelicula>(peliculas);
	}
	
	public void addPelicula(Pelicula p) {
		if((!peliculas.contains(p))&&(esRentable(p))) {
			peliculas.add(p);
		}
	}
	//SE ADQUIERE UNA PELICULA SI ES RENTABLE PARA LA EMPRESA SEGUN LOS CRITERIOS QUE BAJEN LOS SUPERIORES.
	public boolean esRentable(Pelicula p) {
		return rent.esRentable(p);
	}
	
	public ArrayList<Pelicula> buscarPelicula(Filtro filtro){
		ArrayList<Pelicula> retorno = new ArrayList<Pelicula>();
		for(int i = 0; i<peliculas.size();i++) {
			Pelicula actual = peliculas.get(i);
			if(filtro.cumple(actual)) {
				retorno.add(actual);
			}
		}
		return retorno;
	}
}
