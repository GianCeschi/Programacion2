package tp5_ej6;

public class Poster extends Trabajo {


	public Poster(String nombre) {
		super(nombre);
	}
	
	
	//SI HAY UN TEMA QUE CONOCE YA CORTA Y CUMPLE CON LO REQUERIDO.
	@Override
	public boolean sePuedeEvaluar(String tema) {
		for(int i = 0; i<palabrasClaves.size();i++) {
			String p = palabrasClaves.get(i);
			if(p.equals(tema)) {
				return true;
			}
		}
		return false;
	}
}
