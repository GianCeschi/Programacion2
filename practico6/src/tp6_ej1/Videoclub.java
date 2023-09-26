package tp6_ej1;
/*
Para evitar convertirse en un nuevo Blockbuster, un videoclub de barrio ha decidido diversificarse e incorporar a su cartera de negocios el alquiler de autos.
Para modernizarse, abandonará los registros en papel e implementará un sistema unificado de alquiler.

El sistema debe permitir alquilar un determinado ítem a un cliente hasta una fecha determinada y llevar
control de los ítems alquilados a cada cliente.
 
Las películas poseen información filmográfica y la cantidad de copias que se dispone de la misma.

De los vehículos, se registra marca, kms y patente. Los vehículos pueden ser eléctricos, nafteros o diesel. 
 
Una película puede ser alquilada si hay copias aún disponibles, mientras que los vehículos sólo pueden ser alquilados a un cliente por vez.
 
Se debe proveer además la funcionalidad necesaria para permitir conocer quiénes son los clientes que poseen alquileres vencidos.
 */

import java.util.ArrayList;

public class Videoclub {

	private String nombre;
	private ArrayList<Item> items;
	private ArrayList<Cliente> clientes;
	private ArrayList<Alquiler> alquileres;
	
	
	public Videoclub(String nombre) {
		this.nombre = nombre;
		this.items = new ArrayList<Item>();
		this.clientes = new ArrayList<Cliente>();
		this.alquileres = new ArrayList<Alquiler>();
	}
	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public ArrayList<Alquiler> alquileres(){
		return new ArrayList<Alquiler>(alquileres);
	}
	
	public void addAlquiler(Alquiler a) {
			alquileres.add(a);
	}
	
	
	public ArrayList<Cliente> clientesItems(){
		ArrayList<Cliente> result = new ArrayList<Cliente>();  //DEVOLVER UNA COPIA INSTANCIANDO UN ARRAY AUXILIAR
			
		for (Alquiler a: alquileres){
			if(a.getItemAlquilado()!=null) {		//LO AGREGA SI NO ES NULL.
				result.add(a.getCliente());			//ESTA DEVUELVO SOLO LOS CLIENTES.
				System.out.println( a.toString()); //CONSULTAR QUE MANERA ESTA BIEN
			}
		}
		return result;
	}


	public ArrayList<Cliente> clientesVencidos(){
		ArrayList<Cliente> result = new ArrayList<Cliente>();  //DEVOLVER UNA COPIA INSTANCIANDO UN ARRAY AUXILIAR
		//for(int i = 0; i<alquileresVencidos.size(); i++) {
			//Alquiler a = alquileresVencidos.get(i);
			
		for (Alquiler a: alquileres){
			if(a.getItemAlquilado()!= null && a.estaVencido()) {    //CHEQUEO SI ESTA VENCIDO.
				result.add(a.getCliente());
			}
		}
		return result;
	}
	
}
