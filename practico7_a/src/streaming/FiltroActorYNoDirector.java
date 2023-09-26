package streaming;

public class FiltroActorYNoDirector extends Filtro {

	private String actor, director;
	
	public FiltroActorYNoDirector(String actor, String director) {
		this.actor = actor; //PREGUNTAR COMO HACER LOWER CASE EN ARRAYLIST
		this.director = director;
	}
	@Override
	public boolean cumple(Pelicula peli) {
		return peli.getActores().contains(actor) && peli.getDirector()!=director;
	}

}
