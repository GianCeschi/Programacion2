package tp3_ej2;

public class Main {

	public static void main(String[] args) {
		Fabrica f = new Fabrica ("CESCHI");
		Producto p1 = new Producto("Mesa",120.0,8500,"Algarrobo","Marron");
		Producto p2 = new Producto("Silla",70.0,4200,"Algarrobo","Negra");
		Producto p3 = new Producto("Banco",100.0,5000,"Pino","Blanco", 10);
		
		f.addProducto(p1);
		f.addProducto(p2);
		f.addProducto(p3);

		System.out.println(f.StockPrecioVenta());
		System.out.println(f.StockPrecioCosto());
	}

}
