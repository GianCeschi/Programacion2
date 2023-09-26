package farmacia;

public class CondicionNombre extends Condicion{
    private String substring;

    public CondicionNombre(String substring) {
        this.substring = substring.toLowerCase();
    }

    @Override
    public boolean cumple(Medicamento medicamento) {
        return medicamento.getNombre().toLowerCase().contains(substring);
    }
}
