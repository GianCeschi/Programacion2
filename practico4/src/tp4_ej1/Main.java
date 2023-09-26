package tp4_ej1;

public class Main {
	public static void main(String[]args) {
		Timbre t = new Timbre("timbre");
		Luz l = new Luz("luz");
		Alarma a = new Alarma(true,false,false,t);
		AlarmaLuminosa aLuminosa = new AlarmaLuminosa(true, false, false, t, l);
		
	
		a.activar();
		aLuminosa.activar();
		
	}
}
