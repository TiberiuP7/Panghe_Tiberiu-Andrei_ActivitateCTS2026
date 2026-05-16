package cts.Panghe.TiberiuAndrei.g1162.chain;

import cts.Panghe.TiberiuAndrei.g1162.composite.Site;

public class Imagine implements Item {
    private String denumire;
    private int dimensiune;
    private String format;

    public Imagine(String denumire, int dimensiune, String format) {
        this.denumire = denumire;
        this.dimensiune = dimensiune;
        this.format = format;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public int getDimensiune() {
        return dimensiune;
    }

    public void setDimensiune(int dimensiune) {
        this.dimensiune = dimensiune;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("imagine{");
        sb.append("denumire='").append(denumire).append('\'');
        sb.append(", dimensiune=").append(dimensiune);
        sb.append(", format='").append(format).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
