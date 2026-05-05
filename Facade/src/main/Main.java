package main;

import clase.Medic;
import clase.Pacient;
import clase.ReceptieSpital;
import clase.Salon;

public class Main {
    public static void main(String[] args) {
        Pacient pacient1 = new Pacient("Ion Popescu", 7);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();

        if(medic1.areTrimitere(pacient1)) {
            int patLiber = salon1.getPatLiber();
            if(patLiber != -1) {
                System.out.println("Pacientul " + pacient1.getNume() + " a fost internat in salon, patul " + patLiber);
                salon1.ocupaPat(patLiber);
            }
        }

        Pacient pacient2 = new Pacient("Maria", 4);
        Pacient pacient3 = new Pacient("Vasile", 9);
        Pacient pacient4 = new Pacient("Elena", 6);

        ReceptieSpital receptieSpital1 = new ReceptieSpital();
        receptieSpital1.interneazaPacient(pacient2);
        receptieSpital1.interneazaPacient(pacient3);
        receptieSpital1.interneazaPacient(pacient4);
    }
}
