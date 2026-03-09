package cts.ase.id.prototype.program;

import cts.ase.id.prototype.Prototype;
import cts.ase.id.prototype.Rezervare;

public class Program {
    public static void main(String[] args) {
        Prototype rezervare = new Rezervare("Vasilescu", "1111111111", 2);
        Prototype rezervare2 = rezervare.copiaza();
        ((Rezervare)rezervare2).setNrPersoane(20);

        System.out.println(rezervare.toString());
        System.out.println(rezervare2.toString());
    }
}
