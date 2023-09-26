package tp4_ej5;

import java.util.ArrayList;

public class Jerarquico extends Persona {

	private int numeroLegajo;
	private double sueldo;
	ArrayList<Empleado>empleadosCargo;
	
	public Jerarquico (String nombre, String apellido, String cargo, int edad, int nroLegajo,double sueldo) {
		super(nombre, apellido, cargo, edad);
		this.numeroLegajo = nroLegajo;
		this.sueldo = sueldo;
		this.empleadosCargo = new ArrayList<Empleado>();
	}

	public int getNumeroLegajo() {
		return numeroLegajo;
	}

	public void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String listaEmpleadosACargo() {
		String lista = "Empleados a cargo del señor "+ this.getNombre() + ": \n";  //this para sacar el nombre del jerarquico.
		for(int i= 0; i<empleadosCargo.size(); i++) {
			lista += "Nombre: " + empleadosCargo.get(i).getNombre() + " - Apellido: " + empleadosCargo.get(i).getApellido() + 
					" Numero Legajo: " + empleadosCargo.get(i).getNumeroLegajo() + "\n";
		}
		return lista;
	}
	
	public void addEmpleado(Empleado e) {
		if(!empleadosCargo.contains(e)) {
			empleadosCargo.add(e);
		}
	}
}
