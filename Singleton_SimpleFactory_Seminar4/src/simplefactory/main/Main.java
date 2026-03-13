package simplefactory.main;

import simplefactory.clase.MijlocTransport;
import simplefactory.factory.Depou;
import simplefactory.factory.TipMijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Depou depou = new Depou();
        MijlocTransport autobuz = depou.getMijlocTransport(TipMijlocDeTransport.AUTOBUZ, 6, "B123ABC");
        MijlocTransport troleibuz = depou.getMijlocTransport(TipMijlocDeTransport.TROLEIBUZ, 4, "B456DEF");

        autobuz.afiseazaDescriere();
        troleibuz.afiseazaDescriere();
    }
}
