package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        PersonalSpital medic = new Medic("Dr. Popescu");
        PersonalSpital asistenta = new Asistenta("Maria");

        Pacient pacient1 = new Pacient("Ion Popescu");
        Pacient pacient2 = new Pacient("Vasile Ionescu");

        Command comanda1 = new Internare(medic, pacient1);
        Command comanda2 = new Tratare(asistenta, pacient2);

        Operator operator = new Operator();

        operator.inregistreaza(comanda1);
        operator.inregistreaza(comanda2);

        operator.executaFisa();
        operator.inregistreaza(new Tratare(asistenta, new Pacient("Ana")));
        operator.executaFisa();
        operator.executaFisa();


    }
}
