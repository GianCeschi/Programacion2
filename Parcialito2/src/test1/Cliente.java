package test1;

public class Cliente extends Persona{
    private int legajo;

    public Cliente(String nombre, int legajo) {
        super(nombre);
        this.legajo = legajo;
    }

    public void skajksd() {
    	super();
    }
    public String toString(String empresa) {
        return super.toString() + " legajo: "+
                legajo + " empresa: "+empresa;
    }

    public static void main(String[] args) {

    	Cliente emp1 = new Cliente("Carmelo Garcia", 1234);
    	System.out.println(emp1);

    }
}