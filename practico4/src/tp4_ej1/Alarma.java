package tp4_ej1;

//1 - Alarma
//Implementar en Java todo el código necesario para el funcionamiento de una alarma. La
//alarma tiene tres variables que indican si: se rompió un vidrio, se abrió una puerta o ventana,
//se detectó un movimiento dentro del domicilio. Cuando se invoca al método comprobar() de
//la alarma, la misma chequea si alguna de sus variables indica que debe hacer sonar la señal
//sonora.
//Crea una clase denominada AlarmaLuminosa que, además de activar la señal sonora,
//encienda una luz cuando alguno de los indicadores está activado.

//Nota: Asumir que hay una clase Timbre, con un método hacerSonar() y una clase Luz con el
//método encender().

public class Alarma {
	
	private boolean abertura;
	private boolean movimiento;
	private boolean vidrio;
	private Timbre t;
	
	
	public Alarma ( boolean abertura, boolean movimiento, boolean vidrio,Timbre t) {
		
		this.abertura = abertura;
		this.movimiento = movimiento;
		this.vidrio = vidrio;
		this.t = t;
	}
	
	public boolean comprobar() {
		if(getAbertura()==true || getMovimiento() == true || getVidrio()==true) {
			return true;
		}
		return false;
	}

	public void activar() {
		if(comprobar()) {
			t.hacerSonar();
		}
	}
	
	public boolean getAbertura() {
		return abertura;
	}

	public void setAbertura(boolean abertura) {
		this.abertura = abertura;
	}

	public boolean getMovimiento() {
		return movimiento;
	}

	public void setMovimiento(boolean movimiento) {
		this.movimiento = movimiento;
	}

	public boolean getVidrio() {
		return vidrio;
	}

	public void setVidrio(boolean vidrio) {
		this.vidrio = vidrio;
	}

	
	
	
}