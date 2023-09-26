package procesadores;

public class Tarea {

	private int prio;
	private double cpu;
	private double memoria;
	public Tarea(int prio, double cpu, double memoria) {
		super();
		this.prio = prio;
		this.cpu = cpu;
		this.memoria = memoria;
	}
	public int getPrio() {
		return prio;
	}
	public void setPrio(int prio) {
		this.prio = prio;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public double getMemoria() {
		return memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	
	public void ejecutarTarea() {
		System.out.println("Se ejecuto la tarea" +
	                        prio+":" + cpu + ":" +
				            memoria);
	}
	
	
}
