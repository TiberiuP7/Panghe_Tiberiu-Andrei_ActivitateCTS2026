package ro.ase.cts.clase;

public class Client {
    private String nume;
    private String nrTelefon;
    private String adresaMail;

    public Client(String nume, String nrTelefon, String adresaMail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaMail = adresaMail;
    }

    public Client(String nume) {
        this.nume = nume;
        this.nrTelefon = null;
        this.adresaMail = null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    public String getAdresaMail() {
        return adresaMail;
    }

    public void setAdresaMail(String adresaMail) {
        this.adresaMail = adresaMail;
    }
}
