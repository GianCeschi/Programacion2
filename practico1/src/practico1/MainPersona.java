package practico1;

import java.time.LocalDate;

public class MainPersona {

	public static void main(String[] args) {
		//Persona prueba = new Persona(43555666);
		Persona gian = new Persona(41313343, "gian", "ceschinelli", LocalDate.of(1998, 8, 19));

		System.out.println(gian.getDatosCompletos());
		System.out.println(gian.getIMC()); //CALCULO DE INDICE DE MASA CORPORAL.
		System.out.println(gian.estaEnForma()); 
		if(gian.estaEnForma()==true){
			System.out.println("Esta en forma, todo okkk");
		}
		if(gian.esMayorEdad()==true) {
			System.out.println("Es mayor de edad, tiene " + gian.getEdad() + " años");
		}else {
			System.out.println("No es mayor de edad");
		}
		if(gian.puedeVotar()==true) {
			System.out.println("Puede votar porque es mayor de 16");
		}else {
			System.out.println("No puede votar");
		}
		if(gian.esCoherente()) {
			System.out.println("La persona es coherente");
		}
		
		if(gian.estaCumpliendoAnios()) {
			System.out.println("JUSTO HOY CUMPLE AÑOS!!!");
		}else {
			System.out.println("Ya paso su cumple");
		}
		
		System.out.println("IMC: " + gian.getIMC() + " --- Esta en forma: " + gian.estaEnForma() + " --- Es mayor de edad: " + gian.esMayorEdad());
	}

}
