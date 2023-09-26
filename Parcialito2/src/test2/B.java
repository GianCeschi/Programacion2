package test2;

import test1.A;

public class B extends A {
	public B(int numerito) {
		super(numerito);
	}
	
	public int metodo() {
		return this.numerito*2; //DA ERROR PORQUE NO LO CONOCE AL ESTAR EN OTRO PAQUETE AL NO TENER MODIFICADOR
	}
}