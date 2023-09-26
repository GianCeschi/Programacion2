package tp6_ej2;

import java.util.ArrayList;

public class ColaEspera {
	
	private ArrayList<ElementoCola>elementos;
	
	public ColaEspera() {
		elementos = new ArrayList<ElementoCola>();
	}
	
	
	//PUEDE SER UNA PC O PROCESO. 
	//PARA IR SACANDO LOS ELEMENTOS DE LA LISTA. LO ELIMINA Y LO RETORNA!!!!!
	
	public ElementoCola getSiguiente() {
		if(this.tieneElementos()) {     //CHEQUEO SI TIENE ELEMENTOS. Y DEVUELVO EL PRIMERO.
			return elementos.remove(0);
		}
		else 
			return null; //NO TIENE ELEMENTOS.
	}
	
	public boolean tieneElementos() {
		return !elementos.isEmpty() ;
	}
	
	
	//LA IDEA ES CREAR UNA COLA DE ESPERA GENERICA YA SEA PARA COMPUTADORAS Y PARA PROCESOS.
	//LE PASO UN OBJETO YA NO LE PASO COMPU O PROCESO Y NO TENGO QUE HACER DOS METODOS PORQUE ESTARIA EN LA MISMA DEL INICIO
	//NO TENGO QUE HACER DOS METODOS PARA AGREGAR UNA COMPU O UN PROCESO. ESTO SE REALIZA EN TIEMPO DE EJECUCION.
	
	//TENGO DISTINTOS ELEMENTOS PARA INSERTAR.
	public void addElemento(ElementoCola elemento) {
		boolean inserto = false;
		int i = 0;
		while(!inserto && i<elementos.size()) {
			//if(elemento.getVelocidadCpu()>elementos.get(i).getVelocidadCpu()) { EL ESMAYOR ES LO QUE HAY QUE ABSTRAER PORQUE EN TIEMPO DE EJ VOY A SABER QUE ES.
			
			  if( elemento.esMayor(elementos.get(i))) { //UN ELEMENTO VA A SABER SI ES MAYOR QUE OTRO ELEMENTO.
				elementos.add(i, elemento);
				inserto = true;
			}
			i++;
		}
		if(!inserto) {
			elementos.add(elemento);
		}
	}
	
	
	
	/*
	boolean inserto = false;
	int i = 0;
	while(!inserto && i<procesos.size()) {
		if(proc.getMemoriaRequerida()>procesos.get(i).getMemoriaRequerida()) {
			procesos.add(i, proc);
			inserto = true;
		}
		i++;
	}
	if(!inserto) {
		procesos.add(proc);
	}*/
}
