package ro.ase.cts.clase.observer;

import ro.ase.cts.clase.chain.Notificator;
import ro.ase.cts.clase.chain.NotificatorEmail;
import ro.ase.cts.clase.chain.NotificatorSMS;
import ro.ase.cts.clase.chain.NotificatorManager;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Subject {
    private List<Observer> observeri;

    public Restaurant() {
        this.observeri = new ArrayList<>();
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
        NotificatorSMS notificatorSMS = new NotificatorSMS();
        NotificatorEmail notificatorEmail = new NotificatorEmail();
        NotificatorManager notificatorManager = new NotificatorManager();

        notificatorSMS.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        for(Observer observer : observeri) {
            notificatorSMS.notifica((Client) observer, mesaj);
        }
    }
}
