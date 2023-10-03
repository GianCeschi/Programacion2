package tp7a_ej2;

public class CondicionPalabraClave extends Condicion {

	private String palabraClave;
	
	public CondicionPalabraClave(String palabraClave) {
		this.palabraClave = palabraClave;
	}
	@Override //RESPONSABILIDAD DE DOCUMENTO, NO ESTA BUENO QUE RECORRA EL ARRAYLIST DE PALABRAS CLAVES ESTO! POR ESO NO PASARLE EL GETPALABRASCLAVES
	public boolean cumple(Documento doc) {
		return doc.contienePalabraClave(palabraClave);
	}

}
