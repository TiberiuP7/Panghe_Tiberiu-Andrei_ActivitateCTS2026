package ro.ase.cts.clase;

public class ReceptieRestaurant {
    public static String verificaDisponibilitateMasa(int numarMasa) {
        MasaLibera masaLibera = new MasaLibera();
        if(masaLibera.verificaMasaLibera(numarMasa)) {
            Ospatar ospatar = new Ospatar();
            if(ospatar.esteMasaDebarasata(numarMasa) && ospatar.areServeteleNoi(numarMasa)) {
                return "Masa " + numarMasa + " este pregatita.";
            } else {
                return "Masa " + numarMasa + " nu este curata.";
            }
        }
        else {
            return "Masa " + numarMasa + " nu este libera.";
        }
    }
}
