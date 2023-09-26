package tp7a_ej1;

import java.util.ArrayList;


public class EmpresaAgricola {

	private String nombre;
	private ArrayList<ProductoQuimico> agroquimicos;
	private ArrayList<Enfermedad> enfermedades;
	private ArrayList<Cultivo> cultivos;
	
	public EmpresaAgricola(String nombre) {
		this.nombre = nombre;
		this.agroquimicos = new ArrayList<ProductoQuimico>();
		this.enfermedades = new ArrayList<Enfermedad>();
		this.cultivos = new ArrayList<Cultivo>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addAgroquimico(ProductoQuimico pq) {
		if(!agroquimicos.contains(pq)) {
			agroquimicos.add(pq);
		}
	}
	
	public void addEnfermedad(Enfermedad e) {
		if(!enfermedades.contains(e)) {
			enfermedades.add(e);
		}
	}
	
	public void addCultivo(Cultivo c) {
		if(!cultivos.contains(c)) {
			cultivos.add(c);
		}
	}
	
	//1) Proveer un listado de agroquímicos que puedan tratar una enfermedad determinada.

	public ArrayList<ProductoQuimico> getAgroquimicosTratanEnfermedadDeterminada(Enfermedad e){
		ArrayList<ProductoQuimico> retorno = new ArrayList<>();
		for(int i=0; i<agroquimicos.size();i++) {
			ProductoQuimico actual = agroquimicos.get(i);
			if(e.seContienenTodosEstadosPatologicos(actual)) {
				retorno.add(actual);
			}
		}
		return retorno;
	}


	/*2) Dado un cultivo y una enfermedad devolver el listado de agroquímicos con los
	pueden tratar. Tener en cuenta que ciertos agroquímicos no pueden aplicarse sobre
	determinados cultivos.	 */
	//LE PASO UNA ENFERMEDAD DETERMINADA Y UN CULTIVO QUE ES EL QUE SE ENCARGA DE SABER SI SIRVE O NO.
	//, los cultivos son capaces de decir si en algún momento puede serle de utilidad o no,

	public ArrayList<ProductoQuimico> getListaAgroquimicosPuedenTratar( Enfermedad enfermedad,Cultivo cultivo ){
		ArrayList<ProductoQuimico> retorno = new ArrayList<>();
		for (int i = 0; i < agroquimicos.size(); i++) {
			ProductoQuimico actual = agroquimicos.get(i);
			if ( actual.puedeTratarEnfermedad(enfermedad,cultivo) )
				retorno.add(agroquimicos.get(i));
		}
		return retorno;
	}


	
	
	
	
	
	
	
}
