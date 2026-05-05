package ro.ase.cts.main;

import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        MasaAbstracta masa = new Masa(1);
        MasaAbstracta masa2 = new Masa(2);

        Operator operator = new Operator();

        Command comandaOcupare = new ComandaOcupare(masa);
        Command comandaRezervare = new ComandaRezervare(masa2);

        operator.invoca(comandaOcupare);
        operator.invoca(comandaRezervare);
    }
}
