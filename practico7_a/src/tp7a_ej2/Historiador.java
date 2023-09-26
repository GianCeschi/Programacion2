package tp7a_ej2;

import java.util.ArrayList;

public class Historiador {
	private String nombre;
	private ArrayList<Documento> documentos;
	
	public Historiador(String nombre) {
		this.nombre = nombre;
		this.documentos = new ArrayList<Documento>();
	}

	public Historiador(ArrayList<Documento> documento) { //CONSTRUCTOR SI LE PASAN LOS DOCUMENTOS.
		this.documentos = new ArrayList<>(documentos);
	}

	public ArrayList<Documento> getDocumentos() {
		return new ArrayList<>(documentos);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addDocumento(Documento nuevo) {
		if(!documentos.contains(nuevo)) {
			documentos.add(nuevo);
		}
	}
	
	//MODELO PARA HACER FILTRO POR CONDICIONES QUE SE INDIQUEN.
	public ArrayList<Documento> buscar( Condicion condicion ){
        ArrayList<Documento> retorno = new ArrayList<>();
        for (int i = 0; i < documentos.size(); i++) {
            Documento actual = documentos.get(i);
            if (condicion.cumple(actual) )
                retorno.add(documentos.get(i));
        }
        return retorno;
    }
	
}
