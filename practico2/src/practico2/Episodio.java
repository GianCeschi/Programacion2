package practico2;

public class Episodio {

	final int VALOR_MINIMO_CALIFICACION = 1;
	final int VALOR_MAXIMO_CALIFICACION = 5;
	
	private String titulo;
	private String descripcion;
	private boolean visto;
	private int calificacion;
	
	public Episodio(String titulo) {
		this.titulo = titulo;
		this.visto = false; //por defecto
		this.calificacion = -1; //se puede crear una calificacion por defecto -1 si no se vio.
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean getVisto() {
		return visto;
	}
	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	public int getCalificacion() {
		return calificacion;
	}
	  /*
	   Ingresar la calificación de un episodio. Si el valor ingresado como calificación
	   no es correcto imprimir un mensaje por pantalla y no cambiar el valor anterior. 
	   */

	public void setCalificacion(int calificacion) { 
		//tener en cuenta si fue visto o no para calificar (true o false)
		if(getVisto()) {
			if((calificacion>=VALOR_MINIMO_CALIFICACION)&&(calificacion<=VALOR_MAXIMO_CALIFICACION)) {
				this.calificacion = calificacion;
			}
			else {
				System.out.println("No se ingreso un valor valido de calificacion, va a quedar el -1 por defecto");

			}
		}
	}	
}
