package ro.ase.cts.clase.chain;

import ro.ase.cts.clase.observer.Client;

public class NotificatorManager extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Nu avem date pentru clientul " + client.getNume() + " pentru a-l putea notifica. Mesaj manager: " + mesaj);
    }
}
