package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.Calator;
import ro.ase.cts.clase.CalatorAbonat;
import ro.ase.cts.clase.MijlocDeTransport;

public class Main {
    public static void main(String[] args) {
        Calator calator = new CalatorAbonat("Ion");
        Calator calator2 = new CalatorAbonat("Maria");
        Calator calator3 = new CalatorAbonat("Vasile");
        Calator calator4 = new CalatorAbonat("Elena");

        MijlocDeTransport autobuz = new Autobuz("10");

        autobuz.aboneazaCalator(calator);
        autobuz.aboneazaCalator(calator2);
        autobuz.aboneazaCalator(calator3);

        autobuz.pleacaDinDepou();
        autobuz.aboneazaCalator(calator4);
        autobuz.dezaboneazaCalator(calator3);

        autobuz.ramaneBlocatInTrafic();
    }
}
