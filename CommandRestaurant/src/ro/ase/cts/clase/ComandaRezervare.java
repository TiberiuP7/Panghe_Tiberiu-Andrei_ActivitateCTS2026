package ro.ase.cts.clase;

public class ComandaRezervare implements Command {
    private MasaAbstracta masa;

    public ComandaRezervare(MasaAbstracta masa) {
        super();
        this.masa = masa;
    }

    @Override
    public void executa() {
        this.masa.rezervaMasa();
    }
}
