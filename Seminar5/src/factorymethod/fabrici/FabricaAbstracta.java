package factorymethod.fabrici;

import factorymethod.FelMancare;
import factorymethod.enums.TipMancare;

public interface FabricaAbstracta {
    FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret, int calorii);

    FelMancare getFelDeMancare(TipMancare tipMancare, float gramaj, float pret);
}
