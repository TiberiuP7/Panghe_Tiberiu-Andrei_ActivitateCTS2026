package ro.ase.cts.clase;

public class Rezervare implements RezervareAbstracta {
    private Client client;

    public Rezervare(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public void descriereRezervare() {
        System.out.println("Rezervare pentru clientul " + client.getNumeClient() + " pentru " + client.getNrPersoane() + " persoane.");
    }

    @Override
    public void rezervaMasa() {
        System.out.println("Rezervare realizata pentru clientul " + client.getNumeClient() + " pentru " + client.getNrPersoane() + " persoane.");
    }
}
