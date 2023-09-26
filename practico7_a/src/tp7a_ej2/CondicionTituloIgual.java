package tp7a_ej2;

public class CondicionTituloIgual extends Condicion {

	private String tituloBuscado;
	
	//LE PASO UN TITULO A BUSCAR Y YA SE LO PASO TO.LOWERCASE
	public CondicionTituloIgual(String tituloBuscado) {
		this.tituloBuscado = tituloBuscado.toLowerCase();
	}

	//CHEQUEO QUE DADO UN TITULO CUALQUIERA CUMPLE LA IGUALDAD Y NO IMPORTAN LAS MAYUSCULAS.
	@Override
	public boolean cumple(Documento doc) {
		return doc.getTitulo().toLowerCase().equals(tituloBuscado);
	}

}
