package vivero;

public class Main {

	public static void main(String[] args) {
		Vivero vivero = new Vivero("Verellen");
		Planta p1 = new Planta("cactus auereum", "---", "Araceae", "Monocotyledonea", 9, 3, false);
		Planta p2 = new Planta("rosa", "Crassula", "Araceae", "Monocotyledonea", 2, 3, true);
		Planta p3 = new Planta("super auereum", "---", "no tiene", "Monocotyledonea", 1, 9, true);
		Planta p4 = new Planta("margarita", "Crassula", "Araceae", "Monocotyledonea", 3, 6, false);
		Planta p5 = new Planta("camelia", "Crassula", "no tiene", "Monocotyledonea", 1, 6, false);
		
		
		p1.addNombreVulgar("lengua de suegra");
		p3.addNombreVulgar("lengua de viejo");
		p5.addNombreVulgar("lengua de suegra");
		p5.addNombreVulgar("dientuda");
		
		vivero.addPlanta(p1);
		vivero.addPlanta(p2);
		vivero.addPlanta(p3);
		vivero.addPlanta(p4);
		vivero.addPlanta(p5);
		
		Condicion c1 = new CondicionNombreCientifico("auereum");
		Condicion c2 = new CondicionNombreVulgar("lengua de suegra");
		Condicion c3 = new CondicionClasificacion("Crassula");
		Condicion c5 = new CondicionNivelSolInferior(4); // DUDA SI TENGO QUE HACER ESTAS 4 CONDICIONES. CONSULTAR!!
		Condicion c6 = new CondicionNivelSolSuperior(5); // PUEDO HACER 2 SOL INFERIOR Y RIEGO SUPERIOR Y SOL SUPERIOR Y RIEGO INFERIOR.
		Condicion c7 = new CondicionRiegoInferior(3);
		Condicion c8 = new CondicionRiegoSuperior(4);
		Condicion c9 = new CondicionPocoRiego(3);
		Condicion c10 = new CondicionAND(c6, c7); //d) Todas las plantas que requieran un nivel de sol superior a 5 y riego inferior a 3
		Condicion c11 = new CondicionAND(c5, c8); //e) Todas las plantas que requieran un nivel de sol inferior a 4 y riego superior a 4

												  //LO BUENO DE TENER EL AND ES QUE PUEDO JUNTAR LO QUE QUIERA DE LAS CONDICIONES DE SOL Y RIEGO.
		
		System.out.println(vivero.buscar(c1)); //a)
		System.out.println(vivero.buscar(c2)); //b)
		System.out.println(vivero.buscar(c3)); //c)
		System.out.println(vivero.buscar(c10)); //d)
		System.out.println(vivero.buscar(c11)); //e)
		System.out.println(vivero.buscar(c9)); //f)
		
		

	}

}
