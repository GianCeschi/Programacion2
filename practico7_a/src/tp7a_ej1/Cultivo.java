package tp7a_ej1;

import java.util.ArrayList;

public class Cultivo {

	private String nombre;
	private ArrayList<Enfermedad> enfermedadesFrecuentes;
	
	public Cultivo(String nombre) {
		this.nombre = nombre;
		this.enfermedadesFrecuentes = new ArrayList<Enfermedad>();
	}

	 /*  Asimismo dado un producto químico, los cultivos son capaces de decir si en algún
		momento puede serle de utilidad o no, es decir si el agroquímico puede tratar una de sus
		enfermedades frecuentes y no se desaconseja su uso en el cultivo. Se considera que el
		agroquímico trata una enfermedad si todos los estados patológicos de la enfermedad están
		contenidos por las acciones del producto químico.
	 */
	
	public boolean esUtilProductoQuimico(ProductoQuimico pq) {
		for(int i = 0; i<enfermedadesFrecuentes.size(); i++) {
			Enfermedad e = enfermedadesFrecuentes.get(i);
			if(e.seContienenTodosEstadosPatologicos(pq) && !pq.getcultivosDesaconsejados().contains(this)) { 
				return true;													//SI ESE CULTIVO NO ESTA EN LOS CULTIVOS DESACONSEJADOS DEL PROD QUIMICO.
			}
		}
		return false;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Enfermedad> getEnfermedadFrecuentes(){
		return new ArrayList<Enfermedad>(enfermedadesFrecuentes);
	}
	
	public void addEnfermedad(Enfermedad e) {
		if(!enfermedadesFrecuentes.contains(e)) {
			enfermedadesFrecuentes.add(e);
		}
	}
	 
	public boolean equals(Object o) {
		try {
			Cultivo c = (Cultivo)o;
			return c.getNombre().equals(nombre);
		}
		catch(Exception e) {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Cultivo [nombre=" + nombre + ", enfermedadesFrecuentes=" + enfermedadesFrecuentes + "]";
	}
	
	
}
