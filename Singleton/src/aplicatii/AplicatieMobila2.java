package aplicatii;

public class AplicatieMobila2 {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila2 instanta = new AplicatieMobila2("Aplicatia Mea", 100);

    private AplicatieMobila2(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public static AplicatieMobila2 getInstanta() {
            return instanta;
    }
}
