package practico1;

public class Rectangulo {
	private PuntoGeometrico p1;
	private PuntoGeometrico p2;
	private PuntoGeometrico p3;
	private PuntoGeometrico p4;
	//private double lado1;
	//private double lado2; NO SON ATRIBUTOS SINO QUE SON CALCULOS PORQUE TENGO SOLO LOS VERTICES.
	
	public Rectangulo(PuntoGeometrico p1, PuntoGeometrico p2, PuntoGeometrico p3, PuntoGeometrico p4) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
	}

	public PuntoGeometrico getP1() {
		return p1;
	}

	public void setP1(PuntoGeometrico p1) {
		this.p1 = p1;
	}

	public PuntoGeometrico getP2() {
		return p2;
	}

	public void setP2(PuntoGeometrico p2) {
		this.p2 = p2;
	}

	public PuntoGeometrico getP3() {
		return p3;
	}

	public void setP3(PuntoGeometrico p3) {
		this.p3 = p3;
	}

	public PuntoGeometrico getP4() {
		return p4;
	}

	public void setP4(PuntoGeometrico p4) {
		this.p4 = p4;
	}
	
	//DESPLAZAR RECTANGULO EN EL PLANO
	
	public void desplazarRectangulo() { //CORREGIR.
		p1.desplazarPunto(2, 0);
		p2.desplazarPunto(2, 0);
		p3.desplazarPunto(0, 0);
		p4.desplazarPunto(0, 0);
	}
	
	public double lado1() {
		return p1.getCoordX() - p4.getCoordX(); //CALCULO EL LADO 1 QUE SERIA EL QUE ESTA SOBRE EL EJE X.
	}
	public double lado2() {
		return p2.getCoordY() - p1.getCoordY(); //CALCULO EL LADO 2 QUE SERIA EL QUE ESTA SOBRE EL EJE Y.
	}
	
	public double calcularArea() {
		return lado1()*lado2();
	}
	
	/*  Compararlo con otro rectángulo. Devolver 1 si el rectángulo es mayor, 0 si son
		iguales y -1 si es menor. Se dice que un rectángulo es mayor que otro si el área
		del mismo es mayor que la del otro. */
	
	public int compararRectangulo(Rectangulo rec) {
		if(this.calcularArea()>rec.calcularArea()) {
			return 1;
		}else if(this.calcularArea()>rec.calcularArea()){
			return -1;
		}else {
			return 0;
		}
	}
	
	/*  Determinar si el rectángulo es un cuadrado, es decir, decidir si se cumplen las
		propiedades para que sea un cuadrado.*/
	
	public boolean esCuadrado() {
		if(lado1()==lado2()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	//Determinar el largo del lado superior.
	
	public double largoLadoSuperior() {
		return p2.getCoordX() - p3.getCoordX();   //ES LO MISMO QUE MOSTRAR EL LARGO DEL LADO 1.
 	}
	
	//Determinar si está acostado o parado (si el alto es más que el ancho). 

	public boolean estaAcostado() {
		if(lado1()>lado2()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[]args) {
		PuntoGeometrico p1 = new PuntoGeometrico(6,2);
		PuntoGeometrico p2 = new PuntoGeometrico(6,3);
		PuntoGeometrico p3 = new PuntoGeometrico(3,3);
		PuntoGeometrico p4 = new PuntoGeometrico(3,2);
		Rectangulo rec = new Rectangulo(p1,p2,p3,p4);
		Rectangulo otroRec = new Rectangulo(p1,p2,p3,p4);

		System.out.println("Lado 1 mide " + rec.lado1() + "cm");
		System.out.println("Lado 2 mide " + rec.lado2() + "cm");
		System.out.println("El area del rectangulo es: "+rec.calcularArea());

		if(rec.compararRectangulo(otroRec)>0) {
			System.out.println("El primer rectangulo es mayor");
		}else if(rec.compararRectangulo(otroRec)<0) {
			System.out.println("El primer rectangulo es menor");
		}else {
			System.out.println("Los rectangulos son iguales");
		}
		System.out.println("El largo del lado superior mide: " + rec.largoLadoSuperior() + "cm");
		
		if(rec.estaAcostado()) {
			System.out.println("El rectangulo esta acostado");
		}else {
			System.out.println("El rectangulo esta parado");
		}
		rec.desplazarRectangulo();
		System.out.println("Lado 1 mide " + rec.lado1() + "cm");
		System.out.println("Lado 2 mide " + rec.lado2() + "cm");
	}

}
