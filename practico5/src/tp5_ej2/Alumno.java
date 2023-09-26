package tp5_ej2;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	protected ArrayList<String> cualidadesAlumno;
	protected ArrayList<Alumno> familiares;
	private boolean tieneCasa;
	
	public Alumno(String nombre) {
		this.nombre = nombre;
		this.cualidadesAlumno = new ArrayList<String>();
		this.familiares = new ArrayList<Alumno>();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	//AGREGO LAS CUALIDADES QUE TIENE ALUMNO.
	public void addCualidad(String cualidad) {
		if(!cualidadesAlumno.contains(cualidad)) {
			cualidadesAlumno.add(cualidad);
		}
	}
	//ELIMINO CUALIDAD.
	public void removeCualidad(String cualidad) {
		if(cualidadesAlumno.contains(cualidad)) {
			cualidadesAlumno.remove(cualidad);
		}
	}
	
	//FAMILIARES ASISTENTES A LA CASA.
	//AGREGO UN FAMILIAR QUE VA A LA ESCUELA.
	
	public void addFamiliar(Alumno a) {
		if(!familiares.contains(a)) {
			familiares.add(a);
		}
	}
	

	//LE TENGO QUE PASAR LA CUALIDAD Y QUE SE FIJE EN SU ARRAYLIST SI LA TIENE.
	public boolean tieneCualidad(String c) {
		return this.cualidadesAlumno.contains(c); //TENGO QUE RETORNAR SI ESA CUALIDAD QUE LE PASO ESTA DENTRO DE CUALIDADES ALUMNO
	}
	
	//LE TENGO QUE PASAR EL ALUMNO EN CADA POSICION DEL ARRAYLIST DE LOS ALUMNOS DE LA CASA Y EL TIENE QUE CHEQUEAR SI ESTA EN SU ARRAY DE FAMILIARES.
	public boolean tieneFamiliar(Alumno a) {
		return this.familiares.contains(a);
	}
	
	
	
    //POR DEFECTO NO ESTA EN NINGUNA CASA. CUANDO LO AGREGO SE TIENE QUE VOLVER TRUE.
	public boolean getTieneCasa() {
		return tieneCasa;
	}
	public void setTieneCasa(boolean tieneCasa) {  //TENGO QUE VER SI YA FORMA PARTE DE UNA CASA. EN EL ADD ALUMNO LO CHEQUEO.
		this.tieneCasa = tieneCasa;
	}
	//METODO EQUALS ALUMNO.
	public boolean equals(Object o) {
		try {
			Alumno a = (Alumno)o;
			return a.getNombre().equals(nombre);
		}
		catch(Exception e) {
			return false;
		}
	}
}
