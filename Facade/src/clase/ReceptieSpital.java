package clase;

public class ReceptieSpital {
    private Medic medic;
    private Salon salon;

    public ReceptieSpital() {
        this.medic = new Medic();
        this.salon = new Salon();
    }

    public void interneazaPacient(Pacient pacient) {
        if(medic.areTrimitere(pacient)) {
            int patLiber = this.salon.getPatLiber();
            if(patLiber != -1) {
                System.out.println("Pacientul " + pacient.getNume() + " a fost internat in salon, patul " + patLiber);
                salon.ocupaPat(patLiber);
            }
            else {
                System.out.println("Nu mai sunt paturi libere in salon");
            }
        }
        else {
            System.out.println("Ai nevoie de o trimitere de la medic!");
        }
    }
}
