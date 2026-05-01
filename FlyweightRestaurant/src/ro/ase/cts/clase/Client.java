package ro.ase.cts.clase;

public class Client implements ClientAbstract {
    private String nume;
    private String numarDeTelefon;
    private String adresaDeMail;

    public Client(String nume, String numarDeTelefon, String adresaDeMail) {
        this.nume = nume;
        this.numarDeTelefon = numarDeTelefon;
        this.adresaDeMail = adresaDeMail;
    }

    public String getNume() {
        return nume;
    }

    public String getNumarDeTelefon() {
        return numarDeTelefon;
    }

    public String getAdresaDeMail() {
        return adresaDeMail;
    }

    @Override
    public void descriereClient(Rezervare rezervare) {
        System.out.println("Clientul " + this.nume + " a facut o rezervare pentru " + rezervare.getNrPersoane() + " persoane la ora " + rezervare.getOraRezervare() + " pentru masa numarul " + rezervare.getNrMasa());
    }
}
