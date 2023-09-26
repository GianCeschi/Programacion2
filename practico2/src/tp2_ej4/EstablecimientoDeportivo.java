package tp2_ej4;
import java.util.ArrayList;
import java.time.LocalDate;
/*
 4 - Establecimiento deportivo
Un establecimiento deportivo quiere un sistema que le permita organizar los turnos de
las canchas de fútbol y de paddle. El establecimiento posee dos canchas de fútbol 5, y 4
de paddle.
 Las canchas de paddle cuestan 100 pesos la hora y las de fútbol 400. 
 Los turnos se registran a nombres de usuarios, los cuales si son socios del establecimiento
tienen un descuento de 10%. El establecimiento tiene un registro de socios.
 Los socios son gratuitos y para serlo es necesario haber reservado un turno al menos 4 veces en los
últimos dos meses.
 Si no se cumple dicha condición no se considera socio.
 */

//TENGO QUE HACER LA CLASE CANCHA QUE TENGA EL ARREGLO DE LOS TURNOS 
public class EstablecimientoDeportivo {

	private String nombre;
	private int canchasFutbol;
	private int canchasPaddle;
	
	private ArrayList <Usuario> socios;
	
	public EstablecimientoDeportivo(String nombre) {
		this.nombre = nombre;
		this.canchasFutbol = 2; //ACA TENDRIA QUE PASARLE LAS CANCHAS POR PARAMETRO
		this.canchasPaddle = 4; //
		this.socios = new ArrayList<Usuario>();
	}

	
	public String listadoSocios() {
		String listado = "Listado de socios: \n";
		for(int i= 0; i<socios.size();i++) {
			if(this.socios.get(i).EsSocio()) {
				listado +=  this.socios.get(i).getNombre()+"\n";;
			}
		}	
		return listado;
	}
	

	//AGREGO UN SOCIO AL REGISTRO DE SOCIOS.
	public void addSocio(Usuario u) {
			if(!this.socios.contains(u)) {
				this.socios.add(u);
			}
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
