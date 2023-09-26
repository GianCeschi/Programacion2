package tp4_ej1;

public class Timbre {

	private String nombre;
	
	public Timbre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void hacerSonar() {
		System.out.println("pi-pi-pi-pi");
	}
	
}
