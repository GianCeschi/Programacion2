package practico1;

public class Electrodomestico {

	private String nombre;
	private double precioBase;
	private String color;
	private double consumoEnergetico;
	private double peso;
	
	public Electrodomestico() {
		this("televisor");
	}
	
	public Electrodomestico(String nombre) {
		this(nombre,50000);
	}
	

	public Electrodomestico(String nombre, double precioBase) {
		this(nombre,precioBase,"gris plata");
	}
	

	public Electrodomestico(String nombre, double precioBase, String color) {
		this(nombre,precioBase,color,10);
	}
	

	public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico) {
		this(nombre,precioBase,color,consumoEnergetico, 2);
	}
	

	public Electrodomestico(String nombre, double precioBase, String color, double consumoEnergetico, double peso) {
		this.nombre = nombre;
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(double consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean bajoConsumo() {
		if(getConsumoEnergetico()<45) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double balance(){
		double balance;
		balance = precioBase/peso;
		return balance;
	}
	
	public boolean esAltaGama() {
		if(balance()>3) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String infoElectrodomestico() {
		String info = ""; 
		if(bajoConsumo()) {
			info += "El electrodomestico: " + nombre + " es de bajo consumo \n";
		}
		else {
			info += "El electrodomestico: " + nombre + " no es de bajo consumo \n";
		}
		
		info += "El balance es de " + balance() + " \n";
		
		if(esAltaGama()) {
			info += "El electrodomestico es de alta gama";
		}
		else {
			info +="El electrodomestico no es de alta gama";
		}
		return info;
	}
}
