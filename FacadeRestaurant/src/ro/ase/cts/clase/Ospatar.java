package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Ospatar {
    private List<Boolean> listaMeseCurate;

    public Ospatar() {
        this.listaMeseCurate = new ArrayList<Boolean>();
        for(int i=1; i<4; i++) {
            this.listaMeseCurate.add(true);
        }
        for(int i=4; i<=15; i++) {
            this.listaMeseCurate.add(false);
        }
    }

    public boolean esteMasaDebarasata(int numarMasa) {
        return this.listaMeseCurate.get(numarMasa);
    }

    public boolean areServeteleNoi(int numarMasa) {
        return this.listaMeseCurate.get(numarMasa);
    }


}
