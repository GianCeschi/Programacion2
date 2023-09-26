package tp6_ej1;


public class Vehiculo extends Item {

	private String marca;
	private double kms;
	private String patente;
	private String tipoCombustible;
	private boolean disponible;
	
	public Vehiculo(String marca, double kms, String patente, String tipoCombustible) {
		this.marca = marca;
		this.kms = kms;
		this.patente = patente;
		this.tipoCombustible = tipoCombustible;
		this.disponible = true; //ARRANCA DISPONIBLE
	}


	@Override
	public boolean estaDisponible() {
		return disponible;
	}
	
	public boolean estaLibre() {
		return this.disponible = false;
	}
	
	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double getKms() {
		return kms;
	}


	public void setKms(double kms) {
		this.kms = kms;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}
	
	public String toString() {
		return "Auto - marca : " + marca + " - Kms: " + kms; 
	}
}
