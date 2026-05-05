package ro.ase.cts.clase;

public class StareRezervata implements Stare {
    @Override
    public void doAction(Rezervare rezervare) {
        System.out.println("Rezervarea cu id-ul " + rezervare.getId() + " este in starea rezervata");
        rezervare.setStare(this);
    }
}
