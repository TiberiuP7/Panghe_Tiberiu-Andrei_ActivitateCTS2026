package ro.ase.cts.clase;

public class Linie implements LinieAbstracta {
    private String primaStatie;
    private String ultimaStatie;
    private int nrLinie;

    protected Linie(String primaStatie, String ultimaStatie, int nrLinie) {
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
        this.nrLinie = nrLinie;
    }

    @Override
    public void descriereLinie(Autobuz autobuz) {
        System.out.println("Linia " + this.nrLinie + " are traseul " + this.primaStatie + " - " + this.ultimaStatie + "Autobuz: " + autobuz.toString());
    }

    @Override
    public void numarMaximPasageriPeLinie(Autobuz autobuz) {
        System.out.println("Numarul maxim de calatori intre statiile " + this.primaStatie + " si " + this.ultimaStatie + " este de " + autobuz.getNrLocuri());
    }
}
