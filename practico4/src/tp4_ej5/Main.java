package tp4_ej5;

public class Main {

	public static void main(String[] args) {
		Empresa emp = new Empresa("Globant");
		Empleado e1 = new Empleado("Gian", "Ceschi", "Empleado", 24, 205489, 190000);
		Empleado e2 = new Empleado("Manu", "Gomez", "Empleado", 29, 895489, 125300);
		UsuarioFinal u1 = new UsuarioFinal("Pablo","Perez","Usuario final",30,"Pablin787","hola1234");
		Jerarquico j1 = new Jerarquico("Pepe","Lopez","Jerarquico",60,1964,350000);
		
		emp.addPersona(e1);
		emp.addPersona(e2);
		emp.addPersona(u1);
		emp.addPersona(j1);
		j1.addEmpleado(e1);
		j1.addEmpleado(e2);
		
		
		System.out.println(emp.ListadoAsociados());
		System.out.println(j1.listaEmpleadosACargo());
	}

}
