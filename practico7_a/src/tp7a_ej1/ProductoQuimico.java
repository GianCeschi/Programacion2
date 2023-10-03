package tp7a_ej1;

import java.util.ArrayList;

public class ProductoQuimico {

	private String nombre;
	private ArrayList<Cultivo> cultivosDesaconsejados; //Se desaconseja su uso.
	private ArrayList<String> estadosPatalogicos;
	
	public ProductoQuimico(String nombre) {
		this.nombre = nombre;
		this.cultivosDesaconsejados = new ArrayList<Cultivo>();
		this.estadosPatalogicos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Cultivo> getcultivosDesaconsejados(){
		return new ArrayList<Cultivo>(cultivosDesaconsejados);
	}
	
	public ArrayList<String> getEstadosPatalogicos(){
		return new ArrayList<String>(estadosPatalogicos);
	}
	
	public void addCultivo(Cultivo c) {
		if(!cultivosDesaconsejados.contains(c)) {
			cultivosDesaconsejados.add(c);
		}
	}
	
	public void addEstadoPatalogico(String e) {
		if(!estadosPatalogicos.contains(e)) {
			estadosPatalogicos.add(e);
		}
	}
	
	public boolean puedeTratarEnfermedad(Enfermedad e, Cultivo c) {
		return c.esUtilProductoQuimico(this) ;
	}
	
	//ACA SE DELEGAN BIEN LAS RESPOSABILIDADES.
	public boolean trataEnfermedad(String estado) {
		for(int i= 0;i<estadosPatalogicos.size();i++) {
			String estadoActual= estadosPatalogicos.get(i);
			if(estadoActual.equalsIgnoreCase(estado)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean seAconsejaUso(Cultivo c) {
		for(int i =0; i<cultivosDesaconsejados.size(); i++) {
			Cultivo cultivoActual = cultivosDesaconsejados.get(i);
			if(cultivoActual.equals(c)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "ProductoQuimico: " + nombre ;
	}
	
	
}
