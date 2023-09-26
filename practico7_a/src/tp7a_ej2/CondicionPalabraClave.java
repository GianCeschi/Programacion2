package tp7a_ej2;

public class CondicionPalabraClave extends Condicion {

	private String palabraClave;
	
	public CondicionPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getPalabrasClaves().contains(palabraClave);
	}

}
