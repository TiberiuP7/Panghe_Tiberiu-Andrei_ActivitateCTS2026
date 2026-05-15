package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> comenzi;

    public Operator() {
        this.comenzi = new ArrayList<Command>();
    }

    public void adaugaComanda(Command comanda) {
        this.comenzi.add(comanda);
    }

    public void executaComanda() {
        if (comenzi.size() > 0) {
            this.comenzi.get(0).pleacaInCursa();
            comenzi.remove(0);
        }
    }
}