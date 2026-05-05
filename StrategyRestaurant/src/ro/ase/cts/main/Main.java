package ro.ase.cts.main;

import ro.ase.cts.clase.Cardul;
import ro.ase.cts.clase.Cash;
import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ModPlata;

public class Main {
    public static void main(String[] args) {
        ModPlata modPlataCash = new Cash();
        ModPlata modPlataCard = new Cardul();

        Client client1 = new Client("Ion", modPlataCash);
        client1.plateste(500);

        Client client2 = new Client("Maria", modPlataCard);
        client2.plateste(1000);

        client2.setModPlata(new Cash());
        client2.plateste(1000);
    }
}
