package cts.Panghe.TiberiuAndrei.g1162.main;

import cts.Panghe.TiberiuAndrei.g1162.composite.Continent;
import cts.Panghe.TiberiuAndrei.g1162.composite.Tara;
import cts.Panghe.TiberiuAndrei.g1162.composite.Virus;
import cts.Panghe.TiberiuAndrei.g1162.facade.ReceptieSpital;
import cts.Panghe.TiberiuAndrei.g1162.facade.Vizitator;

public class Main {
    public static void main(String[] args) {
        Vizitator vizitator1 = new Vizitator("Andrei", 30, true);
        Vizitator vizitator2 = new Vizitator("Maria", 25, true);
        Vizitator vizitator3 = new Vizitator("Ion", 40, false);
        Vizitator vizitator4 = new Vizitator("Elena", 35, true);

        ReceptieSpital receptieSpital = new ReceptieSpital();

        receptieSpital.permiteAccesVizitator(vizitator1);
        receptieSpital.permiteAccesVizitator(vizitator2);
        receptieSpital.permiteAccesVizitator(vizitator3);

        receptieSpital.permiteAccesVizitator(vizitator4);


        System.out.println("------------------------------");

        Continent continent = new Tara("Europa");
        Continent tara1 = new Tara("Romania");
        Continent tara2 = new Tara("Franta");
        Continent tara3 = new Tara("Germania");
        Continent virus1 = new Virus("Ebola", 10, 100, 50);
        Continent virus2 = new Virus("COVID-19", 5, 1000, 20);
        Continent virus3 = new Virus("Gripa", 2, 500, 5);

        System.out.println("Inainte de modificare:\n");
        ((Tara) continent).adaugaNodTara(tara1);
        ((Tara) continent).adaugaNodTara(tara2);
        ((Tara) continent).adaugaNodTara(tara3);

        ((Tara) continent).adaugaNodTara(virus1);
        ((Tara) continent).adaugaNodTara(virus2);
        ((Tara) tara1).adaugaNodTara(virus3);

        continent.afiseazaDetaliiStructura("");

        System.out.println("\nDupa modificare:\n");
        ((Tara) continent).stergeNodTara(virus1);
        ((Tara) continent).stergeNodTara(virus2);
        ((Tara) tara1).adaugaNodTara(virus1);
        ((Tara) tara2).adaugaNodTara(virus2);
        ((Tara) tara3).adaugaNodTara(virus3);

        continent.afiseazaDetaliiStructura("");

        System.out.println("Numarul total de cazuri de virusuri identificate in toate tarile din cadrul arborescentei definite: " + ((Tara) continent).numarTotalInfectari());
    }
}
