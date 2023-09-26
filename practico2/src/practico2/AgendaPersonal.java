package practico2;
import java.util.ArrayList;

/*Una agenda personal permite registrar reuniones en las que el usuario va a participar. En
tal agenda debe registrarse dónde ocurrirá la reunión, quienes van a participar de ella, el
tema que van a tratar y la duración de la misma. Asimismo, deben registrarse lo
contactos telefónicos y mail de los asistentes.*/

public class AgendaPersonal {

	private  ArrayList <Reunion> reuniones;
	
	public AgendaPersonal() {
		this.reuniones = new ArrayList<Reunion>();
	}

	public void addReuniones(Reunion r) {
		if(!this.reuniones.contains(r)) {
			this.reuniones.add(r);
		}
	}
	//CANTIDAD DE REUNIONES.
	public int cantidadReuniones() {
		return reuniones.size();
	}
	
	public void agregarReunionAgenda(Reunion r1) {
		if(this.reuniones.isEmpty()){  //SI ESTA VACIO EL ARREGLO AGREGA.
			reuniones.add(r1);
		}
		for(int i=0; i<reuniones.size(); i++) {
			Reunion r = reuniones.get(i);
			if(!r.hayConflicto(r1)) {
				reuniones.add(r1);
			}
		}
	}

}
