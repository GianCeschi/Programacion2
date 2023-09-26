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

	@Override
	public String toString() {
		return "ProductoQuimico: " + nombre ;
	}
	
	
}
