package aplicatii;

public class AplicatieMobila {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta = null;

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public void setNume(String noulNume) {
        this.nume = noulNume;
    }

    public String getNume() {
        return this.nume;
    }

    public static synchronized AplicatieMobila getInstanta(){
        if(instanta == null) {
            instanta = new AplicatieMobila("Aplicatia Mea", 100);
        }
        return instanta;
    }
}
