package ro.ase.cts.clase.farmacie;

public class Medicament {
    private String nume;

    public Medicament(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void cumparaMedicament() {
        System.out.println("Medicamentul " + nume + " a fost cumparat");
    }
}
