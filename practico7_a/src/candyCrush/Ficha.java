package candyCrush;

public class Ficha {
	private String nombre;
	private int fortaleza, espacioOcupado, poderDestruccion;
	
	public Ficha(String nombre, int fortaleza, int espacioOcupado) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.espacioOcupado = espacioOcupado;
		this.poderDestruccion = 0;
	}
	
	public Ficha(String nombre, int fortaleza, int espacioOcupado, int poderDestruccion) {
		this.nombre = nombre;
		this.fortaleza = fortaleza;
		this.espacioOcupado = espacioOcupado;
		this.poderDestruccion = poderDestruccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(int fortaleza) {
		this.fortaleza = fortaleza;
	}

	public int getEspacioOcupado() {
		return espacioOcupado;
	}

	public void setEspacioOcupado(int espacioOcupado) {
		this.espacioOcupado = espacioOcupado;
	}

	public int getPoderDestruccion() {
		return poderDestruccion;
	}

	public void setPoderDestruccion(int poderDestruccion) { 
		this.poderDestruccion = poderDestruccion;
	}

	@Override
	public String toString() {
		return "Ficha [nombre=" + nombre + "]" + " - PODERDESTRUCCION: " + poderDestruccion ;
	}
	
}
