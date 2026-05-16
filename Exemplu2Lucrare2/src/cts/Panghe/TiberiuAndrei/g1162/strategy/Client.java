package cts.Panghe.TiberiuAndrei.g1162.strategy;

public class Client {
    String nume;
    IProdus afisareProdus;

    public Client(String nume, IProdus afisareProdus) {
        this.nume = nume;
        this.afisareProdus = afisareProdus;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public IProdus getAfisareProdus() {
        return afisareProdus;
    }

    public void setAfisareProdus(IProdus afisareProdus) {
        this.afisareProdus = afisareProdus;
    }

    public void filtreaza() {
        this.afisareProdus.filtreaza();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaginaWeb{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", afisareProdus=").append(afisareProdus);
        sb.append('}');
        return sb.toString();
    }
}
