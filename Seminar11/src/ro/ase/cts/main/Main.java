package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        MijlocDeTransport autobuz168 = new Autobuz(0, 160);
        MijlocDeTransport autobuz226 = new Autobuz(30, 161);

        Statie statieRomana = new Statie("Romana", 0);
        Statie statieUniversitate = new Statie("Universitate", 10);

        autobuz168.opresteInStatie(statieRomana);
        autobuz226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuzNoapte168 = new AutobuzNoapte(autobuz168);
        MijlocDeTransport autobuzNoapte226 = new AutobuzNoapte(autobuz226);

        System.out.println("------");

        autobuzNoapte168.opresteInStatie(statieRomana);
        autobuzNoapte226.opresteInStatie(statieUniversitate);

        MijlocDeTransport autobuz = new Autobuz(12, 162, TipCursa.CURSA_SPECIALA);

        MijlocDeTransport autoSpecial = new AutobuzCursaSpeciala(autobuz);
        MijlocDeTransport autoSpecial168 = new AutobuzCursaSpeciala(autobuz168);

        System.out.println("------");

        autoSpecial.opresteInStatie(statieRomana);
        autoSpecial168.opresteInStatie(statieRomana);
    }
}
