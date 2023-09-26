package tp4_ej5;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Persona> personas;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.personas = new ArrayList<Persona>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String ListadoAsociados() {
		String listado = "Asociados a la empresa: \n";
		for(int i =0; i<personas.size();i++) {
			listado += "Cargo: " + personas.get(i).getCargo() + " - Nombre: " + personas.get(i).getNombre() + " - Apellido: " 
					+ personas.get(i).getApellido() + " - Edad: " + personas.get(i).getEdad() + "\n";
		}
		return listado;
	}

	public void addPersona(Persona p){
		if(!personas.contains(p)) {
			personas.add(p);
		}
	}
}
