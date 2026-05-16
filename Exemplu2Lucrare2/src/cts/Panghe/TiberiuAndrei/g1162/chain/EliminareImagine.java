package cts.Panghe.TiberiuAndrei.g1162.chain;

public class EliminareImagine extends Filtrare {

    @Override
    public void filtreaza(PaginaW paginaW) {
        paginaW.getItemList().removeIf(item -> item instanceof Imagine);
        System.out.println("Filtrul de eliminare a imaginilor a fost aplicat.");
        if (super.getUrmatorulFiltru() != null) {
            super.getUrmatorulFiltru().filtreaza(paginaW);
        }
    }
}
