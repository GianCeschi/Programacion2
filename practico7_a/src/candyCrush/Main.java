package candyCrush;

public class Main {

	public static void main(String[] args) {
		
		Tablero tablero = new Tablero(5);
		
		Ficha f1 = new Ficha("Chocolate", 1, 1, 0);
		Ficha f2 = new Ficha("Piedra", 6, 1, 0);
		Ficha f3 = new Ficha("Caramelo a rayas", 1, 1,10);
		Ficha f4 = new Ficha("Torta", 8, 4, 4);
		
		FichaEspecial fEsp = new FichaEspecial("Especial", 10, 2); //LA DESTRUCCION DE ESTA SERIA 5!
		//fEsp.setPoderDestruccion(0);
		
		tablero.addFicha(f1);
		tablero.addFicha(f2);
		tablero.addFicha(f3);
		tablero.addFicha(f4);
		tablero.addFicha(fEsp);
		
		//CONDICIONES:
		
		CondicionDestruccionMayor c1 = new CondicionDestruccionMayor(2);
		CondicionCantidadLugares c2 = new CondicionCantidadLugares(4);
		CondicionFortalezaMayor c3 = new CondicionFortalezaMayor(5);
		CondicionAND c4 = new CondicionAND(c1, c3);
		CondicionOR c5 = new CondicionOR(c1, c2);
		CondicionNOT c6 = new CondicionNOT(c1);
		
		
		//BUSQUEDA.
		System.out.println("Condicion 1:");
		System.out.println(tablero.buscar(c1));
		System.out.println("Condicion 2:");
		System.out.println(tablero.buscar(c2));
		System.out.println("Condicion 3:");
		System.out.println(tablero.buscar(c3));
		System.out.println("Condicion AND:");
		System.out.println(tablero.buscar(c4));
		System.out.println("Condicion OR:");
		System.out.println(tablero.buscar(c5));
		System.out.println("Condicion NOT:");
		System.out.println(tablero.buscar(c6));
		
		
		System.out.println("Dificultad del tablero: ");
		System.out.println(tablero.dificultadTablero());
		 	
		System.out.println("Poder destruccion ficha especial: ");
		System.out.println(fEsp.getPoderDestruccion());
		
		
	}

}
