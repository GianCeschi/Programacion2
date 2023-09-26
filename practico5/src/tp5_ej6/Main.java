package tp5_ej6;

public class Main {

	public static void main(String[] args) {
		Comite c = new Comite("Congreso");
		
		c.addTemasExpertos("agentes");
		c.addTemasGenerales("programacion");
		c.addTemasGenerales("algoritmo");
		
		Evaluador e1 = new Evaluador("Gian", 41313343);
		c.addEvaluador(e1);
		
		Trabajo t1 = new Trabajo("articulo");
		Poster p1= new Poster("poster");
		
		e1.addConocimiento("programacion");
		e1.addConocimiento("algoritmo");
		
		
		p1.addPalabra("programacion");
		p1.addPalabra("nada");
		
		t1.addPalabra("programacion");
		t1.addPalabra("algoritmo");
		t1.addPalabra("no esta en sus conocimientos");  //clave chequear esto
		
			
		e1.addTrabajo(t1);
		e1.addTrabajo(p1);
		
		System.out.println(c.estaApto(e1, t1));
		System.out.println(c.cantTrabajos(e1));
		
		
		
		
	}

}
