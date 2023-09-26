package tp6_ej1;

import java.time.LocalDate;

public abstract class ItemCola {
	
	private LocalDate fechaLimiteAlquiler;
	
	public ItemCola(LocalDate fechaLimite) {
		this.fechaLimiteAlquiler = fechaLimite;
	}

	public abstract boolean esMenor(ItemCola otro);

	public LocalDate getFechaLimiteAlquiler() {
		return fechaLimiteAlquiler;
	}

	public void setFechaLimiteAlquiler(LocalDate fechaLimiteAlquiler) {
		this.fechaLimiteAlquiler = fechaLimiteAlquiler;
	}



}
