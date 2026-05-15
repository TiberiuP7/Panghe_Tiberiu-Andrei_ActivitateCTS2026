package cts.clase;

public class CalatorieAutobuz extends CalatorieHandler {

    public CalatorieAutobuz() {
        super();
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 5) {
            return "Autobuz";
        } else {
            return super.succesor.recomandaCalatorie(distanta);
        }
    }
}
