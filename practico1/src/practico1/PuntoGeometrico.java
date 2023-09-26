package practico1;

public class PuntoGeometrico {

	private int coordX;
	private int coordY;
	
	public PuntoGeometrico() {
		this(0);
	}
	
	public PuntoGeometrico(int x) {
		this(x,0);
	}
	
	public PuntoGeometrico(int x, int y) {
		this.coordX = x;
		this.coordY = y;
	}
	
	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	//DESPLAZAR EN EL PUNTO PLANO
	
	public int incrementarX(int desplazamientoX) {
		return this.coordX  +=  desplazamientoX; //SIMPLIFICAMOS MUCHO!
	
	}
	
	public int incrementarY(int desplazamientoY) {
		int nuevoValorY;
		nuevoValorY = this.coordY + desplazamientoY; //PUEDO SIMPLIFICAR!
		return nuevoValorY;
	}
	
	public void desplazarPunto(int incrementoX, int incrementoY) {
		setCoordX(getCoordX() + incrementarX(incrementoX));
		setCoordY(getCoordY() + incrementarY(incrementoY));
	}
	
	/* Calcular la distancia euclídea. Dado un punto es posible establecer la distancia
	   euclídea con otro punto acorde a la siguiente formula:
       Distancia2 = ( X1 – X2 )2 + (Y1 – Y2)2
    */
	
	/*public double distanciaEuclidea(int x2, int y2) {
		return  Math.sqrt((getCoordX() - x2) * (getCoordX() - x2) + (getCoordY() - y2) * (getCoordX() - y2));
	}*/
	
	//MEJOR FORMA DE HACERLO. ORIENTADO A OBJETOS
	
	public double distanciaEuclidea(PuntoGeometrico nuevoPunto) {
		return  Math.sqrt((getCoordX() - nuevoPunto.getCoordX()) * (getCoordX() - nuevoPunto.getCoordX()) + 
				(getCoordY() - nuevoPunto.getCoordY()) * (getCoordX() - nuevoPunto.getCoordY()));
	}
	
	public static void main(String[]args) {
		PuntoGeometrico punto = new PuntoGeometrico();
		PuntoGeometrico nuevoPunto = new PuntoGeometrico(5,0);//PUEDO CREAR ACA EL NUEVO PUNTO O DIRECTO EN EL PARAMETRO
		punto.desplazarPunto(5, 20);
		System.out.println("Coordenadas: (" + punto.getCoordX() + "," + punto.getCoordY() + ")" );
		
		System.out.println(punto.distanciaEuclidea(nuevoPunto)); 
		//System.out.println(punto.distanciaEuclidea(new PuntoGeometrico(5,0)));  //INSTANCIO UN NUEVO PUNTO GEOMETRICO Y SE LO PÀSO POR PARAMETRO. (OTRA)
	}
}
