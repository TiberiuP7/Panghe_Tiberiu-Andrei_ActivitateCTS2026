package ro.ase.cts.clase;

public class NotificatorEmail extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        if(client.getAdresaMail()!=null) {
            System.out.println("Notificare email catre clientul " + client.getNume() + " cu mesajul: " + mesaj);
        }
        else {
            super.getUrmatorulNotificator().notifica(client, mesaj);
        }
    }
}
