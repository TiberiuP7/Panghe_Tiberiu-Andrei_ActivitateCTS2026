package builder;

import customexception.PantofException;

import java.util.List;

public class PantofBuilder implements IBuilder {
    private Pantof pantof;

    public PantofBuilder() {
        pantof = new Pantof();
    }

    public PantofBuilder setTipPantof(TipPantof tipPantof) {
        pantof.setTipPantof(tipPantof);
        return this;
    }

    public PantofBuilder setNrPantof(int nrPantof) throws PantofException {
        pantof.setNrPantof(nrPantof);
        return this;
    }

    public PantofBuilder setDimensiuneToc(float dimensiuneToc) throws PantofException {
        pantof.setDimensiuneToc(dimensiuneToc);
        return this;
    }

    public PantofBuilder setMaterialDeBaza(String materialDeBaza) {
        pantof.setMaterialDeBaza(materialDeBaza);
        return this;
    }

    public PantofBuilder setMaterialeSecundare(List<String > materialeSecundare) throws PantofException {
        pantof.setMaterialeSecundare(materialeSecundare);
        return this;
    }

    public PantofBuilder setMesaje(List<String> mesaje) throws PantofException {
        pantof.setMesaje(mesaje);
        return this;
    }

    @Override
    public Pantof build() {
        return pantof;
    }
}
