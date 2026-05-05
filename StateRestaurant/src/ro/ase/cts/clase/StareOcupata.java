package ro.ase.cts.clase;

public class StareOcupata implements Stare {
    @Override
    public void doAction(Rezervare rezervare) {
        System.out.println("Rezervarea cu id-ul " + rezervare.getId() + " este in starea ocupata");
        rezervare.setStare(this);
    }
}
