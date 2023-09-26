package tp5_ej5;

public class Empleado {

	private String nombre, apellido;
	private long dni;
	private double sueldoMensual;
	
	public Empleado(String nombre, String apellido, long dni, double sueldoMensual) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sueldoMensual = sueldoMensual;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public double getSueldoMensual() {
		return sueldoMensual;
	}

	public void setSueldoMensual(double sueldoMensual) {
		this.sueldoMensual = sueldoMensual;
	}

	public boolean equals (Object o) {
		try {
			Empleado e = (Empleado)o;
			return ((e.getNombre().equals(nombre)) && (e.getApellido().equals(apellido)) && (e.getDni()==dni));
		}
		catch(Exception e) {
			return false;
		}
	}
}
