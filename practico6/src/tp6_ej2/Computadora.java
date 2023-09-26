package tp6_ej2;

public class Computadora implements ElementoCola {
	private double velocidadCpu;
	private String nombre;
	private Proceso proc;
	
	public Computadora(String nombre, double velocidadCpu) {
		this.velocidadCpu = velocidadCpu;
		this.nombre = nombre;
		proc = null; //CUANDO CREO LA COMPUTADORA EL PROCESO ESTA NULO.
	}

	public double getVelocidadCpu() {
		return velocidadCpu;
	}

	public String getNombre() {
		return nombre;
	}

	public void ejecutarProceso(Proceso p) {
		this.proc = p;
	}
	
	@Override
	public boolean esMayor(ElementoCola otro) {
		return this.getVelocidadCpu() > ((Computadora) otro).getVelocidadCpu();
	}
	
	
	@Override
	public String toString() {
		return "Computadora [velocidadCpu=" + velocidadCpu + ", nombre="
				+ nombre + "] \n";
	}
	
	
	
}

