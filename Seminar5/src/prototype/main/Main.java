package prototype.main;

import prototype.Rezervare;
import prototype.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rezervare1 = new Rezervare("Gica", 20, 2, "0723456789");
        RezervareAbstracta rezervare2 = rezervare1.clone();

        ((Rezervare)rezervare2).setOraRezervare(10);
        ((Rezervare)rezervare2).setZiuaRezervarii(10);

        System.out.println(rezervare1.toString());
        System.out.println(rezervare2.toString());
    }
}
