package tp5_ej5;

public class Main {

	public static void main(String[]args) {
		Empresa em = new Empresa("Globant");
		Empleado e1 = new Empleado("Juan","Hernandez",27832123, 17000);
		EmpleadoVendedor e2 = new EmpleadoVendedor("Martin","Martin",25669885, 15000,5,1);
		EmpleadoVendedor e3 = new EmpleadoVendedor("Pablo","Pablo",33544112, 13000,10,1);
		EmpleadoBono e4 = new EmpleadoBono("Julian","Julian",41255444, 10500,40);
		EmpleadoBono e5 = new EmpleadoBono("Mauro","Mauro",37550111, 25000,115);
		
		em.addEmpleado(e1);
		em.addEmpleado(e2);
		em.addEmpleado(e3);
		em.addEmpleado(e4);
		em.addEmpleado(e5);
		
		System.out.println(em.listado());
		System.out.println(em);
	}
}
