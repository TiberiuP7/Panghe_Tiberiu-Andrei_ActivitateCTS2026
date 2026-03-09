package ro.ase.cts.factory;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.dispozitive.Laptop;
import ro.ase.cts.dispozitive.Smartphone;
import ro.ase.cts.dispozitive.Smartwatch;

public class FabricaDispozitive {

    private static FabricaDispozitive instanta = null;

    public static synchronized FabricaDispozitive getInstanta(){
        if(instanta==null){
            instanta = new FabricaDispozitive();
        }
        return instanta;
    }
    private FabricaDispozitive() {

    }
    public Dispozitiv getDispozitiv(TipDispozitiv tip,
                                    int nivelBaterie) {
        return switch(tip) {
            case Laptop -> new Laptop(nivelBaterie);
            case Smartphone -> new Smartphone(nivelBaterie);
            case Smartwatch -> new Smartwatch(nivelBaterie);
            default->null;
        };
    }
}
