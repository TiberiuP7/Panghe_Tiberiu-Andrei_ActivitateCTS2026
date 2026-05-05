package ro.ase.cts.clase;

public class RezervareProxy implements  RezervareAbstracta {
    private Rezervare rezervare;

    public RezervareProxy(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    public RezervareProxy(Client client) {
        this.rezervare = new Rezervare(client);
    }

    @Override
    public void descriereRezervare() {
        rezervare.descriereRezervare();
    }

    @Override
    public void rezervaMasa() {
        if (rezervare.getClient().getNrPersoane() >= 4) {
            rezervare.rezervaMasa();
        } else {
            System.out.println("Rezervare pentru " + rezervare.getClient().getNrPersoane() + " persoane nu poate fi realizata. Numarul minim de persoane este 4. Sunt suficiente locuri pentru mesele de 2 persoane. Va rugam sa va prezentati la restaurant pentru a va putea oferi o masa potrivita.");
        }
    }
}
