package tp4_ej3;

public class Main {

	public static void main(String[]args) {
		Empresa emp = new Empresa("Globant");
		Empleado e1 = new Empleado("COMUN",58000);
		EmpleadoHoraExtra e2 = new EmpleadoHoraExtra(20, 1000, "HORA-EXTRA", 58000);
		EmpleadoComision e3 = new EmpleadoComision(5, 2, "COMISION", 58000);
		
		emp.addEmpleado(e3);
		emp.addEmpleado(e2);
		emp.addEmpleado(e1);
		System.out.println(emp.listaEmpleados());
		
	}
}
