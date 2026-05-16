package cts.Panghe.TiberiuAndrei.g1162.chain;

public abstract class Filtrare {
    protected Filtrare urmatorulFiltru;

    public Filtrare getUrmatorulFiltru() {
        return urmatorulFiltru;
    }

    public void setUrmatorulFiltru(Filtrare urmatorulFiltru) {
        this.urmatorulFiltru = urmatorulFiltru;
    }

    public abstract void filtreaza(PaginaW paginaW);
}
