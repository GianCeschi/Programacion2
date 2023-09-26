package tp4_ej4;

import java.time.LocalDate;

public class Entrenador extends Persona {

	private int idFederacion;
	
	public Entrenador(String nombre, String apellido, String estado, int nroPasaporte, LocalDate nac, int id) {
		super(nombre, apellido, estado, nroPasaporte, nac);
		this.idFederacion = id;
	}

	public int getIdFederacion() {
		return idFederacion;
	}
	
	//NO HAY SET PORQUE NO QUIERO QUE SE PUEDAN CAMBIAR DE FEDERACION.
}
