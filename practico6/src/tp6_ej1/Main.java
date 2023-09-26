package tp6_ej1;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Videoclub v1 = new Videoclub("Jupiter");
		Cliente c1 = new Cliente("Gian",41313343);
		Item i1 = new Pelicula("Harry Potter", "Suspenso", 0);
		Alquiler a1 = new Alquiler(LocalDate.of(15, 9, 22),c1,i1);
		
		Cliente c2 = new Cliente("Pablo",23209323);
		Item i2 = new Vehiculo("Ford", 0, "AA855YZ","electrico");
		Alquiler a2 = new Alquiler(LocalDate.of(12, 9, 22),c2,i2);
		
		Cliente c3 = new Cliente("Roxana",23617942);
		Item i3 = new Vehiculo("Porsche", 7500, "AE655QQ","diesel");
		Alquiler a3 = new Alquiler(LocalDate.of(25, 9, 24),c3,i2);
		
		v1.addAlquiler(a1);
		v1.addAlquiler(a2);
		v1.addAlquiler(a3);
		System.out.println(v1.clientesItems());  //NO ME ESTARIA FUNCIONANDO BIEN EL TEMA DE LAS FECHAS QUE CHEQUEA EL ESTA VENCIDO.
	}

}
