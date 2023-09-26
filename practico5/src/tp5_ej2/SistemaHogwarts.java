package tp5_ej2;

import java.util.ArrayList;

public class SistemaHogwarts {

	private String nombre;
	private ArrayList<Casa>casas;
	
	public SistemaHogwarts(String nombre) {
		this.nombre = nombre;
		this.casas = new ArrayList<Casa>();
	}
	
	public void addCasa(Casa c) {
		if(!casas.contains(c)) {
			casas.add(c);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Casa> listadoCasas() {
		
		return  new ArrayList<Casa>(this.casas);
		
		/*String listado = "Listado casas: \n";
		
		return listado;*/
	}
	
	
	 //COMO MUESTRO DESDE EL SISTEMA TODAS LAS CONSIGNAS.

}
