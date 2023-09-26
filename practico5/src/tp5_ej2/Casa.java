package tp5_ej2;

import java.util.ArrayList;

public class Casa {

	private String nombre;
	protected ArrayList<String> cualidades; //CUALIDAD QUE DEBEN CUMPLIR LOS ALUMNOS PARA INGRESAR.
	protected ArrayList<Alumno> alumnos; //ALUMNOS DE UNA CASA.
	private int cantMaximaAlumnos;
	
	public Casa(String nombre, int cantMaximaAlumnos) {
		this.nombre = nombre;
		this.cantMaximaAlumnos = cantMaximaAlumnos;
		this.cualidades = new ArrayList<String>();
		this.alumnos = new ArrayList<Alumno>();
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantMaximaAlumnos() {
		return cantMaximaAlumnos;
	}

	public void setCantMaximaAlumnos(int cantMaximaAlumnos) {
		this.cantMaximaAlumnos = cantMaximaAlumnos;
	}

	//AGREGO UN ALUMNO A LA CASA SI CUMPLE TODAS LAS CONDICIONES.
	public void addAlumno(Alumno a) {
		if(!casaLlena() && !a.getTieneCasa() && cumpleTodasCualidades(a)){
			if(!alumnos.contains(a)) {
				alumnos.add(a);
				a.setTieneCasa(true); //SETEO EL TIENE CASA
			}
		}
	}
	
	
	//AGREGO LAS CUALIDADES QUE TIENEN QUE TENER PARA ENTRAR A LA CASA.
	public void addCualidad(String cualidad) {
		if(!cualidades.contains(cualidad)) {
			cualidades.add(cualidad);
		}
	}
	//ELIMINO SI CAMBIAN EN ALGUN MOMENTO.
	public void removeCualidad(String cualidad) {
		if(cualidades.contains(cualidad)) {
			cualidades.remove(cualidad);
		}
	}
	
	//ME FIJO SI LA CASA ESTA LLENA.
	public boolean casaLlena() {
		if(alumnos.size() >=cantMaximaAlumnos) {
			return true;
		}
		else return false;
	}
	
	//ESTO NUNCA NO TENGO QUE RECORRER LAS CUALIDADES DEL ALUMNO
	/*public boolean cumpleTodasCualidades(Alumno a) {
		return cualidades.containsAll(a.cualidadesAlumno); //MAL
	}*/
	
	
	//LE PASO LA CUALIDAD POR PARAMETRO AL ALUMNO
	public boolean cumpleTodasCualidades(Alumno a) {
		for(int i=0;i<cualidades.size();i++) {
			String c = cualidades.get(i);
			if(!a.tieneCualidad(c)) {  //--NO OLVIDAR DE PASARLE LA CUALIDAD EN ESA POSICION.
				return false;
			}
		}
		return true;
	}
	
	//CUANDO DOS CASAS SON IGUALES. (PODRIA SER CUANDO ASISTEN A LA MISMA CASA)
	public boolean equals(Object o) {
		try {
			Casa c = (Casa)o;
			return c.getNombre().equals(nombre);
		}
		catch(Exception e) {
			return false;
		}
	}

	//YO HACIENDO EL SYSO(Y EL OBJETO) SE MUESTRA EL toString.
	@Override
	public String toString() {
		return "Casa: Nombre=" + nombre + ", cualidades=" + cualidades + ", alumnos=" + alumnos + ", cantMaximaAlumnos="
				+ cantMaximaAlumnos + "\n";
	}
	
	
	
	
	
}
