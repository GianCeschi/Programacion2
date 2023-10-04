package candyCrush;

public class CondicionDestruccionMayor extends Condicion {
	private int valor; 
	public CondicionDestruccionMayor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean cumple(Ficha f) {
		return f.getPoderDestruccion() > this.valor;
	}

}
