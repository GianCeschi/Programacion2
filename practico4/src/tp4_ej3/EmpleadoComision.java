package tp4_ej3;


public class EmpleadoComision extends Empleado {

	private int cantVentas;
	private double porcentaje;
	
	public EmpleadoComision(int cantVentas, double porcentaje, String nombre, int sueldo) {
		super(nombre,sueldo);
		this.cantVentas = cantVentas;
		this.porcentaje = porcentaje;
	}
	@Override
	public double getSueldo() { //sueldoConComision() PERO SE TIENE QUE LLAMAR IGUAL AL QUE HEREDA PARA QUE ENTRE EL POLIMORFISMO
		double porcentaje = porcentajePorComision(); //PORCENTAJE.
		double valorPorcentaje = (porcentaje/100.0) * super.getSueldo(); //LE SACO EL PORCENTAJE SEGUN EL SUELDO.
		return super.getSueldo() + valorPorcentaje; //HAGO EL SUPER PORQUE ES EL METODO QUE HEREDA 
	}
	
	public double porcentajePorComision() {
		return getPorcentaje()*getCantVentas();
	}
	
	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public double getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}
	
}
