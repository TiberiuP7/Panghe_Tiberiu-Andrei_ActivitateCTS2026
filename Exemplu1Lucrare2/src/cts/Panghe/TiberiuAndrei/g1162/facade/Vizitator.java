package cts.Panghe.TiberiuAndrei.g1162.facade;

public class Vizitator {
    private String nume;
    private int varsta;
    private boolean areScrisoareDeAcceptare;

    public Vizitator(String nume, int varsta, boolean areScrisoareDeAcceptare) {
        this.nume = nume;
        this.varsta = varsta;
        this.areScrisoareDeAcceptare = areScrisoareDeAcceptare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public boolean isAreScrisoareDeAcceptare() {
        return areScrisoareDeAcceptare;
    }

    public void setAreScrisoareDeAcceptare(boolean areScrisoareDeAcceptare) {
        this.areScrisoareDeAcceptare = areScrisoareDeAcceptare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vizitator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
