package procesadores;

public class ColaTareasCpu extends ColaTareas {



	@Override
	public boolean comparar(Tarea t1, Tarea t2) {
		
		return t1.getCpu()<t2.getCpu();
	}

	@Override
	public ColaTareas getCopiaVacia() {
		return new ColaTareasCpu();
	}

}
