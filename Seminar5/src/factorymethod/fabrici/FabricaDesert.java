package factorymethod.fabrici;

import factorymethod.*;
import factorymethod.enums.TipDesert;
import factorymethod.enums.TipMancare;
import factorymethod.enums.TipSupa;

public class FabricaDesert implements FabricaAbstracta {

    public FabricaDesert() {
        super();
    }

    @Override
    public FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret, int calorii) {
        if(tipMancare == TipDesert.CLATITE)
            return  new Clatite(gramaj, pret, calorii);
        else if(tipMancare == TipDesert.PAPANASI)
            return  new Papanasi(gramaj, pret, calorii);
        return null;
    }

    @Override
    public FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret) {
        return getFelDeMancare(tipMancare, gramaj, pret, 500);
    }
}
