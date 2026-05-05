package ro.ase.cts.main;

import ro.ase.cts.clase.ReceptieRestaurant;

public class Main {
    public static void main(String[] args) {
        System.out.println(ReceptieRestaurant.verificaDisponibilitateMasa(1));

        System.out.println(ReceptieRestaurant.verificaDisponibilitateMasa(15));

        System.out.println(ReceptieRestaurant.verificaDisponibilitateMasa(5));
    }
}
