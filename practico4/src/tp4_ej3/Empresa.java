package tp4_ej3;

import java.util.ArrayList;

public class Empresa {

	public static final int SEMANA = 7;
	
	private String nombre;
	private ArrayList<Empleado>empleados;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
	}

	public String listaEmpleados() {
		String listado = "SUELDOS: \n";
		for(int i = 0; i<empleados.size(); i++) {
			listado += "Nombre: " + empleados.get(i).getNombre() + " - Sueldo: " + empleados.get(i).getSueldo() + "\n";   //POLIMORFISMO Y BINDING DINAMIC.
		}
		return listado;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addEmpleado(Empleado e) {
		if(!empleados.contains(e)) {
			empleados.add(e);
		}
	}
}
