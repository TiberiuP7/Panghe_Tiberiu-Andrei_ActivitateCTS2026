package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ClientAbstract;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        ClientAbstract client1 = new Client("Ana", "0722222222", "Ana@gmail.com");
        ClientAbstract client2 = new Client("Popescu", "0722222999", "Popescu@gmail.com");
        ClientAbstract clientAbstract = new Client("Gigel", "0733333333", "Gigel@gmail.com");

        Rezervare rezervare = new Rezervare(4, 5, "20:00");
        client1.descriereClient(rezervare);

        Rezervare rezervare1 = new Rezervare(2, 3, "21:00");
        client2.descriereClient(rezervare1);

        Rezervare rezervare2 = new Rezervare(6, 1, "19:00");
        clientAbstract.descriereClient(rezervare2);
    }
}
