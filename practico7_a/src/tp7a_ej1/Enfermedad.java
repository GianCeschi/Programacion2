package tp7a_ej1;

import java.util.ArrayList;

public class Enfermedad {

	private String nombre;
	private ArrayList<String> estadosPatalogicos;
	
	public Enfermedad(String nombre) {
		this.nombre = nombre;
		this.estadosPatalogicos = new ArrayList<String>();
	}

	/*Se considera que el
	  agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
	  contenidos por las acciones del producto químico.*/
	/*
	public boolean seContienenTodosEstadosPatologicos(ProductoQuimico pq) {
		return pq.getEstadosPatalogicos().containsAll(estadosPatalogicos);
	}*/ //MAL LA DELEGACION DE RESPONSABILIDADES.
	
	//ACA SE DELEGAN BIEN LAS RESPOSABILIDADES.
	public boolean esTratadaPor(ProductoQuimico pq) {
		for(int i=0; i<estadosPatalogicos.size();i++) {
			String estado = estadosPatalogicos.get(i);
			if(!pq.trataEnfermedad(estado)) {
				return false;
			}
		}
		return true;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<String> getEstadosPatalogicos(){
		return new ArrayList<String>(estadosPatalogicos);
	}
	
	public void addEstadoPatalogico(String e) {
		if(!estadosPatalogicos.contains(e)) {
			estadosPatalogicos.add(e);
		}
	}
	
	public boolean equals(Object o) {
		try {
			Enfermedad e = (Enfermedad)o;
			return e.getNombre().equals(nombre);
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Enfermedad [nombre=" + nombre + ", estadosPatalogicos=" + estadosPatalogicos + "]";
	}
	
}
