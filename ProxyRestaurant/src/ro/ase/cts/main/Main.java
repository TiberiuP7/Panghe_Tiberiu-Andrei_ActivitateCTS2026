package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.Rezervare;
import ro.ase.cts.clase.RezervareAbstracta;
import ro.ase.cts.clase.RezervareProxy;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Popescu Ion", 3);

        Rezervare rezervare = new Rezervare(client);
        rezervare.descriereRezervare();
        rezervare.rezervaMasa();

        RezervareProxy rezervareProxy = new RezervareProxy(client);
        rezervareProxy.descriereRezervare();
        rezervareProxy.rezervaMasa();

         client.setNrPersoane(5);
         rezervareProxy.rezervaMasa();
    }
}
