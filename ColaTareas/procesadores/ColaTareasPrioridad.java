package procesadores;

public class ColaTareasPrioridad extends ColaTareas {



	@Override
	public boolean comparar(Tarea t1, Tarea t2) {
		
		return t1.getPrio()<t2.getPrio();
	}

	public ColaTareas getCopiaVacia() {
		return new ColaTareasPrioridad();
	}
}
