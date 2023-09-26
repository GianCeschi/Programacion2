package streaming;

public class Posterior2017ExceptoInfantil_Documental extends Rentabilidad {

	private int anio;
	private String genero1;  //Infantil
	private String genero2;	//Documental
	
	public Posterior2017ExceptoInfantil_Documental(int anio, String genero1, String genero2) {
		this.anio = anio;
		this.genero1 = genero1.toLowerCase();
		this.genero2 = genero2.toLowerCase();
	}
	@Override
	public boolean esRentable(Pelicula peli) {
		return peli.getAnioEstreno()>anio || peli.getGenero().toLowerCase().equals(genero1)  ||  peli.getGenero().toLowerCase().equals(genero2);
	}

}
