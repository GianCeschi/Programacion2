package tp5_ej2;

public class CasaSangrePura extends Casa {

	public CasaSangrePura(String nombre, int cantMaximaAlumnos) {
		super(nombre,cantMaximaAlumnos);
	}
	
	@Override
	public boolean cumpleTodasCualidades(Alumno a) {
		if(super.cumpleTodasCualidades(a)&&tieneFamiliarEnCasa(a)) {
			return true;
		}
		else return false;
	}
	
	public boolean tieneFamiliarEnCasa(Alumno a) {
		for(int i=0; i<alumnos.size();i++) {
			Alumno fam = alumnos.get(i);   //me quedo con el alumno y se lo paso al alumno y chequeo si esta en su array de familiares.
			if(!a.tieneFamiliar(fam)) {
				return false;
			}
		}
		return true;
	}
}
