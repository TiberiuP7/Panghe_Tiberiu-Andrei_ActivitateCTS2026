package simplefactory.clase;

public abstract class MijlocTransport {
    protected int numarRoti;
    protected String nrInmatriculare;

    public MijlocTransport(int numarRoti, String nrInmatriculare) {
        this.numarRoti = numarRoti;
        this.nrInmatriculare = nrInmatriculare;
    }

    public abstract void afiseazaDescriere();
}
