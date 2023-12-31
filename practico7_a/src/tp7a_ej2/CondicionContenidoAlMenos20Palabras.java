package tp7a_ej2;

public class CondicionContenidoAlMenos20Palabras extends Condicion {

	private int minimoDePalabras;

	  public CondicionContenidoAlMenos20Palabras(int minimoDePalabras){
	    this.minimoDePalabras = minimoDePalabras;
	  }

	  @Override
	  public boolean cumple(Documento documento) {
	    return tieneMasPalabras(documento.getContenidoTextual());
	  }
	  
	  /*
	   * - Verifica si el contenidoCortado (Las palabras resultantes) son mayores o 
	   *   iguales a las requeridas.
	   * @param contenidoDelDocumento a evaluar.
	   * @return true / false.
	   */
	  private boolean tieneMasPalabras(String contenidoDelDocumento){
	    // Se le quitan los espacios al inicio y al final.
	    String contenidoCortado = contenidoDelDocumento.trim();
	    
	    /*
	     * split divide el contenido en base a una expresion regular.
	     * \s busca todos los espacios, tabs y saltos de linea, y el + 
	     * especifica que junta aquellos que esten juntos.
	     */
	    return (contenidoCortado.split("\s+").length >= this.minimoDePalabras);    
	  }

}
