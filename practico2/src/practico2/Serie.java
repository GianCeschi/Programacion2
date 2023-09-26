package practico2;

import java.util.ArrayList;
/*1 Series
Una Serie está formada por un conjunto de temporadas, cada una de las cuales tiene una
cantidad de episodios. Cada episodio posee un título, una descripción, un flag indicando
si ya se vio el episodio y una calificación dada (con valores de 1 a 5). Si no se vio un
episodio particular, la calificación dada será un valor negativo.
Las series poseen como atributos (además de los episodios correspondientes) un título,
una descripción, un creador y un género.
Implementar en Java las clases involucradas, determinar qué clase es responsable de
responder los siguientes servicios e implementar en Java.
● Ingresar la calificación de un episodio. Si el valor ingresado como calificación
no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior.
● Obtener el total episodios vistos de una temporada particular.
● Obtener el total de episodios vistos de una serie.
● Obtener el promedio de las calificaciones dadas para una temporada particular.
● Obtener el promedio de las calificaciones dadas para una serie.
● Determinar si se vio todos los episodios de la serie.
Nota. Para calcular los promedios, tener sólo en cuenta los episodios vistos */

public class Serie {

	
	private ArrayList <Temporada> temporadas; //NO HAGO GETTER Y SETTER DEL ARRAY
	private String titulo;
	private String descripcion;
	private String creador;
	private String genero;
	
	public Serie(String titulo,String creador, String genero) {
		this.titulo = titulo;
		this.creador = creador;
		this.genero = genero;
		this.temporadas = new ArrayList<Temporada>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getCreador() {
		return creador;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//Obtener el total de episodios vistos de una serie
	
	public void addTemporada(Temporada t) {
		if(!this.temporadas.contains(t)) {
			this.temporadas.add(t);
		}
	}
	
	public int getEpisodiosVistosSerie() {
		int cant = 0;
		for(int i =0; i<temporadas.size();i++) {
		  Temporada t =/*(Temporada)*/ temporadas.get(i);
		  cant += t.getEpisodiosVistos();
		}
		return cant;
	}
}
