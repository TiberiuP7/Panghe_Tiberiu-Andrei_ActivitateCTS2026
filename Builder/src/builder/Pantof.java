package builder;

import customexception.PantofException;

import java.util.List;

public class Pantof {
    private TipPantof tipPantof;
    private int nrPantof;
    private float dimensiuneToc;
    private String materialDeBaza;
    private List<String> materialeSecundare;
    private List<String> mesaje;

    public Pantof(TipPantof tipPantof, int nrPantof, float dimensiuneToc, String materialDeBaza, List<String> materialeSecundare, List<String> mesaje) throws PantofException {
        this.tipPantof = tipPantof;

        if(nrPantof < 35 || nrPantof > 45) {
            throw new PantofException("Numarul de pantof trebuie sa fie intre 35 si 45.");
        }
        else {
            this.nrPantof = nrPantof;
        }

        if(dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
            throw new PantofException("Dimensiunea tocului trebuie sa fie intre 0.5 si 10.");
        }
        else {
            this.dimensiuneToc = dimensiuneToc;
        }

        this.materialDeBaza = materialDeBaza;

        if(tipPantof.equals(TipPantof.BALERINI)) {
            if(materialeSecundare.size() > 2) {
                throw new PantofException("Pentru balerini, numarul de materiale secundare trebuie sa fie mai mic sau egal cu 2.");
            }
            else {
                this.materialeSecundare = materialeSecundare;
            }
        }

        if(mesaje.size() >= nrPantof) {
            throw new PantofException("Lungimea sirurilor insumate in lista de mesaje trebuie sa fie mai mica decat " + nrPantof + ".");
        }
        else {
            for(String mesaj : mesaje) {
                if(mesaj.length() > nrPantof) {
                    throw new PantofException("Dimensiunea fiecarui text din lista trebuie sa fie mai mica decat " + nrPantof + ".");
                }
            }
            this.mesaje = mesaje;
        }
    }

    public Pantof() {

    }

    public TipPantof getTipPantof() {
        return tipPantof;
    }

    public void setTipPantof(TipPantof tipPantof) {
        this.tipPantof = tipPantof;
    }

    public int getNrPantof() {
        return nrPantof;
    }

    public void setNrPantof(int nrPantof) throws PantofException {
        if(nrPantof < 35 || nrPantof > 45) {
            throw new PantofException("Numarul de pantof trebuie sa fie intre 35 si 45.");
        }
        else {
            this.nrPantof = nrPantof;
        }
    }

    public float getDimensiuneToc() {
        return dimensiuneToc;
    }

    public void setDimensiuneToc(float dimensiuneToc) throws PantofException {
        if(dimensiuneToc < 0.5 || dimensiuneToc > 12.5) {
            throw new PantofException("Dimensiunea tocului trebuie sa fie intre 0.5 si 10.");
        }
        else {
            this.dimensiuneToc = dimensiuneToc;
        }
    }

    public String getMaterialDeBaza() {
        return materialDeBaza;
    }

    public void setMaterialDeBaza(String materialDeBaza) {
        this.materialDeBaza = materialDeBaza;
    }

    public List<String> getMaterialeSecundare() {
        return materialeSecundare;
    }

    public void setMaterialeSecundare(List<String> materialeSecundare) throws PantofException {
        if(tipPantof.equals(TipPantof.BALERINI)) {
            if (materialeSecundare.size() > 2) {
                throw new PantofException("Pentru balerini, numarul de materiale secundare trebuie sa fie mai mic sau egal cu 2.");
            } else {
                this.materialeSecundare = materialeSecundare;
            }
        }
        else { // daca nu sunt balerini, nu exista aceasta restrictie
            this.materialeSecundare = materialeSecundare;
        }
    }

    public List<String> getMesaje() {
        return mesaje;
    }

    public void setMesaje(List<String> mesaje) throws PantofException {
        if(mesaje.size() >= nrPantof) {
            throw new PantofException("Lungimea sirurilor insumate in lista de mesaje trebuie sa fie mai mica decat " + nrPantof + ".");
        }
        else {
            for(String mesaj : mesaje) {
                if(mesaj.length() > nrPantof) {
                    throw new PantofException("Dimensiunea fiecarui text din lista trebuie sa fie mai mica decat " + nrPantof + ".");
                }
            }
            this.mesaje = mesaje;
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pantof{");
        sb.append("tipPantof=").append(tipPantof);
        sb.append(", nrPantof=").append(nrPantof);
        sb.append(", dimensiuneToc=").append(dimensiuneToc);
        sb.append(", materialDeBaza='").append(materialDeBaza).append('\'');
        sb.append(", materialeSecundare=").append(materialeSecundare);
        sb.append(", mesaje=").append(mesaje);
        sb.append('}');
        return sb.toString();
    }
}
