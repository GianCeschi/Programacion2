package tp4_ej4;

import java.time.LocalDate;
import java.util.ArrayList;

public class SistemaSeleccion {

	private String nombreSelec;
	private ArrayList<Persona> personas;
	
	public SistemaSeleccion(String nombre) {
		this.nombreSelec = nombre;
		this.personas = new ArrayList<Persona>();
	}

	public String getNombreSelec() {
		return nombreSelec;
	}

	public void setNombreSelec(String nombreSelec) {
		this.nombreSelec = nombreSelec;
	}
	
	public void addPersona(Persona p) {
		if(!personas.contains(p)) {
			personas.add(p);
		}
	}
	
	public void removePersona(Persona p) {
		if(personas.contains(p)) {
			personas.remove(p);
		}
	}
	
	public String listado() {
		String lista = "Sistema Seleccion: \n";
		for(int i = 0; i<personas.size();i++) {
			lista += " Nombre: " + personas.get(i).getNombre() + "- Estado: " + personas.get(i).getEstado() +
					  " --- " +disponibilidadEvento(personas.get(i)) +" \n";
		}
		return lista;
	}
	
	public String disponibilidadEvento(Persona p) {
		String disponible = "";
		if(p.estaDisponible()) {
			disponible += "Esta disponible para evento";
		}
		else {
			disponible += "No esta disponible para evento";
		}
		return disponible;
	}
	
	public static void main(String []args) {
		SistemaSeleccion sis = new SistemaSeleccion("Argentina");
		Futbolista f1 = new Futbolista("Gian", "Ceschi", "En concentracion", 555, LocalDate.of(1998, 12, 23), "Volante", "Derecho", 29);
		Entrenador e1 = new Entrenador("Pablo", "Ceschi", "En pais de origen", 888, LocalDate.of(1973, 05, 25), 7);
		Masajista m1 = new Masajista("Pepe","Perez","ni idea", 999,LocalDate.of(1960, 12, 1), "Medico",20);
		
		sis.addPersona(f1);
		sis.addPersona(e1);
		sis.addPersona(m1);
		System.out.println(sis.listado());
	}
}
