package tp3_ej3;

public class Cualidad {

	private int visionNocturna;
	private int velocidad;
	private int fuerza;
	private int edad;
	
	public Cualidad(int vision, int veloc, int fuerza, int edad) {
		this.visionNocturna = vision;
		this.velocidad = veloc;
		this.fuerza = fuerza;
		this.edad = edad;
	}

	public int getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(int visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
