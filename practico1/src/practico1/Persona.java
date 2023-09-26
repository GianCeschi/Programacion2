package practico1;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	public final LocalDate FECHA_ACTUAL = LocalDate.now();
	
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private int dni;
	private char sexo;
	private double peso;
	private double altura;
	

	public Persona(int dni){
		this(dni,"N","N");
	}
	
	public Persona(int dni, String nombre, String apellido){
		this(dni,nombre,apellido, LocalDate.of(2000, 1, 1));

	}

	public Persona(int dni, String nombre, String apellido, LocalDate fechaNacimiento){
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		sexo = 'F';
		peso = 73;
		altura = 1.80;
	}
	public String getDatosCompletos(){
		return nombre + "," + apellido + "," + dni;
	}

	public double getIMC(){
		return this.getPeso() / (this.getAltura() * this.getAltura());
	}

	/*Saber si está en forma. Está en forma si el índice de masa corporal se encuentra
      entre 18,5 y 25 (esto es solo un ejemplo para probar la funcionalidad)*/

	public boolean estaEnForma(){
		if((getIMC()>=18.5)&&(getIMC()<=25)){
			return true;
		}else{
			return false;
		}
	}
	
	//Saber si es mayor de edad. Una persona es mayor de edad si es mayor de 18años
	
	public boolean esMayorEdad() {
		if(getEdad()>=18) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean puedeVotar() {
		if(getEdad()>=16) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Saber si es coherente. Que la fecha de nacimiento coincida con la edad.
	public boolean esCoherente() {
		int edadReportada = getEdad();
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int edad = periodo.getYears();
		if(edadReportada == edad) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Saber si esta cumpliendo años.
	
	public boolean estaCumpliendoAnios() {
		if((FECHA_ACTUAL.getMonth()==fechaNacimiento.getMonth())&&(FECHA_ACTUAL.getDayOfMonth()==fechaNacimiento.getDayOfMonth())) {
			return true;
		}else {
			return false;
		}
	}
	
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public int getEdad() {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int edad = periodo.getYears();
		return edad;
	}

	public int getDni() {
		return dni;
	}

	public char getSexo() {
		return sexo;
	}

}
