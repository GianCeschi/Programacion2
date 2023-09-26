package tp3_ej2;

import java.util.ArrayList;

public class Fabrica {

	private ArrayList<Producto> stockProductos; //PRODUCTOS DISPONIBLES EN STOCK.
	private String nombre;

	public Fabrica(String nombre) {
		this.nombre = nombre;
		this.stockProductos = new ArrayList<Producto>();
	}
	
	//LISTADO DE LOS PRODUCTOS EN STOCK CON SU PRECIO DE VENTA MAS SU NOMBRE.
	public String StockPrecioVenta() {
		String listado = "FABRICA: " + getNombre() + "\nListado de productos en Stock para el cliente: \n";
		for(int i = 0; i<stockProductos.size(); i++) {
			Producto p = stockProductos.get(i);
			listado += p.getNombre() + " - Valor de venta: " + p.obtenerPrecioVenta(p) + "\n";
		}
		return listado;
	}
	
	//LISTADO DE LOS PRODUCTOS EN STOCK CON SU PRECIO DE COSTO MAS SU NOMBRE.
		public String StockPrecioCosto() {
			String listado = "FABRICA: " + getNombre() + "\nListado de productos que faltan ponerle precio de venta: \n";
			for(int i = 0; i<stockProductos.size(); i++) {
				Producto p = stockProductos.get(i);
				listado += p.getNombre() + " - Valor de costo: " + p.getCostoFabricacion() + "\n";
			}
			return listado;
		}
		
	
	public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

	public void addProducto(Producto p) {
		if(!stockProductos.contains(p)) {   //ESTO ES NECESARIO PORQUE EN EL STOCK NO PUEDE HABER DOS PRODUCTOS IGUALES/IDENTICOS.
			stockProductos.add(p);
		}
	}
	
	public void removeProducto(Producto p) {
		if(stockProductos.contains(p)) {
			stockProductos.remove(p);  //ELIMINO POR OBJETO.
		}
	}
	
}
