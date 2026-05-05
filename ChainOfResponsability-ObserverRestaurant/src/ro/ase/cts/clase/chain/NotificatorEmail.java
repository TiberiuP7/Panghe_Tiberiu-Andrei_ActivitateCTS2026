package ro.ase.cts.clase.chain;

import ro.ase.cts.clase.observer.Client;

public class NotificatorEmail extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresaMail()!=null) {
            client.primesteEmail(mesaj);
        }
        else {
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
