package cts.clase;

public class CalatorieTramvai extends CalatorieHandler {
    public CalatorieTramvai() {
        super();
    }

    @Override
    public String recomandaCalatorie(double distanta) {
        if (distanta < 10) {
            return "Tramvaiul";
        } else {
            return super.succesor.recomandaCalatorie(distanta);
        }
    }
}
