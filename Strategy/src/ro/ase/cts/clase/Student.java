package ro.ase.cts.clase;

public class Student {
    private String nume;
    private ModSustinereExamen modSustinere;

    public Student(String nume, ModSustinereExamen modSustinere) {
        this.nume = nume;
        this.modSustinere = modSustinere;
    }

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new ProbaGrila();
    }

    public void setModSustinere(ModSustinereExamen modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void examinare() {
        this.modSustinere.sustinereExamen();
    }
}
