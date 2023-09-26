package tp5_ej5;

public class EmpleadoBono extends Empleado {

	public static final int MINIMO_VENTAS_50 = 50;
	public static final int MINIMO_VENTAS_100 = 100;
	public static final int ADICIONAL_50_VENTAS = 1000;
	public static final int ADICIONAL_100_VENTAS = 3000;
	
	private int cantVentas;

	public EmpleadoBono(String nombre, String apellido, long dni, double sueldoMensual, int cantVentas) {
		super(nombre, apellido, dni, sueldoMensual);
		this.cantVentas = cantVentas;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}
	
	@Override
	public double getSueldoMensual() {
		double suma = 0;
		if(cantVentas>=MINIMO_VENTAS_50 && cantVentas<MINIMO_VENTAS_100) {
			suma = super.getSueldoMensual() + ADICIONAL_50_VENTAS;
		}
		else if(cantVentas>=MINIMO_VENTAS_100) {
			suma += super.getSueldoMensual() + ADICIONAL_100_VENTAS;			//NO OLVIDAR EL SUPER SI HABLO DE SUELDO QUE ESTA EN EMPLEADO(PADRE)
		}
		else {
			return super.getSueldoMensual();
		}
		return suma;
	}
}
