package tp7a_ej2;

public class Main {

	public static void main(String []args) {
		Historiador h1 = new Historiador("Gian");
		Documento d1 = new Documento("Historia", "Hablamos de la historia de Argentina");
		Documento d2 = new Documento("Novela", "Hablamos de novelas importantes");
		Documento d3 = new Documento("Novela de amor", "Hablamos de novelas europeas");
		
		//GRAN DETALLE NO OLVIDAR AGREGAR DOCUMENTOS O LO QUE SEA AL SISTEMA PRINCIPAL
		h1.addDocumento(d1);
		h1.addDocumento(d2);
		h1.addDocumento(d3);
		
		Condicion c1 = new CondicionTituloIgual("Novela"); //A
		Condicion c2 = new CondicionPalabraTitulo("amor"); //B
		Condicion c3 = new CondicionPalabraClave("pais"); //C
		Condicion c4 = new CondicionNoTienePalabraClave();//D -- NO HAGO CONSTRUCTOR EN ESTE PORQUE NO TENGO QUE BUSCAR NADA ESPECIFICO.
		Condicion c5 = new CondicionAutorDeterminado("Borges");//E
		Condicion c6 = new CondicionContenidoConPalabraDada("novelas");//F
		Condicion c7 = new CondicionContenidoAlMenos20Palabras(5); //En este caso 5 palabras. G
		Condicion c8 = new CondicionAND(c1, c3); //H
		
		
		d1.addAutor("Borges");
		d1.addPalabraClave("pais");
		d2.addPalabraClave("pais"); //AGREGO ESTA PARA PROBAR EL INCISO C.
		d1.addPalabraClave("rico");
		d3.addPalabraClave("Chequeo"); //CHEQUEO INCISO D.
		
		
		d2.addAutor("Shakespeare");
		d2.addPalabraClave("Poesia");
		
		System.out.println(h1.buscar(c1));
		System.out.println(h1.buscar(c2));
		System.out.println(h1.buscar(c3));
		System.out.println(h1.buscar(c4));
		System.out.println(h1.buscar(c5));
		System.out.println(h1.buscar(c6));
		System.out.println(h1.buscar(c7));
		System.out.println(h1.buscar(c8));
		
	}
}
