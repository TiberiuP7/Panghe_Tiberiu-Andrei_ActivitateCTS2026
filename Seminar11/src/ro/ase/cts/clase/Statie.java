package ro.ase.cts.clase;

public class Statie {
    private String numeStatie;
    private int nrCalatori;

    public Statie(String numeStatie, int nrCalatori) {
        this.numeStatie = numeStatie;
        this.nrCalatori = nrCalatori;
    }

    public String getNumeStatie() {
        return numeStatie;
    }

    public void setNumeStatie(String numeStatie) {
        this.numeStatie = numeStatie;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public void setNrCalatori(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Statie{");
        sb.append("numeStatie='").append(numeStatie).append('\'');
        sb.append(", nrCalatori=").append(nrCalatori);
        sb.append('}');
        return sb.toString();
    }
}
