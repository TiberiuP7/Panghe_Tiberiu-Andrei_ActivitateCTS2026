package factorymethod.fabrici;

import factorymethod.FelMancare;
import factorymethod.SupaCiuperci;
import factorymethod.SupaLegume;
import factorymethod.enums.TipMancare;
import factorymethod.enums.TipSupa;

public class FabricaSupa implements FabricaAbstracta {
    public FabricaSupa() {
        super();
    }

    @Override
    public FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret, int calorii) {
        if(tipMancare == TipSupa.SUPALEGUME)
            return  new SupaLegume(pret, gramaj);
        else if(tipMancare == TipSupa.SUPACIUPERCI)
            return  new SupaCiuperci(pret, gramaj);
        return null;
    }

    @Override
    public FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret) {
        return getFelDeMancare(tipMancare, gramaj, pret, 500);
    }
}
