package practico2;


public class Asistente {

	private int telefono;
	private String email;
	
	public Asistente(int telefono,String email) {
		this.telefono = telefono;
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
