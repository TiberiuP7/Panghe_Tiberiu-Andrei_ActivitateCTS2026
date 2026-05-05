package ro.ase.cts.clase;

public class Masa implements MasaAbstracta {
    private int cod;

    public Masa(int cod) {
        super();
        this.cod = cod;
    }

    @Override
    public void ocupaMasa() {
        System.out.println("Masa cu codul " + cod + " a fost ocupata.");
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Masa cu codul " + cod + " a fost rezervata.");
    }
}
