package tp5_ej6;

import java.util.ArrayList;

public class  Trabajo {

	public static final String POSTER = "poster";
	private String nombre;
	protected ArrayList<String>palabrasClaves;
	public Trabajo(String nombre) {
		super();
		this.nombre = nombre;
		this.palabrasClaves = new ArrayList<String>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addPalabra(String p) {
		if(!palabrasClaves.contains(p)) {
			palabrasClaves.add(p);
		}
	}
	//RETORNO UN ARRAY AUXILIAR DE PALABRAS CLAVES
	public ArrayList<String> getPalabrasClaves() {
		ArrayList<String> aux = new ArrayList<String>();
		for(int i =0; i< palabrasClaves.size();i++) {
			String pal = palabrasClaves.get(i);
				aux.add(pal);
		}
		
		return aux;
	}
	
	//TENGO QUE CHEQUEAR SI ES POSTER PARA QUE NO BUSQUE MAS EN LOS CONOCIMIENTOS DEL EVALUADOR SI YA SE PUDO EVALUAR.
	public boolean esPoster() {
		return getNombre().equals(POSTER);
	}
	/* if(getNombre().equals(POSTER)) {
		return true;
			}
		return false; */
	
	//UN TRABAJO (resumen o articulo) SE PUEDE EVALUAR SI SE CONOCEN TODOS LOS TEMAS
	public boolean sePuedeEvaluar(String tema) {
		return this.palabrasClaves.contains(tema);
	}
	
	//AGREGO ESTE METODO PORQUE SI TODOS LOS CONOCIMIENTOS DEL EVALUADOR ESTAN OK PERO EN PALABRAS CLAVES HAY MAS ME DA TRUE Y TENDRIA QUE DAR FALSE
	public boolean coincidenPalabrasClavesConConocimientos(Evaluador e) {
		for(int i= 0; i<palabrasClaves.size();i++) {
			String p = palabrasClaves.get(i);
			if(!e.coinciden(p)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(Object o) {
		try {
			Trabajo t = (Trabajo)o;
			return t.getNombre().equals(nombre);
		}catch(Exception e) {
			return false;
		}
	}
	
}
