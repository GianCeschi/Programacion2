package practico2;
import java.util.ArrayList;
import java.time.Duration;
import java.time.LocalTime;
public class Reunion {

	private String lugar;
	private String tema;
	private LocalTime horaInicio;
	private LocalTime horaFin;
	private ArrayList <Asistente> asistentes;
	
	public Reunion(String lugar, String tema,LocalTime horaInicio, LocalTime horaFin){
		this.lugar = lugar;
		this.tema = tema;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
		this.asistentes = new ArrayList<Asistente>();
	}

	public void addUsuario(Asistente a) {
		if(!this.asistentes.contains(a)) {
			this.asistentes.add(a);
		}
	}
	
	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public LocalTime getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(LocalTime horaInicio) {
		this.horaInicio = horaInicio;
	}

	public LocalTime getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(LocalTime horaFin) {
		this.horaFin = horaFin;
	}

	public Duration getDuracion() {
		return (Duration.between(horaFin, horaInicio));
	}
	
	public boolean hayConflicto(Reunion otraReunion) {
		if(otraReunion.horaInicio.isBefore(horaInicio)&&(otraReunion.horaFin.isBefore(horaInicio))||(otraReunion.horaInicio.isAfter(horaFin))) {
			return false;
		}
		else return true;
	}
	
	public static void main(String[]args) {
		AgendaPersonal ap = new AgendaPersonal();
		Reunion r1 = new Reunion("Casa", "Prog2", LocalTime.of(16, 00), LocalTime.of(18, 45) );
		//ap.addReuniones(r1);
		
		Reunion r2 = new Reunion("Casa", "Diseño UX", LocalTime.of(19, 00), LocalTime.of(21, 00) );
		//ap.addReuniones(r2);
		
		Reunion r3 = new Reunion("Casa", "PROG3", LocalTime.of(16, 00), LocalTime.of(18, 45) );
		//ap.addReuniones(r3);
		
		System.out.println(r2.getDuracion());
		
		ap.agregarReunionAgenda(r1);
		ap.agregarReunionAgenda(r2);
		ap.agregarReunionAgenda(r3);
		System.out.println(ap.cantidadReuniones());
		
	}
	
}
