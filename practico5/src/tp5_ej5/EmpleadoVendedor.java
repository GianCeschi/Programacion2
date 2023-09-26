package tp5_ej5;

public class EmpleadoVendedor extends Empleado {

	private int cantVentas;
	private int porcentajeExtra;
	
	public EmpleadoVendedor(String nombre, String apellido, long dni, double sueldoMensual, int cantVentas,int porcentajeExtra) {
		super(nombre, apellido, dni, sueldoMensual);
		this.cantVentas = cantVentas;
		this.porcentajeExtra = porcentajeExtra;
	}

	public int getCantVentas() {
		return cantVentas;
	}

	public void setCantVentas(int cantVentas) {
		this.cantVentas = cantVentas;
	}

	public int getPorcentajeExtra() {
		return porcentajeExtra;
	}

	public void setPorcentajeExtra(int porcentajeExtra) {
		this.porcentajeExtra = porcentajeExtra;
	}
	
	@Override
	public double getSueldoMensual() {
		double porcentaje = this.cantVentas * this.porcentajeExtra;
		double valorPorcentaje = (porcentaje/100) * super.getSueldoMensual();
		return super.getSueldoMensual() + valorPorcentaje;
		
	}
	
}
