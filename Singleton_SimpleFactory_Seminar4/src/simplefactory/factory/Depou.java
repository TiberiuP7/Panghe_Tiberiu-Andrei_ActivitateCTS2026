package simplefactory.factory;

import simplefactory.clase.Autobuz;
import simplefactory.clase.MijlocTransport;
import simplefactory.clase.Tramvai;
import simplefactory.clase.Troleibuz;

import static simplefactory.factory.TipMijlocDeTransport.AUTOBUZ;

public class Depou {
    public MijlocTransport getMijlocTransport(TipMijlocDeTransport tip, int numarRoti, String nrInmatriculare) {
        return switch (tip) {
            case AUTOBUZ -> new Autobuz(numarRoti, nrInmatriculare);
            case TROLEIBUZ -> new Troleibuz(numarRoti, nrInmatriculare);
            case TRAMVAI -> new Tramvai(numarRoti, nrInmatriculare);
            default -> null;
        };
    }
}
