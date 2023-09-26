package tp7a_ej2;

public class CondicionPalabraTitulo extends Condicion {

	private String substring;
	
	public CondicionPalabraTitulo(String substring) {
		this.substring = substring.toLowerCase();
	}
	
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().toLowerCase().contains(substring);
	}

}
