package tp7a_ej1;

public class Main {

	public static void main(String[] args) {
		EmpresaAgricola empresa = new EmpresaAgricola("Los hermanos");
		ProductoQuimico pq = new ProductoQuimico("fertilizante");
		ProductoQuimico pq2 = new ProductoQuimico("prueba2");
		Cultivo c1 = new Cultivo("girasol");
		Cultivo c2 = new Cultivo("maiz");
		Cultivo c3 = new Cultivo("lino");
		Enfermedad e1 = new Enfermedad("Cochinilla");
		Enfermedad e2 = new Enfermedad("Pulgon");
		Enfermedad e3 = new Enfermedad("Araña roja");
		
		c1.addEnfermedad(e1);
		c1.addEnfermedad(e2);
		c1.addEnfermedad(e3);
		e1.addEstadoPatalogico("caida de frutos");
		
		//pq.addCultivo(c1); //DESACONSEJADO.
		pq.addCultivo(c2);
		pq.addCultivo(c3);
		pq.addEstadoPatalogico("caida de frutos");
		pq2.addEstadoPatalogico("caida de frutos");
		pq2.addCultivo(c1); //DESACONSEJADO.
		
		empresa.addAgroquimico(pq);
		empresa.addAgroquimico(pq2);
		empresa.addCultivo(c1);
		empresa.addEnfermedad(e1);
		
		System.out.println(empresa.getAgroquimicosTratanEnfermedadDeterminada(e1));
		System.out.println(empresa.getListaAgroquimicosPuedenTratar(e1,c1));
	}

}
