package ro.ase.cts.clase.subiect;

import ro.ase.cts.clase.client.Observer;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subiect {
    private List<Observer> observeri;
    private String nume;

    public Restaurant(String nume) {
        this.nume = nume;
        this.observeri = new ArrayList<Observer>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        observeri.remove(observer);
    }

    @Override
    public void notificaObserveri(String mesaj) {
        for (Observer observer:observeri) {
            observer.receptionareMesaj(nume + ": " + mesaj);
        }
    }

    public void notificareOfertaNoua() {
        notificaObserveri("Restaurantul " + this.nume + " are o oferta noua! Verificati noul nostru catalog!");
    }

    public void notificareMeniuNou() {
        notificaObserveri("Restaurantul " + this.nume + " are un meniu nou! Verificati noul nostru catalog!");
    }
}
