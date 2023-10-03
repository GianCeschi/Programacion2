package streaming;

public class Main {

	public static void main(String[] args) {
		//PRIMERO INSTANCIO LAS RENTABILIDADES DE LA PLATAFORMA PARA PODER ADQUIRIR PELICULAS Y LUEGO SE LA ASIGNO
		/*Dado que las preferencias de los clientes cambian con el tiempo, el CEO de la plataforma de
		streaming desea poder cambiar en tiempo de ejecución las políticas de adquisición de
		licencias de películas, en caso de ser necesario. Proveer un servicio que le permita a la
		plataforma determinar si una película resultará rentable o no.*/
		
		//PRIMERO INSTANCIAR ESTO SINO DA ERROR PORQUE NO ESTA CREADO Y SE LO QUIERO PASAR POR PARAMETRO A LA PLATAFORMA.
		
		Filtro r1 = new DuracionMenor120MinGeneroDistintoComedia("Comedia", 120);
		Filtro r2 = new Posterior2017ExceptoInfantil_Documental(2017, "Infantil", "Documental");
		
		PlataformaStreaming netflix = new PlataformaStreaming("Netflix", r2);//LE PASO POLITICA DE ADQUISICION.
		
		netflix.setRentabilidad(r1); //ESTE ES EL TIEMPO DE EJECUCION!!!
		
		
		Pelicula p1 = new Pelicula("Titanic", "Se hunde barco", "Drama", "Pablo Perez", 1990, 180, 13);
		Pelicula p2 = new Pelicula("Harry Potter", "Todo ocurre en una escuela de magia", "Documental", "JK Rowling", 2002, 195, 13);
		Pelicula p3 = new Pelicula("Soy leyenda", "Apocalictico", "Suspenso", "Pepe Lopez", 2004, 100, 13);
		Pelicula p4 = new Pelicula("Ben 10 en la luna", "Aventura", "Infantil", "Sebastian l", 2014, 87, 7);
		Pelicula p5 = new Pelicula("La monja", "Muertes", "Terror", "Harry Steven", 2023, 119, 16);
		
		p3.addActor("Will Smith");
		
		Filtro f1 = new FiltroPorTitulo("luna");
		Filtro f2 = new FiltroGeneroEspecifico("Terror");
		Filtro f3 = new FiltroActorYNoDirector("Will Smith", "Martin Scorsese"); //SI TENGO RENTABILIDAD 2 NO FUNCIONA ESTE FILTRO.
		Filtro f4 = new FiltroAnioEstrenoYDuracionMenor(2015, 95);
		
		
		
		//Agrego peliculas.
		netflix.addPelicula(p1);
		netflix.addPelicula(p2);
		netflix.addPelicula(p3);
		netflix.addPelicula(p4);
		netflix.addPelicula(p5);
		
		//Busquedas
		System.out.println(netflix.buscarPelicula(f1));
		System.out.println(netflix.buscarPelicula(f2));
		System.out.println(netflix.buscarPelicula(f3));
		System.out.println(netflix.buscarPelicula(f4));
		
		
		System.out.println("Peliculas rentables para la plataforma de Streaming Netflix");
		//Rentabilidad
		System.out.println(netflix.getPeliculas());
	}

}
