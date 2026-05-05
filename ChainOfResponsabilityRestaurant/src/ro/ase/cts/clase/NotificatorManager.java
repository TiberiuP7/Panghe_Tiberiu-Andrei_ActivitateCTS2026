package ro.ase.cts.clase;

public class NotificatorManager extends Notificator {

    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule manager, restaurantul nu detine datele de contact ale clientului " + client.getNume() + " pentru a-i putea trimite mesajul: " + mesaj);
    }
}
