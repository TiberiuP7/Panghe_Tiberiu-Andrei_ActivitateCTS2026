package cts.Panghe.Tiberiu_Andrei.g1162.main;

import cts.Panghe.Tiberiu_Andrei.g1162.decorator.*;

public class Main {
    public static void main(String[] args) {
        Subscription abonamentBasic = new Abonament("Andrei", "Basic", 10, 50);
        System.out.println("Costul abonamentului fara extraoptiuni este: " + abonamentBasic.totalCosts(20));

        Decorator abonamentPremium = new ExtraoptiuniInternet5G(abonamentBasic);
        System.out.println("Costul abonamentului premium cu internet 5G este: " + abonamentPremium.totalCosts(20));
        ((ExtraoptiuniInternet5G) abonamentPremium).adaugaExtraoptiuniInternet5G();

        Decorator abonamentPremium2 = new ExtraoptiuniInternetInRoaming(abonamentBasic);
        Decorator abonamentPremium3 = new ExtraoptiuniMinuteInRoaming(abonamentPremium);

        System.out.println("Costul abonamentului premium cu internet in roaming este: " + abonamentPremium2.totalCosts(20));
        ((ExtraoptiuniInternetInRoaming) abonamentPremium2).adaugaExtraoptiuniInternetInRoaming();

        System.out.println("Costul abonamentului premium cu minute in roaming si internet 5G este: " + abonamentPremium3.totalCosts(20));
        ((ExtraoptiuniMinuteInRoaming) abonamentPremium3).adaugaExtraoptiuniMinuteInRoaming();
    }
}
