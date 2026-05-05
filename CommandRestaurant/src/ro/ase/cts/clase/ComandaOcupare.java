package ro.ase.cts.clase;

public class ComandaOcupare implements Command {
    private MasaAbstracta masa;

    public ComandaOcupare(MasaAbstracta masa) {
        super();
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.ocupaMasa();
    }
}
