package practico2;

import java.util.ArrayList;

public class Temporada {

	private int numTemporada;
	private ArrayList <Episodio> episodios; //Creo un arreglo de episodios.
	//private Episodio [] episodios;
	
	public Temporada(int numTemporada) {
		this.numTemporada = numTemporada;
		this.episodios = new ArrayList<Episodio>(); //tengo que instanciar el arraylist en el constructor siempre!
	}
	
	//PARA SABER SI ESTAN VISTOS PRIMERO TENGO QUE AGREGAR LOS EPISODIOS A UN ARREGLO

	public void addEpisodio(Episodio e) {
		if(!this.episodios.contains(e)) {
			this.episodios.add(e);
		}
	}


	//Obtener el total episodios vistos de una temporada particular

	public int getEpisodiosVistos() {
		int contador = 0;
		for(int i=0; i<episodios.size();i++) {
			Episodio ep = episodios.get(i);
			if(ep.getVisto()) {
				contador++;
			}
		}
		return contador;
	}
	
	//Obtener el promedio de las calificaciones dadas para una temporada particular.
	
	public double getCalificacionTemporada() {
		double suma =0;
		int cont=0;
		for(int i=0; i<episodios.size();i++) {
			Episodio e = /*(Episodio)*/episodios.get(i); //PORQUE CASTEAR A EPISODIO?
			if(e.getCalificacion()>0) {
				suma+=e.getCalificacion();
				cont++;
			}
		}
		double promedio = suma/ (double)cont;
		return promedio;
	}

	public int getNumTemporada() {
		return numTemporada;
	}

	public void setNumTemporada(int numTemporada) {
		this.numTemporada = numTemporada;
	}

}
