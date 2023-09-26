package tp3_ej2;


/*
 Una fábrica de muebles desea organizar su manufactura de manera electrónica. La fábrica solo produce sillas, mesas y bancos.
 De cada uno de los productos guarda su peso, su costo de fabricación, el valor de venta, el tipo de madera y el color.
 
 La fábrica también posee un stock de productos disponibles.
 
 Se debe poder calcular el costo de todos los productos en stock, ya sea precio de fabricación o precio de venta. 
 El precio de Venta es el precio de costo más un 35%

Consejo: Analizar Clase Vs Instancia

Extra: ¿Qué sucede si se agrega un producto cuyo precio de venta es el 10% más del
costo de fabricación?

//tengo que agregarle otro constructor al producto en donde agrego el porcentaje como atributo asi que si un producto quiere 
//cambiar el porcenaje de venta se lo paso por parametro y si no le paso nada dejo 35.0

 * */
public class Producto {

	public static final double PORCENTAJE = 35.0;//NO ES NECESARIA
	
	private String nombre;
	private double peso;
	private double costoFabricacion;
	private String tipoMadera;
	private String color;
	private double porcentajeVenta;
	
	public Producto(String nombre, double peso, double costo, String tipoMadera, String color) { 
		this(nombre,peso,costo,tipoMadera,color,PORCENTAJE); //PASO TODOS LOS PARAMETROS Y EL ULTIMO VALOR.
	}
	
	public Producto(String nombre, double peso, double costo, String tipoMadera, String color,double porcentaje) { 
		this.nombre = nombre;													//NO LE PASO EL PRECIO DE VENTA PORQUE ESO LO CALCULO CON UN METODO.
		this.peso = peso;
		costoFabricacion = costo;
		this.tipoMadera = tipoMadera;
		this.color = color;
		this.porcentajeVenta = porcentaje; //COMO LE DEJO EL 35% POR DEFECTO
	}

	public double obtenerPrecioVenta(Producto p) {
		double porcentaje = p.porcentajeVenta; //CONSTANTE POR SI CAMBIA (NOO) LE AGREGAMOS A CADA PRODUCTO EL PORCENTAJE DE VENTA QUE AGREGA.
		double valorPorcentaje = (porcentaje/100.0) * p.getCostoFabricacion(); //ACA CALCULO EL VALOR DEL PORCENTAJE, DESPUES LO DEVUELVO SUMANDO EL COSTO.
		return p.costoFabricacion + valorPorcentaje;//Esto se puede volver el valor de venta.
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getCostoFabricacion() {
		return costoFabricacion;
	}

	public void setCostoFabricacion(double costoFabricacion) {
		this.costoFabricacion = costoFabricacion;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}

	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
