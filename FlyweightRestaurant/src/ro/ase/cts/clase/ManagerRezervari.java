package ro.ase.cts.clase;

import java.util.HashMap;
import java.util.Map;

public class ManagerRezervari {
    private Map<Integer, Client> registru;

    public ManagerRezervari() {
        this.registru = new HashMap<Integer, Client>();
    }

    public int getNrClienti() {
        return registru.size();
    }

    public ClientAbstract getClient(int nrMasa, String numeClient, String nrTelefon, String adresaMail) {
        if(registru.containsKey(nrMasa))
        {
            return registru.get(nrMasa);
        }
        else
        {
            registru.put(nrMasa, new Client(numeClient, nrTelefon, adresaMail));
            return registru.get(nrMasa);
        }
    }
}
