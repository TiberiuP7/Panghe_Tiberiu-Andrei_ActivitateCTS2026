package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class MasaLibera {
    private List<Integer> listaMeseLibere;

    public MasaLibera() {
        this.listaMeseLibere = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            this.listaMeseLibere.add(i);
        }
    }

    public boolean verificaMasaLibera(int numarMasa) {
        return this.listaMeseLibere.contains(numarMasa);
    }
}
