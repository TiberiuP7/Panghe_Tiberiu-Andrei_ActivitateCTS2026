package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> listaPacienti;

    public Spital(String nume) {
        this.nume = nume;
        this.listaPacienti = new ArrayList<Pacient>();
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for (Pacient pacient : listaPacienti) {
            pacient.receptioneazaNotificare(mesaj);
        }
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacienti.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacienti.remove(pacient);
    }

    public void notificaVirus() {
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificaEpidemie() {
        trimiteMesaj("Exista o epidemie in oras!");
    }
}
