package tp2_ej4;

import java.util.ArrayList;

public class Cancha {
	public final int CANCHAS_FUTBOL = 2;
	public final int CANCHAS_PADDLE = 4;
	private int canchasFutbol;
	private int canchasPaddle;
	private String nombreCancha;
	private ArrayList <Usuario> turnos;
	
	public Cancha(String nombre) {
		canchasFutbol = CANCHAS_FUTBOL;
		canchasPaddle = CANCHAS_PADDLE;
		nombreCancha = nombre;
		this.turnos = new ArrayList<Usuario>();
	}

	
	public boolean chequeoDiaDisponible() {
		boolean encontre = false;
		for(int i = 0; i<turnos.size(); i++) {
			if(turnos.get(i).getDiaReserva()!=turnos.get(i+1).getDiaReserva()) {
				encontre = true;
			}	
		}
		return encontre;
	}

	public String listadoTurnos() {
		String listado = "Registro de turnos:\n";
		for(int i = 0; i<turnos.size();i++) {
			listado += turnos.get(i).getNombre() + " - Deporte/s: "+  turnos.get(i).deporteJuega() + " Dia: " + turnos.get(i).getDiaReserva() + "\n";
		}
		return listado;
	}
	
	public void addTurno(Usuario u) {
		if(u.getJuegaFutbol()) {
			if(!turnos.contains(u)) {
				turnos.add(u);
			}
		}
		else if(u.getJuegaPaddle()) {
				turnos.add(u);
		}
		else if(u.getJuegaFutbol()&& u.getJuegaPaddle()) {
			turnos.add(u);
		}
		
	}
	
	public void removeTurno(Usuario u) {
		if(turnos.contains(u)) {
			turnos.remove(u);
		}
	}
	
	public String getNombreCancha() {
		return nombreCancha;
	}

	public void setNombreCancha(String nombreCancha) {
		this.nombreCancha = nombreCancha;
	}
	
	
	public int getCanchasFutbol() {
		return canchasFutbol;
	}
	public void setCanchasFutbol(int canchasFutbol) {
		this.canchasFutbol = canchasFutbol;
	}
	public int getCanchasPaddle() {
		return canchasPaddle;
	}
	public void setCanchasPaddle(int canchasPaddle) {
		this.canchasPaddle = canchasPaddle;
	}
	
	
}
