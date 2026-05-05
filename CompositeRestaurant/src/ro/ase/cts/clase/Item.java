package ro.ase.cts.clase;

public class Item implements OptiuneMeniu {
    private String nume;
    private float pret;

    public Item(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public void afiseazaDetaliiMeniu(String spatii) {
        System.out.println(spatii + "Ati selectat optiunea: " + nume + " cu pretul de " + pret);
    }
}
