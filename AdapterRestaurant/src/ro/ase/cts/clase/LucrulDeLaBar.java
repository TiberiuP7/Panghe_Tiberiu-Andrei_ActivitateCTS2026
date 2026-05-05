package ro.ase.cts.clase;

import ro.ase.cts.bar.FacturaBar;

public class LucrulDeLaBar implements Bucatarie {
    private FacturaBar facturaBar;

    public LucrulDeLaBar(FacturaBar facturaBar) {
        this.facturaBar = facturaBar;
    }

    @Override
    public void printeazaFactura() {
        this.facturaBar.printeazaFacturaBar();
    }
}
