package candyCrush;

public class CondicionFortalezaMayor extends Condicion {

	private int valor;
	
	public CondicionFortalezaMayor(int valor) {
		this.valor = valor;
	}
	
	@Override
	public boolean cumple(Ficha f) {
		return f.getFortaleza() > this.valor;
	}

}

