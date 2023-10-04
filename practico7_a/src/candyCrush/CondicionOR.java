package candyCrush;

public class CondicionOR extends Condicion {
	
	private Condicion c1,c2;
	
	public CondicionOR(Condicion c1, Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}
	@Override
	public boolean cumple(Ficha f) {
		return c1.cumple(f)||c2.cumple(f); 
	}

}
