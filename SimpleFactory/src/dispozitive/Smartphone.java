package ro.ase.cts.dispozitive;

public class Smartphone extends Dispozitiv{
    public Smartphone(int nivelBaterie) {
        super(nivelBaterie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Smartphone{");
        sb.append("nivelBaterie=").append(super.nivelBaterie);
        sb.append('}');
        return sb.toString();
    }
}
