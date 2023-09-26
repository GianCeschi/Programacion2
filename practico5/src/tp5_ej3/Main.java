package tp5_ej3;

public class Main {

	public static void main(String []args) {
	
	Cooperativa coop = new Cooperativa("Los Alamos");
	Cereal c1 = new Cereal("Trigo");
	Pastura p1 = new Pastura("Pasto");
	Lote l1 = new Lote(51);
	
	coop.addLote(l1);
	coop.addCereal(c1);
	coop.addCereal(p1);
	l1.addMineral("Sodio");
	l1.addMineral("Fosforo");
	c1.addMineral("Sodio");
	c1.addMineral("Fosforo");
	p1.addMineral("Sodio");
	p1.addMineral("Fosforo");
	
	//CEREALES QUE PUEDEN ESTAR EN DETERMINADO LOTE:
	System.out.println(coop.listadoCereales(l1));
	
	if(coop.esEspecial(l1)) {
	System.out.println("El lote es especial");
	}
	else {
		System.out.println("Es comun");
	}
	if(c1.leGustaLote(l1)) {
	System.out.println(c1.getNombre() + " se puede sembrar en el lote");
	}
	else {
		System.out.println(c1.getNombre() + " no se puede sembrar en el lote");
	}
	if(p1.leGustaLote(l1)) {
	System.out.println(p1.getNombre() + " se puede sembrar en el lote");
	}
	else {
		System.out.println(p1.getNombre() + " no se puede sembrar en el lote");
	}
	}
}
