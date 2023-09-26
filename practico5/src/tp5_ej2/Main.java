package tp5_ej2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		SistemaHogwarts sis = new SistemaHogwarts("Hogwarts");
		Casa c1 = new Casa("azul",50);
		Casa c2 = new Casa("roja", 20);
		CasaEnemistada ce = new CasaEnemistada("enemiga", 50, c1);
		Alumno a = new Alumno("gian");
		//Alumno b = new Alumno("pablo");
		//Alumno c = new Alumno("seba");
		//Alumno d = new Alumno("mile");

		sis.addCasa(c1);
		sis.addCasa(c2);
		sis.addCasa(ce);
		
		c1.addCualidad("magia buena");
		c1.addCualidad("doble varita");
		ce.addCualidad("magia negra");
		a.addCualidad("magia negra");
		
		
		c1.addAlumno(a);
		ce.addAlumno(a);
		
		//c1.addAlumno(b);
		//c1.addAlumno(c);
		//c2.addAlumno(d);
		
		//c2.addAlumno(b); PARA PROBAR SI ESTA EN LA MISMA CASA
		//a.addFamiliar(d);
		
		/*
		System.out.println(c1);
		
		System.out.println(c1.alumnos);
		System.out.println(ce.alumnos);
		System.out.println(ce.rechazadoCasaEnemiga(a));
		System.out.println(sis.listadoCasas());
		//PRIMERO TENGO QUE AGREGARLOS A LA MISMA CASA Y DESPUES DECIR QUE ES FAMILIAR.
		
		ArrayList<Casa>casas = sis.listadoCasas();
		
		String listado = "";
		for(int i = 0; i<casas.size(); i++) {
			Casa cc = casas.get(i);
			listado += cc.toString();
		}
		System.out.println(listado);
		//FOR EACH 
		for(Casa ccc: sis.listadoCasas()) {
			listado += ccc.toString();
		}
		*/
	}

}
