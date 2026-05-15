package ro.ase.cts.clase;

public class Autobuz extends MijlocDeTransport {
    public Autobuz(String linie) {
        super(linie);
    }

    @Override
    public void pleacaDinDepou() {
        String mesaj = "Autobuzul de pe linia " + super.linie + " a plecat din depou.";
    }

    @Override
    public void ramaneBlocatInTrafic() {

    }
}
