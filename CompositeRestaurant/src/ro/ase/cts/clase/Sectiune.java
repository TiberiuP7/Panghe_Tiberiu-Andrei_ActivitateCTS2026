package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements OptiuneMeniu {
    private String numeSectiune;
    private List<OptiuneMeniu> optiuni;

    public Sectiune(String numeSectiune) {
        this.numeSectiune = numeSectiune;
        this.optiuni = new ArrayList<OptiuneMeniu>();
    }

    public void adaugaOptiune(OptiuneMeniu optiune) {
        optiuni.add(optiune);
    }

    public void stergeOptiune(OptiuneMeniu optiune) {
        optiuni.remove(optiune);
    }

    public OptiuneMeniu getOptiune(int pozitie) {
        return optiuni.get(pozitie);
    }

    @Override
    public void afiseazaDetaliiMeniu(String spatii) {
        System.out.println(spatii + "Ati selectat sectiunea: " + numeSectiune + " care contine urmatoarele optiuni:");
        for (OptiuneMeniu optiune : optiuni) {
            optiune.afiseazaDetaliiMeniu(spatii + "    ");
        }
    }
}
