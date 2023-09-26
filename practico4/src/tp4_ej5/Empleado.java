package tp4_ej5;

public class Empleado extends Persona{

	private int numeroLegajo;
	private double sueldo;
	
	public Empleado(String nombre, String apellido, String cargo, int edad, int nroLegajo,double sueldo) {
		super(nombre,apellido,cargo,edad);
		this.numeroLegajo = nroLegajo;
		this.sueldo = sueldo;
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
	
	
}
