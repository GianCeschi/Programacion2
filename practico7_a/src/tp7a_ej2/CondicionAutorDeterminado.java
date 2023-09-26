package tp7a_ej2;

public class CondicionAutorDeterminado extends Condicion {

	private String autor;
	
	public CondicionAutorDeterminado(String autor) {
		this.autor = autor;  //COMO LE HAGO EL TO LOWER CASE.
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getAutores().contains(autor);  //COMO LE HAGO EL toLowerCase() a un arraylist?
	}

}
