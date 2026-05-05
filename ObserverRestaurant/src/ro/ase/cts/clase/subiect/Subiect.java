package ro.ase.cts.clase.subiect;

import ro.ase.cts.clase.client.Observer;

public interface Subiect {
    public void adaugaObserver(Observer observer);
    public void stergeObserver(Observer observer);
    public void notificaObserveri(String mesaj);
}
