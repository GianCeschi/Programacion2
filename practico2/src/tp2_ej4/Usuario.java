package tp2_ej4;

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

//import java.time.LocalTime;
import java.time.LocalDate;
//import java.time.Month;

public class Usuario {

	final int RESERVA_MINIMA = 4; //RESERVAS MINIMAS PARA SER SOCIO.
	//final int DESCUENTO_SOCIOS = 10%;
	
	private String nombre;
	private boolean esSocio;
	private boolean juegaPaddle; //100 ESTO TIENE QUE RETORNAR SI ES TRUE
	private boolean juegaFutbol; //400
	private int reservas; //cantReservas de la persona
	private LocalDate diaReserva;
	//private LocalTime horaReserva; //TENGO QUE CHEQUEAR COMO EN EL TIEMPO DE RESERVA
	
	public Usuario(String nombre, boolean juegaPaddle, boolean juegaFutbol, LocalDate diaReserva /*LocalTime horaReserva*/) {
		this.nombre = nombre;
		this.esSocio = false;
		this.juegaPaddle = juegaPaddle;
		this.juegaFutbol = juegaFutbol;
		this.diaReserva = diaReserva;
		//this.horaReserva = horaReserva;
		reservas = 0;
	}
	
	//CHEQUEO SI CUMPLE LAS CONDICIONES PARA SER SOCIO
	public boolean condicionParaSocio() {
		if((this.reservas>=RESERVA_MINIMA)&&(reservasUltimosDosMeses())) {
			this.esSocio = true;
		}
		return this.esSocio;  //VER SI FUNCIONA ESTO.
	}
	
	//CHEQUEO LAS RESERVAS DE LOS ULTIMOS DOS MESES
	public boolean reservasUltimosDosMeses() {
		LocalDate fechaActual = LocalDate.now();

		// Resta dos meses
		LocalDate haceDosMeses = fechaActual.minusMonths(2);

		if (this.diaReserva.isAfter(haceDosMeses) && this.diaReserva.isBefore(fechaActual)) {
			if(cantReservas()>RESERVA_MINIMA) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	public int cantReservas() {
		return this.reservas;
	}
	//INCREMENTA LAS RESERVAS.
	public int incrementarReserva() {
		return this.reservas + 1;
		
	}
	
	//MONTO A RETORNAR SEGUN EL DEPORTE
	public double pagoDeporte() {
		int pago = 0;
		if(juegaFutbol && juegaPaddle) {
			pago += 500;
		}
		else if(juegaFutbol) {
			pago += 400; //HACERLO CONSTANTE.
		}
		else if(juegaPaddle) {
			pago += 100;
		}
		return pago;
	}
	
	public String deporteJuega() {
		String deporte = "";
		if(juegaFutbol) {
			deporte += " Futbol 5 ";
		}
		 if(juegaPaddle) {
			deporte += " Paddle ";
		}
		return deporte;
	}
	
	//ASI CALCULO UN PORCENTAJE
	public double descuentoSocios() {
		double porcentaje = 0.10;
		double descuento = 0;
		if(esSocio) {
			if((juegaFutbol)||(juegaPaddle)) {
				double valorPorcentaje = pagoDeporte() * porcentaje ;
				 descuento = pagoDeporte() - valorPorcentaje;
			}
		}
		return descuento;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean EsSocio() {
		if(condicionParaSocio()) {
		return esSocio;
		}
		else {
			return esSocio;
		}
	}

	public void setEsSocio(boolean esSocio) {
		this.esSocio = esSocio;
	}

	public boolean getJuegaPaddle() {
		if(juegaPaddle) {
			incrementarReserva();
		}
		return juegaPaddle;
	}

	public void setJuegaPaddle(boolean juegaPaddle) {
		this.juegaPaddle = juegaPaddle;
	}

	public boolean getJuegaFutbol() {  //INCREMENTA LAS RESERVAS SEGUN LO QUE JUEGA
		if(juegaFutbol) {
			incrementarReserva();
		}
		return juegaFutbol;
	}

	public void setJuegaFutbol(boolean juegaFutbol) {
		this.juegaFutbol = juegaFutbol;
	}

	public int getReservas() {
		return reservas;
	}

	public void setReservas(int reservas) {
		this.reservas = reservas;
	}

	public LocalDate getDiaReserva() {
		return diaReserva;
	}

	public void setDiaReserva(LocalDate diaReserva) {
		this.diaReserva = diaReserva;
	}
/*
	public LocalTime getHoraReserva() {
		return horaReserva;
	}

	public void setHoraReserva(LocalTime horaReserva) {
		this.horaReserva = horaReserva;
	}
	
	*/
}
