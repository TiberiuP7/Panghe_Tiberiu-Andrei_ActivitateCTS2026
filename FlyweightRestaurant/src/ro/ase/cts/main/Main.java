package ro.ase.cts.main;

import ro.ase.cts.clase.Client;
import ro.ase.cts.clase.ClientAbstract;
import ro.ase.cts.clase.ManagerRezervari;
import ro.ase.cts.clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(4, 5, "20:00");
        Rezervare rezervare1 = new Rezervare(2, 3, "21:00");
        Rezervare rezervare2 = new Rezervare(6, 1, "19:00");

        ManagerRezervari managerRezervari = new ManagerRezervari();

        managerRezervari.getClient(5, "Gigel", "0722222222", "Gigel@gmail.com").descriereClient(rezervare);
        managerRezervari.getClient(4, "Ion", "0744444444", "Ion@gmail.com").descriereClient(rezervare1);
        managerRezervari.getClient(4, "Vasilescu", "0755555555", "Vasilescu@gmail.com").descriereClient(rezervare);
        managerRezervari.getClient(5, "Ana", "0733333333", "Ana@gmail.com").descriereClient(rezervare2);
    }
}
