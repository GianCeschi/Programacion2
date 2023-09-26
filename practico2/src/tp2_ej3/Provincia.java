package tp2_ej3;
import java.util.ArrayList;
public class Provincia {

	private ArrayList<Ciudad>ciudades;
	private String nombre;
	

	public Provincia(String nombre) {
		this.nombre = nombre;
		this.ciudades = new ArrayList<Ciudad>();
	}

	
	public String listadoCiudadesGastanMas() {
		String listado = "";
		for(int i=0;i<ciudades.size();i++) {
			Ciudad c = ciudades.get(i);
			if(c.controlDeGastos()&& c.ciudadConDeficit()) {
				 listado += c.getNombre() +"\n ";
			}
		}
		return listado;
	}
	//y las provincias que tienen más de la mitad de las ciudades en condición de déficit.
	public int cantCiudadesConDeficit() {
		int cant =0;
		for(int i = 0; i<ciudades.size();i++) {
			Ciudad c = ciudades.get(i);
			if(c.controlDeGastos()&& c.ciudadConDeficit()) {
				 cant++;
			}
		}
		return cant;
	}
	
	public String tieneMayorDeficit() {
		String provincia = "";
		int mitad = cantCiudades()/2;
		if(cantCiudadesConDeficit()>mitad){
			provincia += getNombre();
		}
		return provincia;
	}
	
	public void addCiudad(Ciudad c) {
		if(!this.ciudades.contains(c)) {
			this.ciudades.add(c);
		}
	}
	
	public void removeCiudad(Ciudad c) {
		if(this.ciudades.contains(c)) {
			this.ciudades.remove(c);
		}
	}
	
	public int cantCiudades() {
		return ciudades.size();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
