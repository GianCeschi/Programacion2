package practico1;

public class MainElectrodomestico {

	public static void main(String[] args) {
		
		Electrodomestico tele = new Electrodomestico();
		Electrodomestico heladera = new Electrodomestico("heladera",25,"negra",15,25);
		
		System.out.println(tele.infoElectrodomestico() + "\n\n");
		System.out.println(heladera.infoElectrodomestico());

	}

}
