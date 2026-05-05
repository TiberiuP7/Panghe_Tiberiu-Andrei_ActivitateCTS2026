package ro.ase.cts.main;

import ro.ase.cts.clase.observer.Client;
import ro.ase.cts.clase.observer.Restaurant;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Client client = new Client("Gigel", "0722222222", "Gigel@gmail.com");
        Client client1 = new Client("Ionel", null, "Ionel@gmail.com");
        Client client2 = new Client("Bob", null, null);

        restaurant.adaugaObserver(client);
        restaurant.adaugaObserver(client1);
        restaurant.adaugaObserver(client2);

        restaurant.notificaObserveri("Aveti o rezervare pentru astazi la ora 19:00.");
    }
}
