package tp3_ej4;
/*
 Se desean modelar los contactos de un celular. Para cada contacto se guarda su nombre
y apellido, fecha de nacimiento, número de teléfono, dirección y dirección de mail. El
celular muestra los contactos con su apellido y nombre, su edad y su número de
teléfono. También muestra la ciudad a la que pertenece el contacto. El celular muestra
información a modo de resumen donde se lista la totalidad de contactos, los contactos
repetidos y el promedio de edad de los contactos. Se considera un contacto repetido el
que posee mismo apellido y nombre, y número de teléfono. Asimismo, se debe poder
incorporar un listado de los contactos que poseen el mismo número de teléfono. 
 */


import java.util.ArrayList;

public class Celular {

	private String nombre;
	private ArrayList<Contacto> contactos;
	
	public Celular (String nombre) {
		this.nombre = nombre;
		this.contactos = new ArrayList<Contacto>();
	}
	
	public String listadoCompleto() {
		String listado = "LISTADO COMPLETO DE CONTACTOS \n";
		for(int i = 0; i<contactos.size();i++) {
			listado += "Nombre:" + contactos.get(i).getNombre() + " - Apellido: " + contactos.get(i).getApellido() +
						" - Edad: " + contactos.get(i).calcularEdadContacto() + " - Telefono: " + contactos.get(i).getTelefono() +
						 " - Ciudad: " + contactos.get(i).getCiudad()  +"\n";
		}
		listado += " - PROMEDIO DE EDAD TOTAL: " + promedioEdadContactos() ;
		return listado;
	}
	
	public String listadoRepetidos() {
		String lista = "LISTADO DE REPETIDOS: \n";
		for (int i= 0 ; i < contactos.size() ; i++){
			for (int j= (i+1) ; j < (contactos.size()) ; j++) { //PARA COMPARAR COSAS EN UN ARREGLO TENGO QUE HACER UN DOBLE FOR!!!
				if(contactos.get(i).equals(contactos.get(j))) { //ESTE METODO ES COMPROBAR SI esRepetido();
					lista+= " Nombre: " + contactos.get(i).getNombre() + " - Telefono: " + contactos.get(i).getTelefono() + "\n" +
							" Nombre: " +  contactos.get(j).getNombre() + " - Telefono: " +  contactos.get(j).getTelefono() + "\n";
				}
			}
		}
		return lista;
	}
	
	
	
	//CALCULO EL PROMEDIO DE EDAD DE LOS CONTACTOS
	public double promedioEdadContactos() {
		double promedio =0;
		for(int i=0; i<contactos.size(); i++) {
			promedio += contactos.get(i).calcularEdadContacto();
		}
		return promedio/contactos.size();
	}
	

	//AGREGA CONTACTO SI NO LO CONTIENE.
	public void addContacto(Contacto c) {
		//if(!contactos.contains(c)) { //ESTO NO PORQUE TENGO QUE PODER AGREGAR REPETIDOS
			contactos.add(c);  
		
	}
	
	public void removeContacto(Contacto c) {
		if(contactos.contains(c)) {
			contactos.remove(c);
		}
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
