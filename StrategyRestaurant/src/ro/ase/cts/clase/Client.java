package ro.ase.cts.clase;

public class Client {
    private String nume;
    private ModPlata modPlata;

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public void plateste(double suma) {
        modPlata.plateste(this.nume, suma);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", modPlata=").append(modPlata);
        sb.append('}');
        return sb.toString();
    }
}
