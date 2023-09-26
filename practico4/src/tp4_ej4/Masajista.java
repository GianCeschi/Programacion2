package tp4_ej4;

import java.time.LocalDate;

public class Masajista extends Persona {

	private String titulo;
	private int aniosExperiencia;
	
	public Masajista(String nombre, String apellido, String estado, int nroPasaporte, LocalDate nac, String titulo, int experiencia) {
		super(nombre, apellido, estado, nroPasaporte, nac);
		this.titulo = titulo;
		this.aniosExperiencia = experiencia;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	
	
}
