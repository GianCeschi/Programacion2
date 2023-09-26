package tp2_ej3;

public class Principal {

	public static void main(String[] args) {
		Ciudad c = new Ciudad("Tandil",500,100,200,100,50,2000,500000);
		Ciudad c2 = new Ciudad("Rauch",500,500,200,200,100,2000,150000);
		Ciudad c3 = new Ciudad("Tapalque",500,500,200,200,100,2000,15000);
		Ciudad c4 = new Ciudad("Posadas",200,200,200,200,200,100,250000); //CAMBIANDO EL GASTO ACA VEO BIEN LA DIFERENCIA DE OBJETOS!
		Provincia buenosAires = new Provincia("BsAs");
		Provincia misiones = new Provincia("Misiones");
		Pais p = new Pais("Argentina");
		buenosAires.addCiudad(c);
		buenosAires.addCiudad(c2); //ACA YO METO CADA CIUDAD A LA PROVINCIA QUE CORRESPONDE.
		buenosAires.addCiudad(c3);
		misiones.addCiudad(c4);
		
		p.addProvincia(buenosAires);//TENGO QUE AGREGAR LA PROVINCIA AL PAIS.
		p.addProvincia(misiones);
		System.out.println("Ciudades que gastan mas de lo que recaudan: \n" + p.ciudadesGastanMasQueRecaudan(buenosAires) + p.ciudadesGastanMasQueRecaudan(misiones));
		System.out.println("Provincias con mas de la mitad de sus ciudades con deficit: \n" +p.provinciasMayorDeficit());
		
	}

}
