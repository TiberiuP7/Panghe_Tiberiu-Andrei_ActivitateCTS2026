package cts.Panghe.TiberiuAndrei.g1162.composite;

public class Item implements Site {
    String nume;
    String descriere;
    String culoare;
    int dimensiune;

    public Item(String nume, String descriere, String culoare, int dimensiune) {
        this.nume = nume;
        this.descriere = descriere;
        this.culoare = culoare;
        this.dimensiune = dimensiune;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    @Override
    public void filtreazaPagina(String spatii) {
        System.out.println(spatii + "Item: " + nume + ", descriere: " + descriere + ", culoare: " + culoare + ", dimensiune: " + dimensiune);
    }
}
