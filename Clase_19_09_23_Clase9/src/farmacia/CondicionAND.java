package farmacia;

public class CondicionAND extends Condicion{
    Condicion cond1, cond2;

    public CondicionAND(Condicion cond1, Condicion cond2) {
        this.cond1 = cond1;
        this.cond2 = cond2;
    }

    @Override
    public boolean cumple(Medicamento medicamento) {
        return cond1.cumple(medicamento) && cond2.cumple(medicamento);
    }
}
