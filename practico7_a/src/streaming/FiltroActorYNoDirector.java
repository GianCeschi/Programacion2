package streaming;

public class FiltroActorYNoDirector extends Filtro {

	private String actor, director;
	
	public FiltroActorYNoDirector(String actor, String director) {
		this.actor = actor; //PREGUNTAR COMO HACER LOWER CASE EN ARRAYLIST ---> Y ME SURGIA ESTE ERROR.
		this.director = director;
	}
	/*
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getActores().contains(actor) && peli.getDirector()!=director;  ANTES HACIA ESTO, PERO ESTARIA DELEGANDO MAL LAS RESPONSABILIDADES
	}*/

	
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.contieneActor(actor)&& peli.getDirector()!=director;
	}
}
