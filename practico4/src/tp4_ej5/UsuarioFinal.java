package tp4_ej5;

public class UsuarioFinal extends Persona {

	private String nombreUsuario, password;
	
	public UsuarioFinal(String nombre, String apellido, String cargo, int edad, String nombreUsuario, String password) {
		super(nombre, apellido, cargo, edad);
		this.nombreUsuario = nombreUsuario;
		this.password = password;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
