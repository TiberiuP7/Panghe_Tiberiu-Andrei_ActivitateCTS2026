package ro.ase.cts.composite.clase;

public class Sectie implements Structura {
    private String numeSectie;
    private int nrAngajati;

    public Sectie(String numeSectie, int nrAngajati) {
        this.numeSectie = numeSectie;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Nume Sectie: " + numeSectie + " - Nr Angajati: " + nrAngajati);
    }
}
