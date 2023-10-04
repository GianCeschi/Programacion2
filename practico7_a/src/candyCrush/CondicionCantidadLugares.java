package candyCrush;

public class CondicionCantidadLugares extends Condicion {

	private int valor;
	
	public CondicionCantidadLugares(int valor) {
		this.valor = valor;
	}
	@Override
	public boolean cumple(Ficha f) {
		// TODO Auto-generated method stub
		return f.getEspacioOcupado()>this.valor;
	}

}

