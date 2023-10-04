package candyCrush;

import java.util.ArrayList;


public class Tablero {

	private int puntajeMinimo;  //PREGUNTAR SI ES NECESARIO HACER GET Y SET DE ESTO.
	private double dificultad;
	private ArrayList<Ficha> fichas;
	
	public Tablero(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
		this.dificultad = 0;  //ESTO PUEDE INICIAR EN 0 PERO LA MEJOR FORMA ES QUE YA SE CALCULE LA DIFICULTAD DE UNA, PERO ME DA ERROR NULL POINTER EX.
		this.fichas = new ArrayList<Ficha>();
	}
	
	public void addFicha(Ficha f) {
		fichas.add(f);   //NO DICE DE CHEQUEAR NADA ASI QUE LE DAMOS ADD.
	}
	
	public double dificultadTablero() { //getDificultad();
		return sumatoriaFortaleza()/sumatoriaPoderDestruccion();
	}
	
	//TIENEN QUE SER DOUBLES POR LA DIVISION.
	public double sumatoriaFortaleza() {
		double sumatoria =0.0;
		for(int i = 0; i<fichas.size();i++) {
			Ficha f = fichas.get(i);
			sumatoria += f.getFortaleza();
		}
		return sumatoria;
	}

	
	public double sumatoriaPoderDestruccion() {
		double sumatoria =0.0;
		for(int i = 0; i<fichas.size();i++) {
			Ficha f = fichas.get(i);
			sumatoria += f.getPoderDestruccion();
		}
		return sumatoria;
	}
	
	
	

	public int getPuntajeMinimo() {
		return puntajeMinimo;
	}

	public void setPuntajeMinimo(int puntajeMinimo) {
		this.puntajeMinimo = puntajeMinimo;
	}
	
	public ArrayList<Ficha> buscar(Condicion c){
		ArrayList<Ficha> retorno = new ArrayList<Ficha>();
		for(int i = 0; i<fichas.size();i++) {
			Ficha fActual = fichas.get(i);
			if(c.cumple(fActual)) {
				retorno.add(fActual);
			}
		}
		return retorno;
	}
}
