package tp6_ej2;

public class CentroComputo {
	private ColaEspera computadoras;  //private ArrayList<Computadora>computadoras; VAMO A TENER UNA COLA DE ESPERA DE COMPUS Y PROCESOS NO SON MAS ARRAYLIST.
	private ColaEspera procesos ;     //private ArrayList<Proceso>procesos;
	
	public CentroComputo() {
		this.computadoras = new ColaEspera(); //SON DE TIPO COLA DE ESPERA
		this.procesos = new ColaEspera();
	}
	
	//Inserto ordenado por velocidad. Tengo que ordenar de mayor velocidad a menor.
	//Entonces si la compu que quiero insertar tiene una velocidad mayor de la que esta en la posicion i
	//La inserto en esa posicion computadoras.add(i,compu) y vuelvo true inserto
	//Sino la agrego al final cuando salga del while.
	
	
	public void addComputadora(Computadora compu) {
		if(compu==null)return; //CORTA TODDO SI ME PASAN UN NULL.
		if(procesos.tieneElementos()) {								//SI HAY PROCESOS EJECUTO EL PROCESO SINO LA AGREGA
			Proceso proc = (Proceso) procesos.getSiguiente();
			compu.ejecutarProceso(proc);
		}
		else {
			computadoras.addElemento(compu); //AGREGO ELEMENTO A LA COLA DE ESPERA EN ESTE CASO COMPUTADORAS.
		}
	}
	
	public void addProceso(Proceso proc) {		
		if(proc==null)return;
		if(computadoras.tieneElementos()) {
			Computadora libre = (Computadora) computadoras.getSiguiente();   //A LA PC LIBRE LE ASIGNO EL PROCESO QUE ESTABA ENCOLADO.
			libre.ejecutarProceso(proc);
		}
		else {
			procesos.addElemento(proc);		//SI NO HAY COMPUTADORAS LIBRES ENCOLO EL PROCESO.
		}
	}
	/*
	//SI LE PIDO UNA COMPU DEVUELVE UNA COMPU
	public Computadora getSiguienteCompu() {
		return (Computadora) computadoras.getSiguiente(); //HAY QUE CASTEAR PORQUE EL METODO GET SIGUIENTE DEVUELVE ELEMENTO COLA.
	}

	public Proceso getSiguienteProceso() {
		return (Proceso) procesos.getSiguiente(); //HAY QUE CASTEAR PORQUE EL METODO GET SIGUIENTE DEVUELVE ELEMENTO COLA.
	}*/
}
