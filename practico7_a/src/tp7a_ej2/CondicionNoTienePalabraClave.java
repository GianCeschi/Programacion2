package tp7a_ej2;

public class CondicionNoTienePalabraClave extends Condicion {

	@Override
	public boolean cumple(Documento doc) {
		return doc.getPalabrasClaves().isEmpty();
	}

}
