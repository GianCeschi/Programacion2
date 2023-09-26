package tp3_ej3;



public class Juego {

	private Personaje p1;
	private Personaje p2;

	
	public Juego(Personaje p1, Personaje p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Personaje jugar() {
		return compararPersonaje();
		
	}
	
	public Personaje compararPersonaje() {
		
		if(p1.getFuerza()>p2.getFuerza()||p1.getVelocidad()>p2.getVelocidad()) { //ACA COMPARO TODAS LAS CUALIDADES
			return getP1();
		}
		else if(p2.getFuerza()>p1.getFuerza()||p2.getVelocidad()>p1.getVelocidad()) {
			return getP2();
		}
		else {
			return null;
		}
	}
	

	public Personaje getP1() {
		return p1;
	}
	public void setP1(Personaje p1) {
		this.p1 = p1;
	}
	public Personaje getP2() {
		return p2;
	}
	public void setP2(Personaje p2) {
		this.p2 = p2;
	}
	
	
}
