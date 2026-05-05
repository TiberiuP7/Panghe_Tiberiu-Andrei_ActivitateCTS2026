package cts.Panghe.TiberiuAndrei.g1162.facade;

public class ReceptieSpital implements ISpital {
    private Medic medic;
    private SalonDeAsteptare salonDeAsteptare;

    public ReceptieSpital() {
        this.medic = new Medic();
        this.salonDeAsteptare = new SalonDeAsteptare();
    }

    @Override
    public void permiteAccesVizitator(Vizitator vizitator) {
        if(vizitator.isAreScrisoareDeAcceptare()) {
            salonDeAsteptare.adaugaVizitator(vizitator);
            if(salonDeAsteptare.getNumarVizitatoriInAsteptare() >= 3) {
                salonDeAsteptare.echipeazaVizitatori();
            }
            else {
                System.out.println("Vizitatorul " + vizitator.getNume() + " a fost adaugat in salonul de asteptare, dar nu sunt suficienti vizitatori pentru a fi echipati.");
            }
        }
        else {
            System.out.println("Vizitatorul " + vizitator.getNume() + " nu avea scrisoare de acceptare, dar acum a primit-o.");
            medic.areScrisoareDeAcceptare(vizitator);
            permiteAccesVizitator(vizitator);
        }
    }
}
