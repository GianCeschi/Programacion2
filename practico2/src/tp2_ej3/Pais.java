package tp2_ej3;
import java.util.ArrayList;
/*3 Sistema de Control de Gastos Públicos
Un país tiene que controlar el gasto público de las ciudades con más de 100.000
habitantes.
 Para ello, tiene información del monto recaudado por cada ciudad a través de
cinco diferentes tipos de impuestos (denominados, aquí, de imp1, imp2, imp3, imp4 e
imp5) e información acerca de gastos realizados en mantenimiento de la ciudad. Este
país necesita un sistema que le informe cuales son las ciudades que gastan más de lo
que recaudan, y las provincias que tienen más de la mitad de las ciudades en condición
de déficit.

Consejo: Tener en cuenta la información que contienen los distintos impuestos

Extra: ¿En que afecta el tamaño de la ciudad? */

public class Pais {
    
	private ArrayList<Provincia>provincias;
	private String nombre;
	
	public Pais(String nombre) {
		this.provincias = new ArrayList<Provincia>();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String provinciasMayorDeficit() {
		String lista = "";
		for(int i = 0; i<provincias.size(); i++) {
			Provincia p = provincias.get(i);
			lista += p.tieneMayorDeficit() + "\n";
		}
		return lista;
	}

	public String ciudadesGastanMasQueRecaudan(Provincia p) {
		String ciudades = "";
		ciudades += p.listadoCiudadesGastanMas();
		return ciudades;
	}
	
	public void addProvincia(Provincia p) {
		if(!provincias.contains(p)) {
			provincias.add(p);
		}
	}
	
	public void removeProvincia(Provincia p) {
		if(this.provincias.contains(p)) {
			this.provincias.remove(p);
		}
	}
	

	public int cantProvincias() {
		return provincias.size();
	}
}
