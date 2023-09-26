package farmacia;

import java.util.ArrayList;

public class Farmacia {
    private ArrayList<Medicamento> stock;

    public Farmacia() {
        stock = new ArrayList<>();
    }

    public Farmacia(ArrayList<Medicamento> stock) {
        this.stock = new ArrayList<>(stock);
    }

    public ArrayList<Medicamento> getStock() {
        return new ArrayList<>(stock);
    }

    public void setStock(ArrayList<Medicamento> stock) {
        this.stock.addAll(stock);
    }

    public void addMedicamento (Medicamento nuevo){
        stock.add(nuevo);
    }

    /*public ArrayList<Medicamento> buscarXLaboratorio(String laboratorio){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getLaboratorio().toLowerCase().equals(laboratorio.toLowerCase()))
                retorno.add(stock.get(i));
        }
        return retorno;
    }

    public ArrayList<Medicamento> buscarXNombre(String substring){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getNombre().toLowerCase().contains(substring.toLowerCase()))
                retorno.add(stock.get(i));
        }
        return retorno;
    }

    public ArrayList<Medicamento> buscarXPrecio(double precioTope){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        for (int i = 0; i < stock.size(); i++) {
            if (stock.get(i).getPrecio() <= precioTope)
                retorno.add(stock.get(i));
        }
        return retorno;
    }*/

    public ArrayList<Medicamento> buscar( Condicion condicion ){
        ArrayList<Medicamento> retorno = new ArrayList<>();
        for (int i = 0; i < stock.size(); i++) {
            Medicamento actual = stock.get(i);
            if ( condicion.cumple(actual) )
                retorno.add(stock.get(i));
        }
        return retorno;
    }
}
