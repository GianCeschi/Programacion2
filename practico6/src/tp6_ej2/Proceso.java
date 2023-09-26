package tp6_ej2;

public class Proceso implements ElementoCola {

	private String nombre;
	private double memoriaRequerida;
	
	public Proceso(String nombre, double memoriaRequerida) {
		this.nombre = nombre;
		this.memoriaRequerida = memoriaRequerida;
	}

	public String getNombre() {
		return nombre;
	}

	public double getMemoriaRequerida() {
		return memoriaRequerida;
	}

	//ACA SI CASTEO A PROCESO PORQUE SI ESTA ACA TIENE QUE SER UN PROCESO Y EVALUAR POR PROCESO.
	@Override
	public boolean esMayor(ElementoCola otro) {
		return this.getMemoriaRequerida() > ((Proceso) otro).getMemoriaRequerida(); //NO HACER TRY CATCH PORQUE SI NO RECIBE UN PROCESO ESTARIA MAL Y RETORNAIA FALSE
	}										//TENGO QUE CASTEAR SI O SI PORQUE LE PASE UN ELEMENTO COLA Y NO UN PROCESO.
	
	@Override
	public boolean equals(Object otro) {
		try {
			Proceso p1 = (Proceso)otro;
			return p1.getNombre().equals(nombre) && p1.getMemoriaRequerida() == memoriaRequerida;
		} catch(Exception e) {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Proceso [nombre=" + nombre + ", memoriaRequerida=" + memoriaRequerida + "]";
	}
	
}
