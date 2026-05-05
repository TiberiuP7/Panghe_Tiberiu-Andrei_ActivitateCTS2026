package ro.ase.cts.main;

import ro.ase.cts.clase.Autobuz;
import ro.ase.cts.clase.ManagerLinie;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz101 = new Autobuz("Mercedes", 2010, 50);
        Autobuz autobuz102 = new Autobuz("Lada", 2012, 40);
        Autobuz autobuz103 = new Autobuz("Ottokar", 2015, 30);

        ManagerLinie managerLinie = new ManagerLinie();

        managerLinie.getLinie(101, "Otopeni", "Alta Statie").numarMaximPasageriPeLinie(autobuz101);
        managerLinie.getLinie(101, "Romana", "Universitate").descriereLinie(autobuz103);

        managerLinie.getLinie(101, "Romana", "Universitate").descriereLinie(autobuz103);
        managerLinie.getLinie(101, "Romana", "Universitate").numarMaximPasageriPeLinie(autobuz103);
    }
}
