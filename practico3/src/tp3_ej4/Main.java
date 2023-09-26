package tp3_ej4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Celular c = new Celular("Iphone de Gian");
		Contacto cto1 = new Contacto("Gianluca","Ceschinelli","Salceda 1796","ceschi@gmail.com", "Tandil", LocalDate.of(1998, 12, 23),249453);
		Contacto cto2 = new Contacto("Pablo","Gonzalez","Ovidi 7","ceschipablo@gmail.com", "Mallorca", LocalDate.of(1973, 5, 25),617952);
		Contacto cto3 = new Contacto("Milena","Perez","cordoba 155","mile@gmail.com", "Tapalque", LocalDate.of(2000, 1, 13),228155);
		Contacto cto4 = new Contacto("Gianluca","Ceschinelli","Salceda 1796","ceschi@gmail.com", "Miami", LocalDate.of(1990, 12, 23),249453);
		
		c.addContacto(cto1);
		c.addContacto(cto2);
		c.addContacto(cto3);
		c.addContacto(cto4);
		
		System.out.println(c.listadoCompleto());
		System.out.println(c.listadoRepetidos());
	}

}
