package tp5_ej5;

import java.util.ArrayList;

public class Empresa {

	private ArrayList<Empleado> empleados;
	private String nombre;
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		this.empleados = new ArrayList<Empleado>();
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
	
	public void removeEmpleado(Empleado e) {
		if(empleados.contains(e)) {
			empleados.remove(e);
		}
	}
	
	public double gastosEnSueldos() {
		double suma = 0;
		for(int i=0; i<empleados.size();i++) {
			Empleado e = empleados.get(i);
			suma += e.getSueldoMensual();
		}
		return suma;
	}
	
	public String listado() {
		String lista= "Listado empleados con su sueldo: \n";
		for(int i=0; i<empleados.size();i++) {
			lista+= "Nombre: " + empleados.get(i).getNombre() + " - Sueldo Mensual: " + empleados.get(i).getSueldoMensual() + "\n";
		}
		return lista;
	}
	
	public String toString() {
		return "La suma de todos los sueldos es de: $" + gastosEnSueldos();
	}
}
