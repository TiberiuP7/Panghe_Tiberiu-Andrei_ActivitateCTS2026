package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    String linie;
    List<Calator> listaCalatori;

    public MijlocDeTransport(String linie) {
        this.linie = linie;
        this.listaCalatori = new ArrayList<Calator>();
    }

    public void aboneazaCalator(Calator calator) {
        this.listaCalatori.add(calator);
    }

    public void dezaboneazaCalator(Calator calator) {
        this.listaCalatori.remove(calator);
    }

    void notificareCalator(String mesaj) {
        for (Calator calator : listaCalatori) {
            calator.notificare(mesaj);
        }
    }

    public abstract void pleacaDinDepou();

    public abstract void ramaneBlocatInTrafic();
}
