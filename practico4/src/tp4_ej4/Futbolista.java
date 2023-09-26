package tp4_ej4;

import java.time.LocalDate;

public class Futbolista extends Persona {

	private String posicion, pieHabil;
	private int cantGolesConvertidos;
	
	public Futbolista(String nombre, String apellido, String estado, int nroPasaporte, LocalDate nac, String pos, String pie, int cantGoles) {
		super(nombre,apellido,estado,nroPasaporte,nac);
		this.posicion = pos;
		this.pieHabil = pie;
		this.cantGolesConvertidos = cantGoles;
	}
/*
	@Override
	public String getEstado() {
		return super.getEstado();
	}*/
	
	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public String getPieHabil() {
		return pieHabil;
	}

	public void setPieHabil(String pieHabil) {
		this.pieHabil = pieHabil;
	}

	public int getCantGolesConvertidos() {
		return cantGolesConvertidos;
	}

	public void setCantGolesConvertidos(int cantGolesConvertidos) {
		this.cantGolesConvertidos = cantGolesConvertidos;
	}
	
	
}
