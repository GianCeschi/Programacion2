package tp4_ej1;

public class AlarmaLuminosa extends Alarma{
	
	private Luz l;
	
	public AlarmaLuminosa(boolean abertura, boolean movimiento, boolean vidrio, Timbre t,Luz l) {	
		super(abertura, movimiento, vidrio,t);
		this.l = l;
	}
	
	//@Override
	public boolean comprobar() {
		return super.comprobar();
	}

	public void activar() {
		if(comprobar()) {
			super.activar();
			l.encender();
		}
	}

}