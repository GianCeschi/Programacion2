package procesadores;

public class Computadora {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Procesador cpu = new Procesador();
		
		Procesador cpu2 = cpu;
		
	//	cpu.cambiarOrdenamiento(new ColaTareasPrioridad());
		
		cpu.addTarea(new Tarea(10000,100,-1000));
		cpu.addTarea(new Tarea(1,200,5));
		cpu.addTarea(new Tarea(10,10,4));
		cpu.addTarea(new Tarea(100,1,0));
		
		cpu2.cambiarOrdenamiento(new ColaTareasPrioridad());
		
		while(cpu2.tenesTareas()) {
			cpu2.ejecutarTarea();
		}
	}

}
