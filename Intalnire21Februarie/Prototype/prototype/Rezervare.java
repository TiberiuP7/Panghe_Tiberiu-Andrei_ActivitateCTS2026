package cts.ase.id.prototype;

public class Rezervare implements Prototype{
    private String nume;
    private String nrTelefon;
    private int nrPersoane;

    public Rezervare(String nume, String nrTelefon, int nrPersoane) {
        if(nume.length()>3) {
            this.nume = nume;
        } else {
            this.nume = "NaN";
        }
        if(nrTelefon.length()==10) {
            this.nrTelefon = nrTelefon;
        } else {
            this.nrTelefon = "0000000000";
        }
        if(nrPersoane>0) {
            this.nrPersoane = nrPersoane;
        } else {
            this.nrPersoane = 0;
        }
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    private Rezervare(){
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append(", nrPersoane=").append(nrPersoane);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Prototype copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.nume = this.nume;
        rezervare.nrTelefon = this.nrTelefon;
        rezervare.nrPersoane = this.nrPersoane;
        return rezervare;
    }
}
