package tp2_ej4;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario("Gianluca Ceschinelli", true, true, LocalDate.of(2023, 7, 29));
		Usuario u2 = new Usuario("Pablo Ceschinelli", true, true, LocalDate.of(2023, 7, 19));
		Usuario u3 = new Usuario("Giovanna Ceschinelli", false, true, LocalDate.of(2023, 7, 19));
		EstablecimientoDeportivo e = new EstablecimientoDeportivo("Nahuel");
		Cancha c1 = new Cancha("CANCHA 1 - FUTBOL");
		Cancha c2 = new Cancha("CANCHA 1 - PADDLE");
		Cancha c3 = new Cancha("CANCHA 2 - PADDLE");
		e.addSocio(u1);
		e.addSocio(u2);
		c1.addTurno(u1);
		c1.addTurno(u2);
		c1.addTurno(u3);
		c2.addTurno(u3);
		
		u1.setReservas(5);
		u2.setReservas(5);
		//u1.incrementarReserva();
		u1.getJuegaFutbol();
		System.out.println(u1.cantReservas());
		System.out.println(u2.cantReservas());
		System.out.println(u3.cantReservas());
		
		
		
		System.out.println(e.listadoSocios());
		System.out.println(c1.listadoTurnos());
		
	}

}
