package tp6_ej1;

import java.time.LocalDate;


public class Alquiler {

	private LocalDate fechaLimite;
	private Cliente cliente;
	private Item itemAlquilado;
	
	public Alquiler(LocalDate fechaLimite, Cliente cliente, Item itemAlquilado) {
		super();
		this.fechaLimite = fechaLimite;
		this.cliente = cliente;
		setItemAlquilado(itemAlquilado);
	}
	
	
	public boolean estaVencido() {
		if(getFechaLimite().isBefore(LocalDate.now())){
			return true;
		}
		else return false;
	}
	
	
	public LocalDate getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(LocalDate fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Item getItemAlquilado() {
		return itemAlquilado;
	}
	
	//PARA QUE SE PUEDA ALQUILAR TIENE QUE ESTAR DISPONIBLE
	public void setItemAlquilado(Item itemAlquilado) {
		if(itemAlquilado.estaDisponible()) {
		this.itemAlquilado = itemAlquilado;
		itemAlquilado.estaLibre();
		}
		else {
			System.out.println("No esta disponible para alquilar: " + itemAlquilado);
		}
	}
	
	public String toString() {
		return "nombre: " + cliente + " - Item " + itemAlquilado + " - Fecha limite alquiler: " + fechaLimite;
	}
	
}
