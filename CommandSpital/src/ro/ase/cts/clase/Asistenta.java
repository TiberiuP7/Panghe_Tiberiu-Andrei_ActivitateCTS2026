package ro.ase.cts.clase;

public class Asistenta implements PersonalSpital {
    private String numeAsistenta;

    public Asistenta(String numeAsistenta) {
        this.numeAsistenta = numeAsistenta;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta " + this.numeAsistenta + " trateaza imediat pacientul " +  pacient.getNume());
    }
}
