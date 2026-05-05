package ro.ase.cts.clase.client;

public class ClientFidel implements Observer {
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println("Clientul " + this.numeClient + " a primit mesajul: " + mesaj);
    }
}
