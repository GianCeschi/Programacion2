package tp3_ej3;

public class Main {

	public static void main(String[] args) {
		Personaje p1 = new Personaje("Bueno","BATMAN", "Super heroe");
		Personaje p2 = new Personaje("Malo", "JOCKER", "Villano");
		Cualidad c1 = new Cualidad(500,700,900,30); //VISION//VELOCIDAD//FUERZA//EDAD. 
		Cualidad c2 = new Cualidad(400,200,900,45);
		p1.addCualidad(c1);
		p2.addCualidad(c2);
		Juego jj = new Juego(p1,p2);
		
		Personaje ganador = jj.jugar();
		if(ganador!=null) {
			System.out.println("El ganador es: " + ganador.getNombreSuper() );
		}else {
			System.out.println("No hubo ningun ganador esto es un empate!!!!!!");
		}
	}
}
