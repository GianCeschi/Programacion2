package candyCrush;

public class FichaEspecial extends Ficha {

	public FichaEspecial(String nombre, int fortaleza,int espacioOcupado) {
		super(nombre,fortaleza,espacioOcupado);
	}
	/*
	public FichaEspecial(String nombre, int fortaleza, int espacioOcupado, int poderDestruccion) { //DUDA INICIAL SI PASARLE PODER DESTRUCCION.
		super(nombre,fortaleza,espacioOcupado,poderDestruccion);								   //PUEDO HACER 2 CONSTRUCTORES Y HEREDA EL QUE .
	}*/																							   //NO TIENE EL PODER DE DESTRUCCION.
	
	//TENDRIA QUE HACER EL OVERRIDE DEL GET DESTRUCCION SI LO QUE QUIERO ES QUE ME REDEFINA LA FORMA DE MOSTRARME EL PODER DESTRUCCION.
	@Override
	public int getPoderDestruccion() {
		return this.getFortaleza() / this.getEspacioOcupado() ;
	}

	@Override
	public String toString() {
		return "FichaEspecial  - PODERDESTRUCCION: " + getPoderDestruccion() ;
	}
	
	
	
}
