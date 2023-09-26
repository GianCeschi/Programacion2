package tp6_ej2;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Ordenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> nombres = new Vector<>();

		nombres.add("Luis");
		nombres.add("Marcelo");
		nombres.add("Ariel");
		nombres.add("Soledad");
		nombres.add("Gian");

		Collections.sort(nombres);
		System.out.println(nombres); //ORDENA ALFABETICAMENTE DE FORMA ASCENDENTE. SI SON STRINGS.
		
		int res = "Ariel".compareTo("Gian");
		System.out.println("Ariel es menor que Gian en " + res);
	}

}
