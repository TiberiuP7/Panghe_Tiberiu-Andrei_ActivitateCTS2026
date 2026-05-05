package ro.ase.cts.main;

import ro.ase.cts.clase.client.ClientFidel;
import ro.ase.cts.clase.subiect.Restaurant;

public class Main {
    public static void main(String[] args) {
        ClientFidel client1 = new ClientFidel("Ion");
        ClientFidel client2 = new ClientFidel("Maria");
        ClientFidel client3 = new ClientFidel("Vasile");

        Restaurant restaurant = new Restaurant("La Mama");

        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);

        restaurant.notificareMeniuNou();

        System.out.println("-----------------------------");
        restaurant.stergeObserver(client1);
        restaurant.notificareOfertaNoua();

        System.out.println("-----------------------------");
        restaurant.adaugaObserver(client3);
        restaurant.notificareMeniuNou();
        restaurant.notificareOfertaNoua();
    }
}
