package ro.ase.cts.main;

import ro.ase.cts.clase.ISpital;
import ro.ase.cts.clase.Pacient;
import ro.ase.cts.clase.PacientAbonat;
import ro.ase.cts.clase.Spital;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new PacientAbonat("Ion Popescu", 25);
        Pacient pacient2 = new PacientAbonat("Maria Ionescu", 30);
        Pacient pacient3 = new PacientAbonat("Vasile", 40);

        ISpital spital = new Spital("Cantacuzino");
        spital.aboneazaPacient(pacient1);
        spital.aboneazaPacient(pacient2);
        spital.aboneazaPacient(pacient3);

        ((Spital) spital).notificaVirus();
        System.out.println("-----------------------------");
        ((Spital) spital).notificaEpidemie();
    }
}
