package tp7a_ej2;

public class CondicionContenidoConPalabraDada extends Condicion {

	private String palabra;
	
	public CondicionContenidoConPalabraDada(String palabra) {
		this.palabra = palabra.toLowerCase();
	}
	@Override
	public boolean cumple(Documento doc) {
		return doc.getContenidoTextual().toLowerCase().contains(palabra);
	}

}
