package ro.ase.cts.main;

import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.OptiuneMeniu;
import ro.ase.cts.clase.Sectiune;

public class Main {
    public static void main(String[] args) {
        OptiuneMeniu optiuneMeniu1 = new Sectiune("Startere");
        OptiuneMeniu optiuneMeniu2 = new Sectiune("Fel principal");

        OptiuneMeniu item1 = new Item("Salata Caesar", 35);
        OptiuneMeniu item2 = new Item("Supa de pui", 25);
        OptiuneMeniu item3 = new Item("Friptura de vita", 50);

        System.out.println("Inainte de modificare:\n");
        ((Sectiune) optiuneMeniu1).adaugaOptiune(optiuneMeniu2);
        ((Sectiune) optiuneMeniu1).adaugaOptiune(item1);
        ((Sectiune) optiuneMeniu2).adaugaOptiune(item2);
        ((Sectiune) optiuneMeniu2).adaugaOptiune(item3);

        optiuneMeniu1.afiseazaDetaliiMeniu("");

        System.out.println("\nDupa modificare:\n");
        ((Sectiune) optiuneMeniu1).stergeOptiune(item1);
        ((Sectiune) optiuneMeniu2).adaugaOptiune(item1);

        optiuneMeniu1.afiseazaDetaliiMeniu("");
    }
}
