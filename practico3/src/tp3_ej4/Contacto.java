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

SE ENCARGA DE DECIDIR SI DOS CONTACTOS SON IGUALES LA CLASE CONTACTO SEGUN EL CRITERIO DE  EQUALS QUE PLANTEE.
*/
import java.time.LocalDate;
import java.time.Period;
public class Contacto {

	private String nombre,apellido,direccion,mail,ciudad;
	private LocalDate fechaNacimiento;
	private int telefono;
	
	public Contacto(String nombre, String apellido, String direccion, String mail, String ciudad,LocalDate fecha, int telefono) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.mail = mail;
		this.ciudad = ciudad;
		this.fechaNacimiento = fecha;
		this.telefono = telefono;
	}
	
	//CRITERIO DE IGUALDAD DE DOS CONTACTOS.
	public boolean equals(Object o1) {
		try {
			String nombreAfuera = ((Contacto)o1).getNombre();
			String apellidoAfuera = ((Contacto)o1).getApellido();
			int telefonoAfuera = ((Contacto)o1).getTelefono();
			return nombre.equals(nombreAfuera) && apellido.equals(apellidoAfuera) && telefono == telefonoAfuera;  //int comparo con ==.
		}
		catch(Exception exc) {
			return false;
		}
	}
	
	//CALCULO SI DOS CONTACTOS SON IGUALES
	/*
	public boolean contactosIguales(Contacto c1, Contacto c2) {
		if(c1.equals(c2)) {
			
		}
	}*/
	
	//ASI CALCULO LA EDAD DE UNA PERSONA.
	public int calcularEdadContacto(){
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		return periodo.getYears();
		}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
	
}
