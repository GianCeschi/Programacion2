package tp5_ej6;

import java.util.ArrayList;


public class Comite {
	
	//LOS TEMAS PARA EXPERTOS Y GENERALES LO PONE EL CONGRESO.
	
	private  ArrayList<String> temasExpertos;
	private  ArrayList<String> temasGenerales;
	private String nombre;
	private ArrayList<Evaluador>evaluadores;
	
	public Comite(String nombre) {
		this.nombre = nombre;
		this.evaluadores = new ArrayList<Evaluador>();
		this.temasExpertos = new ArrayList<String>(); //ARRAYLIST CON LOS TEMAS QUE SE CONSIDERAN EXPERTOS O GENERALES
		this.temasGenerales = new ArrayList<String>();// ESTO NO ES TAN IMPORTANTE A LA HORA DE RESOLVER EL EJERCICIO PERO SI PARA PROBARLO
	}

	
	public void addTemasExpertos(String tema) {
		this.temasExpertos.add(tema);
	}
	
	public void addTemasGenerales(String tema) {
		this.temasGenerales.add(tema);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEvaluador(Evaluador e){
		if(!evaluadores.contains(e)) {
			evaluadores.add(e);
		}
	}
	//1)qué evaluador puede asignarse a un determinado trabajo:
	
	//2) qué trabajos pueden asignarse un evaluador particular:
	
	//ESTE METODO FUNCIONA PARA LOS DOS PUNTOS.  (CONSULTAR).
	
	public boolean estaApto(Evaluador e, Trabajo t) {
		return e.estaApto(t);
	}
	
	public boolean esExperto(Evaluador e) {
		for(String tema : temasExpertos) {
			if(!e.conoce(tema)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean esGeneral(Evaluador e) {
		for(String tema : temasGenerales) {
			if(!e.conoce(tema)) {
				return false;
			}
		}
		return true;
	}
	
	public int cantTrabajos(Evaluador e) {
		return e.cantTrabajos();
	}
}
