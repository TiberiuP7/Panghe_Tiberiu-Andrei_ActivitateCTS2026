package cts.Panghe.TiberiuAndrei.g1162.chain;

public class SchimbareSetariParagrafe extends Filtrare {
    @Override
    public void filtreaza(PaginaW paginaW) {
        for (Item item : paginaW.getItemList()) {
            if (item instanceof Paragraf) {
                ((Paragraf) item).setCuloare("negru");
                ((Paragraf) item).setSetari("fara alte setari");
                System.out.println("Schimbare setari paragrafe: Paragraful " + ((Paragraf) item).getText() + " a fost modificat cu culoarea negru si fara alte setari.");
            }
        }

        if (super.getUrmatorulFiltru() != null) {
            super.getUrmatorulFiltru().filtreaza(paginaW);
        }
    }
}
