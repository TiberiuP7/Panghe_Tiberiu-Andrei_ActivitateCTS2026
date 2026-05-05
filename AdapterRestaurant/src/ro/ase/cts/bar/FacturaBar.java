package ro.ase.cts.bar;

public class FacturaBar {
    private Bar bar;

    public FacturaBar(Bar bar) {
        this.bar = bar;
    }

    public void printeazaFacturaBar() {
        System.out.println("Factura " + bar.toString() + " a fost printata");
    }

    @Override
    public String toString() {
        return "Factura bar: [bar=" + bar.toString() + "]";
    }
}
