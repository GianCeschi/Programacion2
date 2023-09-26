package tp5_ej2;

public class CasaEnemistada extends Casa {

	private Casa casaEnemiga;  
	
	public CasaEnemistada(String nombre, int cantMaximaAlumnos, Casa casaEnemiga) {
		super(nombre,cantMaximaAlumnos);
		this.casaEnemiga = casaEnemiga;
	}
	
	/*Y por último, hay casas que a lo largo de su historia se han encontrado enemistadas. En
	el caso en el que la casa tenga una enemistad con otra, además de exigir al alumno tener todas
	las cualidades, se debe controlar que dicho alumno no pueda ser aceptado por la casa
	enemiga.
	 */
	
	public Casa getCasaEnemiga() {
		return casaEnemiga;
	}



	public void setCasaEnemiga(Casa casaEnemiga) {
		this.casaEnemiga = casaEnemiga;
	}

	
	//EL SUPER SOLO LO PUEDO HACER EN EL MISMO METODO DEL HIJO.
	
	@Override
	public boolean cumpleTodasCualidades(Alumno a) {
		return super.cumpleTodasCualidades(a)&& rechazadoCasaEnemiga(a);
	}
	
	public boolean rechazadoCasaEnemiga(Alumno a) {
		if(getCasaEnemiga().cumpleTodasCualidades(a)) {
			return false;
		}
		else return true;
	}
	
	
	
	
}
