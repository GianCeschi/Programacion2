

public class ClienteNormal extends Cliente {

	/// NO ES NECESARIA COMO QUEDO LA SOLUCION
	
	
	
	public ClienteNormal(String nombre, String apellido, int dni, String direccion, double descuento) {
		super(nombre, apellido, dni, direccion, descuento);
		
	}

	@Override
	public boolean leGusta(Producto pp) {
		
		return autores.contains(pp.getAutor());
	}

}
