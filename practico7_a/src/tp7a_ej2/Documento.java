package tp7a_ej2;

import java.util.ArrayList;


public class Documento {

	private String titulo;
	private String contenidoTextual;
	private ArrayList<String> autores;
	private ArrayList<String> palabrasClaves;
	
	public Documento(String titulo, String contenido) {
		this.titulo = titulo;
		this.contenidoTextual = contenido;
		this.autores = new ArrayList<String>();
		this.palabrasClaves = new ArrayList<String>();
	}

	public void addAutor(String autor) {
		if(!autores.contains(autor)) {
			autores.add(autor);
		}
	}
	
	public ArrayList<String>getAutores(){
		return new ArrayList<String>(autores);
	}
	
	public void addPalabraClave(String pal) {
		if(!palabrasClaves.contains(pal)) {
			palabrasClaves.add(pal);
		}
	}

	//DEVUELVO LAS PALABRAS CLAVES EN UN ARRAYLIST AUX
	public ArrayList<String> getPalabrasClaves() {
		return new ArrayList<>(palabrasClaves);
	}

	public boolean contienePalabraClave(String palabra) {
		for(int i= 0; i<palabrasClaves.size(); i++) {
			String clave = palabrasClaves.get(i);
			if(clave.equalsIgnoreCase(palabra)) {
				return true;
			}
		}
		return false;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getContenidoTextual() {
		return contenidoTextual;
	}

	public void setContenidoTextual(String contenidoTextual) {
		this.contenidoTextual = contenidoTextual;
	}
	
	//DOS DOCUMENTOS SON IGUALES SI TIENEN EL MISMO TITULO.
	public boolean equals(Object o) {
		try {
			Documento doc = (Documento)o;
			return doc.getTitulo().equals(titulo) && doc.getContenidoTextual().equals(contenidoTextual);
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public String toString() {
		return "Titulo: " + titulo + " - Contenido: " + contenidoTextual;
	}
}
