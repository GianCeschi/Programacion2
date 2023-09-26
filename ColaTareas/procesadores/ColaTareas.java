package procesadores;

import java.util.ArrayList;

public abstract class ColaTareas {

	protected ArrayList<Tarea> tareas;
	
	
	public ColaTareas() {
		tareas = new ArrayList<Tarea>();
	}
	
	public void addTarea(Tarea nueva) {
		int i = 0;
		while (i<tareas.size()&&
				 this.comparar(tareas.get(i),nueva)) {
			i++;
		}
		if (i<tareas.size()) {
			tareas.add(i, nueva);
		}else {
			tareas.add(nueva);
		}	
	}
	
	public abstract boolean comparar(Tarea t1, Tarea t2); 
		
	public boolean hayTareas() {
		return tareas.size()>0;
	}
	
	public Tarea getPrimera() {
		if (tareas.size()>0) {
			return tareas.get(0);
		} else {
			return null;
		}
	}
	
	public void borrarPrimera() {
		if (tareas.size()>0) {
			tareas.remove(0);
		} 
	}
	
	public void vaciar() {
		tareas.clear();
	}

	public abstract ColaTareas getCopiaVacia();
}
