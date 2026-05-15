package cts.clase;

public class CalatorieTroleibuz extends CalatorieHandler {
    public CalatorieTroleibuz() {
        super();
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 3) {
            return "Troleibuz";
        }
        else {
            return super.succesor.recomandaCalatorie(distanta);     }
    }
}
