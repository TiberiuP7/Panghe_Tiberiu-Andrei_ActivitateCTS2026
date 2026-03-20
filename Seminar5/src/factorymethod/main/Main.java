package factorymethod.main;

import factorymethod.FelMancare;
import factorymethod.SupaCiuperci;
import factorymethod.enums.TipDesert;
import factorymethod.enums.TipMancare;
import factorymethod.enums.TipSupa;
import factorymethod.fabrici.FabricaDesert;
import factorymethod.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaSupa fabricaSupa = new FabricaSupa();
        FabricaDesert fabricaDesert = new FabricaDesert();

        FelMancare supaCiuperci = fabricaSupa.getFelDeMancare(TipSupa.SUPACIUPERCI, 500, 25, 300);
        FelMancare supaLegume = fabricaSupa.getFelDeMancare(TipSupa.SUPALEGUME, 400, 20, 250);

        FelMancare desertClatite = fabricaDesert.getFelDeMancare(TipDesert.CLATITE, 150, 10, 200);
        FelMancare desertPapanasi = fabricaDesert.getFelDeMancare(TipDesert.PAPANASI, 200, 15, 300);

        supaCiuperci.afisare();
        supaLegume.afisare();

        desertClatite.afisare();
        desertPapanasi.afisare();
    }
}
