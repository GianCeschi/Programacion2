package tp4_ej4;

import java.time.LocalDate;

public class Persona {

	public static final String ESTADO_DISPONIBLE = "En pais de origen";									 //MEJOR FORMA DE HACER EL SET ESTADO
	public static final String [] ESTADOS_POSIBLES = {ESTADO_DISPONIBLE, "En concentracion", "Viajando"}; //NO PONER VARIABLES STRING EN LOS METODOS.
	private String nombre, apellido, estado;
	private int numeroPasaporte;
	private LocalDate fechaNacimiento;
	
	public Persona(String nombre, String apellido, String estado, int nroPasaporte, LocalDate nac) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.estado = "Desconocido";
		this.setEstado(estado); //SI NO PONGO ESTE SET QUE YO EDITE ACA SIEMPRE ME TIRA EL POR DEFECTO
		this.numeroPasaporte = nroPasaporte;
		this.fechaNacimiento = nac;
	}

/* Se debe poder saber si una persona está disponible o no para un evento solidario para recaudar fondos. Una persona estará disponible si está en
   el país de origen y no está concentrando para un partido.*/
	
	public boolean estaDisponible() {
		if(getEstado().equals("En pais de origen")&&(!estaConcentrado())) {
			return true;
		}
		else return false;
	}
	
	//EN CASO DE JUGAR EN SU PAIS DE ORIGEN HAY QUE CHEQUEAR QUE NO ESTE CONCENTRANDO. (ESTA DE MAS.)
	public boolean estaConcentrado() {
		if(getEstado().equals("En concentracion")) {
			return true;
		}
		else return false;
	}
	
	//SI QUIERO PODRIA CHEQUEAR SI UN FUTBOLISTA QUE JUEGA EN SU PAIS DE ORIGEN, ESTA CONCENTRADO O NO. 
	//PERO COMO DIERON EL EJERCICIO ESTARIA DE MAS.(ESTADO).
	
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

	public String getEstado() {
		return estado;
	}

	/*
	public void setEstado(String estado) {
		if(estado.equals("Viajando")||estado.equals("En concentracion")||estado.equals("En pais de origen")) {
			this.estado = estado;
		}
	}*/
	
	public void setEstado(String estado) {
		for(int i = 0; i<ESTADOS_POSIBLES.length;i++) {
			if(estado.equals(ESTADOS_POSIBLES[i])) {
				this.estado = estado;
			}
		}
	}

	public int getNumeroPasaporte() {
		return numeroPasaporte;
	}

	public void setNumeroPasaporte(int numeroPasaporte) {
		this.numeroPasaporte = numeroPasaporte;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
