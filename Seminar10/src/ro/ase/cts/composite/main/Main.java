package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.Departament;
import ro.ase.cts.composite.clase.Sectie;
import ro.ase.cts.composite.clase.Structura;

public class Main {
    public static void main(String[] args) {
        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat", 5);
        Structura sectieManagement = new Sectie("Management", 10);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);
        System.out.println("Inainte de modificare:\n");
        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);

        System.out.println("\nDupa modificare:\n");
        depSpital.afiseazaDetaliiStructura("");
    }
}
