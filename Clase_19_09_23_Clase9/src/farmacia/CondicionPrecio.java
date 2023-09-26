package farmacia;

public class CondicionPrecio extends Condicion{
    private double precioTope;

    public CondicionPrecio(double precioTope) {
        this.precioTope = precioTope;
    }

    @Override
    public boolean cumple(Medicamento medicamento) {
        return medicamento.getPrecio() <= precioTope;
    }
}
