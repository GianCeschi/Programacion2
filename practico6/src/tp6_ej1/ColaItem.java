package tp6_ej1;

import java.util.ArrayList;

//ESTA ES LA COLA DE ALQUILER.
public class ColaItem {
	private ArrayList<ItemCola> items;
	
	public ColaItem(){
		this.items = new ArrayList<ItemCola>();
	}
	

	public boolean tieneItems() {
		return !items.isEmpty() ;
	}

	public void addItem(ItemCola item) {
		boolean inserto = false;
		int i = 0;
		while(!inserto && i<items.size()) {
			if( item.esMenor(items.get(i))) { //UN ITEM VA A SABER SI TIENE MENOS O MAS TIEMPO DE ALQUILER LIMITE QUE OTRO.
				items.add(i, item);
				inserto = true;
			}
			i++;
		}
		if(!inserto) {
			items.add(item);
		}
	}
}
