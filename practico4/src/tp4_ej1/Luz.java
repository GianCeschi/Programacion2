package tp4_ej1;

public class Luz {

private String nombre;
	
	public Luz(String nombre){
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void encender() {
		System.out.println("Luz encendida");
	}
}
