package factory;

import dispozitive.Dispozitiv;
import dispozitive.Laptop;
import dispozitive.Smartphone;
import dispozitive.Smartwatch;

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
