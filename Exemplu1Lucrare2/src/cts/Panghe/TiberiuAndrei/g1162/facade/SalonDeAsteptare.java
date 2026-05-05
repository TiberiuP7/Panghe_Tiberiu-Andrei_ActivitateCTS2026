package cts.Panghe.TiberiuAndrei.g1162.facade;

import java.util.ArrayList;
import java.util.List;

public class SalonDeAsteptare {
    private List<Vizitator> vizitatorList;

    public SalonDeAsteptare() {
        this.vizitatorList = new ArrayList<Vizitator>();
    }

    public void adaugaVizitator(Vizitator vizitator) {
        this.vizitatorList.add(vizitator);
    }

    public int getNumarVizitatoriInAsteptare() {
        return this.vizitatorList.size();
    }

    public void echipeazaVizitatori() {
        for (Vizitator vizitator : this.vizitatorList) {
            System.out.println("Vizitatorul " + vizitator.getNume() + " a fost echipat");
        }
        this.vizitatorList.clear();
        System.out.println("Toti vizitatorii au fost echipati si au parasit salonul de asteptare");
    }
}
