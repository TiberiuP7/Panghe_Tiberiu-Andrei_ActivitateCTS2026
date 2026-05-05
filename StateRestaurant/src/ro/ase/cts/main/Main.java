package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(1);

        Stare libera = new StareLibera();
        libera.doAction(rezervare);

        Stare ocupata = new StareOcupata();
        ocupata.doAction(rezervare);

        Stare anulata = new StareRezervata();
        anulata.doAction(rezervare);
    }
}
