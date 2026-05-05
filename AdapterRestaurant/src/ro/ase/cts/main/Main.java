package ro.ase.cts.main;

import ro.ase.cts.bar.Bar;
import ro.ase.cts.bar.FacturaBar;
import ro.ase.cts.clase.Bucatarie;
import ro.ase.cts.clase.FacturaBucatarie;
import ro.ase.cts.clase.LucrulDeLaBar;

public class Main {
    private static void printeazaFacturaRestaurant(Bucatarie bucatarie) {
        bucatarie.printeazaFactura();
    }

    public static void main(String[] args) {
        Bucatarie facturaBucatarie = new FacturaBucatarie();
        printeazaFacturaRestaurant(facturaBucatarie);

        Bar bar = new Bar("Barul lui Ion", "Strada Florilor, nr. 10", 150);
        FacturaBar facturaBar = new FacturaBar(bar);
        facturaBar.printeazaFacturaBar();

        Bar bar2 = new Bar("Barul lui Vasile", "Strada Lalelelor, nr. 5", 100);
        FacturaBar facturaBar2 = new FacturaBar(bar2);
        Bucatarie lucrulDeLaBar = new LucrulDeLaBar(facturaBar2);
        lucrulDeLaBar.printeazaFactura();

        printeazaFacturaRestaurant(lucrulDeLaBar);
    }
}
