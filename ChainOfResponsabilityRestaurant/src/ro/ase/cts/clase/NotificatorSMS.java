package ro.ase.cts.clase;

public class NotificatorSMS extends Notificator{

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getNrTelefon()!=null) {
            System.out.println("Notificare SMS catre clientul " + client.getNume() + " cu mesajul: " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
