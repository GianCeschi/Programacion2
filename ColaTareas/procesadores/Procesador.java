package procesadores;

import java.util.ArrayList;

public  class Procesador {

	protected ColaTareas elementos;
	
	public Procesador(ColaTareas nueva) {
	//	tareas = new ArrayList<Tarea>();
		//INICIALIZAR ELEMENTOS
		elementos = nueva;
	}
	public Procesador() {
	
		elementos = new ColaTareasCpu();
	}
	
	public void addTarea(Tarea nueva) {
		elementos.addTarea(nueva);
	}
	
	
		
	public void ejecutarTarea() {
		
		if (elementos.hayTareas()) {
			Tarea aux = elementos.getPrimera();
			aux.ejecutarTarea();
			elementos.borrarPrimera();
		}
	}
		
	public boolean tenesTareas() {
		return elementos.hayTareas();
	}
	
	public void cambiarOrdenamiento(ColaTareas nueva) {
	//	nueva.vaciar();
		ColaTareas tt = nueva.getCopiaVacia();
		while(elementos.hayTareas()) {
			tt.addTarea(elementos.getPrimera());
			elementos.borrarPrimera();
		}
		elementos = tt;
	}
		
		
	
	
	
}
