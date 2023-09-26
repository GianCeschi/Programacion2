package tp5_ej6;

import java.util.ArrayList;

public class Evaluador {

	private String nombre;
	private long dni;
	protected ArrayList<String>conocimientos;
	protected ArrayList<Trabajo>trabajos;
	
	public Evaluador(String nombre, long dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.conocimientos = new ArrayList<String>();
		this.trabajos = new ArrayList<Trabajo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}
	
	public void addConocimiento(String c) {
		if(!conocimientos.contains(c)) {
			conocimientos.add(c);
		}
	}
	
	//CANTIDAD DE TRABAJOS QUE TIENE UNA PERSONA.
	public void addTrabajo(Trabajo t) {
		if(!trabajos.contains(t)) {
			if(estaApto(t)) {
				trabajos.add(t);
			}
		}
	}
	
	public int cantTrabajos() {
		return this.trabajos.size();
	}
	
	//A ESTE METODO LE PASO UN TEMA Y CHEQUEO SI LO CONOCE. CON ESTO ME DOY CUENTA SI ES EXPERTO O GENERAL.
	public boolean conoce(String tema) {
		return this.conocimientos.contains(tema); //LE PASO UN TEMA Y LE PREGUNTO SI LO CONOCE
	}
	
	
	//EVALUADOR ES APTO PARA EVALUAR ESE TRABAJO. 
	public boolean estaApto(Trabajo t) {
		for(int i=0 ;i<conocimientos.size();i++) {
			String tema = conocimientos.get(i);
			if(!t.sePuedeEvaluar(tema)) {  				//PUEDE EVALUAR SI EN TRABAJO(ARTICULO Y RESUMEN) CONOCE TODOS LOS TEMAS.
				return false;
			}
			else if (t.esPoster()) {
				return true;
			}
			//SI ES UN POSTER Y YA SE PUEDE EVALUAR UNA VEZ TENDRIA QUE CORTAR EL FOR Y DECIR QUE ESTA APTO.
		}
		if(t.coincidenPalabrasClavesConConocimientos(this)) { //THIS ES EL EVALUADOR. --- && !t.esPoster() NO ES NECESARIO CHEQUEAR ESTO ACA.
			return true;
		}
		else return false;
	}
	
	
	//AGREGO ESTE METODO PORQUE SI TODOS LOS CONOCIMIENTOS DEL EVALUADOR ESTAN OK PERO EN PALABRAS CLAVES HAY MAS ME DA TRUE Y TENDRIA QUE DAR FALSE
	public boolean coinciden(String palabraClave) {
		return this.conocimientos.contains(palabraClave);
	}
	
	//APLICO EL METODO EQUALS DE IGUALDAD DE UN EVALUADOR.
	public boolean equals(Object o) {
		try {
			Evaluador e = (Evaluador)o;
			return e.getNombre().equals(nombre)&& e.getDni()==dni;
		}catch(Exception e) {
			return false;
		}
	}
	
}
