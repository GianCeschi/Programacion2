package streaming;

import java.util.ArrayList;

public class PlataformaStreaming {

	private String nombre;
	private ArrayList<Pelicula>peliculas;
	private Filtro rent; //ESTO ES UN FILTRO NO CREO UNA CLASE RENTABILIDAD QUE TENGA EL MISMO METODO ABSTRACTO CUMPLE QUE SE LLAME DISTINTO(ES_RENTABLE)
	
	public PlataformaStreaming(String nombre, Filtro rent) {
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
		return rent.cumple(p);             //EJECUTO EL CUMPLE Y NO EL ES RENTABLE DE RENTABILIDAD QUE YA ELIMINE. QUEDA FEO DESPUES ESTO SE CORRIJE CON PATRON DISEÑO
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
	//CREO ESTE SET PARA CAMBIAR EN TIEMPO DE EJECUCION!!!
	public void setRentabilidad(Filtro rent) {
		this.rent = rent;
	}
}
