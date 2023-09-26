package tp3_ej1;
/*
Una empresa consultora desea desarrollar un sistema el cual le permita informatizar su mecanismo de encuestas.

La compañía se encarga de realizar encuestas para empresas de terceros o para el gobierno.

Una encuesta se compone de un conjunto de preguntas, una persona encuestada y el empleado que realizo la encuesta.

La compañía guarda todas las encuestas realizadas. 
  
Los empleados cobran un plus por cantidad de encuestas realizadas, con lo cual la empresa desea conocer el número de encuestas que realizó
cada empleado. 

Para evitar falsificación de datos, en la encuesta figura el número de documento de la persona. 

Una misma persona no puede llenar dos veces la misma encuesta, pero si una encuesta diferente.

Consejo: Diferenciar entre formulario a responder y formulario respondido.

*/
//hacer arraylist de preguntas
//hacer clase empleado ------> QUE TENGA UN ARREGLO CON LAS ENCUESTAS QUE REALIZO EL EMPLEADO
//PODRIA O NO HACER LA CLASE ENCUESTADO

//
public class Encuesta {
/*
	private boolean pregunta1;
	private boolean pregunta2;
	private boolean pregunta3;*/ //ESTO NO!!
	private Persona encuestado;
	private Persona empleado;
	private boolean completoEncuesta;
	private int numeroEncuesta;
	
	public Encuesta(Persona encuestado, Persona empleado, int idEncuesta) {
		 encuestado = new Persona("Pepe",41699544); //this.encuestado = encuestado;
		 empleado = new Persona ("Gian", 41313343); //this.empleado = empleado;
		 this.numeroEncuesta = idEncuesta;
		 pregunta1 = false;
		 pregunta2 = false;
		 pregunta3 = false;
		 completoEncuesta = false;
	}
	
	
	
	public String formulario(int idEncuesta) {
		String form = "";
		if(pregunta1 && pregunta2 && pregunta3) {
			form += "Formulario respondido";
			completoEncuesta = true;
			numeroEncuesta++;
		}
		else {
			form += "Formulario a responder";
		}
		return form;
	}

	public boolean getPregunta1() {
		return pregunta1;
	}

	public void setPregunta1(boolean pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public boolean getPregunta2() {
		return pregunta2;
	}

	public void setPregunta2(boolean pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public boolean getPregunta3() {
		return pregunta3;
	}

	public void setPregunta3(boolean pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public Persona getEncuestado() {
		return encuestado;
	}

	public void setEncuestado(Persona encuestado) {
		this.encuestado = encuestado;
	}

	public Persona getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Persona empleado) {
		this.empleado = empleado;
	}

	public boolean getCompletoEncuesta() {
		return completoEncuesta;
	}

	public void setCompletoEncuesta(boolean completoEncuesta) {
		this.completoEncuesta = completoEncuesta;
	}

	public int getNumeroEncuesta() {
		return numeroEncuesta;
	}

	public void setNumeroEncuesta(int numeroEncuesta) {
		this.numeroEncuesta = numeroEncuesta;
	}
	
}
