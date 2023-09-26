package practico2;

public class Principal {

	public static void main (String[]args) {
	/*	//ej1
		Episodio ep1 = new Episodio("ep1");
		Episodio ep2 = new Episodio("ep2");
		Episodio ep3 = new Episodio("ep3");
		ep1.setVisto(true);
		ep3.setVisto(true);
		ep1.setCalificacion(5);
		ep3.setCalificacion(4);
		System.out.println(ep1.getCalificacion());
		System.out.println(ep1.getVisto());
		
		//ej2
		Temporada t1 = new Temporada(1);
		t1.obtenerEpisodiosVistos();
		System.out.println(t1.obtenerEpisodiosVistos());
		*/
		
		//Primero creo la serie 
		Serie s = new Serie("VIVIR SIN PERMISO", "Gian Ceschinelli", "Drama");
		
		//Segundo creo la temporada y agrego episodios.
		
		Temporada t1 = new Temporada(1);
		
		Episodio ep1 = new Episodio("EP1,T1");
		t1.addEpisodio(ep1);
		ep1.setVisto(true);//LOS VISTOS SON MANUALES
		ep1.setCalificacion(4);
		
		Episodio ep2 = new Episodio("EP2,T1");
		t1.addEpisodio(ep2);
		ep2.setVisto(true); //LOS VISTOS SON MANUALES
		ep2.setCalificacion(2);
		
		Episodio ep3 = new Episodio("EP3,T1");
		t1.addEpisodio(ep3);
		ep3.setVisto(true);//LOS VISTOS SON MANUALES
		ep3.setCalificacion(1);
		
		Episodio ep4 = new Episodio("EP4,T1");
		t1.addEpisodio(ep4);
		ep4.setVisto(true);//LOS VISTOS SON MANUALES
		ep4.setCalificacion(1);
		
		Episodio ep5 = new Episodio("EP5,T1");
		t1.addEpisodio(ep5);
		
		//AGREGO LA TEMPORADA
		s.addTemporada(t1);
		
		Temporada t2 = new Temporada(2);
		
		Episodio ep1T2 = new Episodio("EP1,T2");
		t2.addEpisodio(ep1T2);
		ep1T2.setVisto(true);//LOS VISTOS SON MANUALES
		
		Episodio ep2T2 = new Episodio("EP2,T2");
		t2.addEpisodio(ep2T2);
		
		Episodio ep3T2 = new Episodio("EP3,T2");
		t2.addEpisodio(ep3T2);
		
		Episodio ep4T2 = new Episodio("EP4,T2");
		t2.addEpisodio(ep4T2);
		
		Episodio ep5T2 = new Episodio("EP5,T2");
		t2.addEpisodio(ep5T2);
		
		//AGREGO LA TEMPORADA
		s.addTemporada(t2);

		System.out.println("Episodios vistos en su temporada " + t1.getNumTemporada() + " : " + t1.getEpisodiosVistos());
		System.out.println("Calificacion promedio por su temporada " + t1.getNumTemporada() + " : " + t1.getCalificacionTemporada());
		
		
		System.out.println("Episodios vistos en su temporada " + t2.getNumTemporada() + " : " + t2.getEpisodiosVistos());
		//System.out.println("Calificacion promedio por su temporada " + t2.getNumTemporada() + " : " + t2.getCalificacionTemporada());
		
		System.out.println("Episodios vistos en toda su serie:  " + s.getEpisodiosVistosSerie());
		}
}
