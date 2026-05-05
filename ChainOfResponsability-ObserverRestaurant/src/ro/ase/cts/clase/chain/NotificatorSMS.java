package ro.ase.cts.clase.chain;

import ro.ase.cts.clase.observer.Client;

public class NotificatorSMS extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon()!=null) {
            client.primesteSMS(mesaj);
        }
        else {
            super.getSuccesor().notifica(client, mesaj);
        }
    }
}
