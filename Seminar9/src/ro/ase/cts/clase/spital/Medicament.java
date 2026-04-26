package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public void achizitioneazaMedicament() {
        if(prezintaReteta()) {
            System.out.println("Medicamentul " + nume + " a fost achizitionat cu pretul de " + pret);
        } else {
            System.out.println("Medicamentul " + nume + " nu poate fi achizitionat deoarece nu prezinta reteta");
        }
    }
    public boolean prezintaReteta() {
        return nume.length() >= 10;
    }

}
