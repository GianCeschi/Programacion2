package vivero;

import java.util.ArrayList;

public class Vivero {

	private String nombre;
	ArrayList<Planta> plantas;
	
	public Vivero(String nombre) {
		this.nombre = nombre;
		this.plantas = new ArrayList<Planta>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Planta> getPlantas(){
		return new ArrayList<Planta>(plantas);
	}
	
	public void addPlanta(Planta p) {
		if(!plantas.contains(p)) {
			plantas.add(p);
		}
	}
	
	//FILTRO PARA BUSCAR SEGUN CONDICION.
	
	public ArrayList<Planta> buscar(Condicion cond){
		ArrayList<Planta> retorno = new ArrayList<Planta>();
		for(int i = 0; i<plantas.size();i++) {
			Planta actual = plantas.get(i);
			if(cond.cumple(actual)) {
				retorno.add(actual);
			}
		}
		return retorno;
	}
}
