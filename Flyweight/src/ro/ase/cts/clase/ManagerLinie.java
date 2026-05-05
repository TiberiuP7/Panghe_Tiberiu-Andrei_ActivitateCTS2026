package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerLinie {
    private Map<Integer, Linie> registru = new HashMap<Integer, Linie>();

    public Linie getLinie(int nrLinie, String primaStatie, String ultimaStatie) {
        if(registru.containsKey(nrLinie)) {
            return registru.get(nrLinie);
        }
        else {
            registru.put(nrLinie, new Linie(primaStatie, ultimaStatie, nrLinie));
            return registru.get(nrLinie);
        }
    }
}
