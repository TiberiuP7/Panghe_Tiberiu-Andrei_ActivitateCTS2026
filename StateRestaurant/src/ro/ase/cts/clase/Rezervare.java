package ro.ase.cts.clase;

public class Rezervare {
    private int id;
    private Stare stare;

    public Rezervare(int id) {
        this.id = id;
        this.stare = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
