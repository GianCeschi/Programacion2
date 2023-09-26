package tp4_ej3;

public class EmpleadoHoraExtra extends Empleado {

	private int cantHoras;
	private int pagoHora;
	
	public EmpleadoHoraExtra(int cantHoras,int pagoHora,String nombre,double sueldo) {
		super(nombre,sueldo);
		this.cantHoras = cantHoras;
		this.pagoHora = pagoHora;
	}

	@Override  // ESTE METODO SE TIENE QUE LLAMAR GET SUELDO PARA QUE ENTRE EN EL POLIMORFIMO Y SELECCIONE SEGUN EL TIPO DE EMPLEADO.
	public double getSueldo() {  //sueldoHorasExtras() ---> ASI SE LLAMABA ANTES.
		return (cantHoras*pagoHora) + super.getSueldo();  //super porque hereda un sueldo 
	}
	
	public int getCantHoras() {
		return cantHoras;
	}

	public void setCantHoras(int cantHoras) {
		this.cantHoras = cantHoras;
	}

	public int getPagoHora() {
		return pagoHora;
	}

	public void setPagoHora(int pagoHora) {
		this.pagoHora = pagoHora;
	}
	
	
}
