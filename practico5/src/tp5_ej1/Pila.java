package tp5_ej1;
import java.util.Deque;
import java.util.LinkedList;

/*
 Implementar en Java una pila de elementos. A una pila se le pueden agregar elementos
utilizando el método push(Object o). Para retirar elementos de la pila se utiliza el método
pop(), que retorna el último elemento agregado y lo elimina de la misma. Es posible
consultar el tope de la pila sin eliminarlo utilizando el método top(). La mencionada
anteriormente es la única forma de consultar y retirar elementos de la pila, es decir, no se
pueden obtener ni consultar elementos de otra posición que no sea el tope de la pila. Definir
también los siguientes métodos:
● size(): retorna la cantidad de elementos almacenados
● copy(): retornar una nueva pila con una copia de los elementos de la pila original, en
el mismo orden. La pila original debe mantener el orden de los elementos.
● reverse(): retorna una copia de la pila pero con los elementos en el orden inverso.

*/
public class Pila {
	Deque<Integer> pila = new LinkedList<>();

	public void addElementoPila(Integer i) {
		pila.push(i);
	}
	
	public void removeElementoPila() {
		pila.pop();
	}
	
	public void topePila() {
		pila.peek();   //ES LO MISMO QUE TOP.
	}
	
	public void cantidadElementosPila() {
		pila.size();
	}
	/*
	public void copiarPila() {
		pila.copy();
	}
	
	public void pilaInvertida() {
		pila.reverse();
	}*/
	
	public static void main(String []args) {
		Deque<Integer> pila = new LinkedList<>();

		
		pila.push(1);
		pila.push(2);
		pila.push(3);
		pila.push(4);
		pila.push(5);
		System.out.println(pila);
		System.out.println();
	}
}
