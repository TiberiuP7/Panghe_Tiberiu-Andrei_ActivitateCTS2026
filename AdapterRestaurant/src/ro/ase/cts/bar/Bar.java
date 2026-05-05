package ro.ase.cts.bar;

public class Bar {
    private String nume;
    private String adresa;
    private int adaosComercial;

    public Bar(String nume, String adresa, int adaosComercial) {
        this.nume = nume;
        this.adresa = adresa;
        this.adaosComercial = adaosComercial;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public int getAdaosComercial() {
        return adaosComercial;
    }

    public void setAdaosComercial(int adaosComercial) {
        this.adaosComercial = adaosComercial;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bar{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", adaosComercial=").append(adaosComercial);
        sb.append('}');
        return sb.toString();
    }
}
