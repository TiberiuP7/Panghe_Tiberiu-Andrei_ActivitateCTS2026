package ro.ase.cts.clase.observer;

public interface Subject {
    public void adaugaObserver(Observer observer);
    public void stergeObserver(Observer observer);
    public void notificaObserveri(String mesaj);
}
