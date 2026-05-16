package cts.Panghe.TiberiuAndrei.g1162.composite;

import java.util.ArrayList;
import java.util.List;

public class PaginaWeb implements Site {
    String nume;
    List<Site> itemList;

    public PaginaWeb(String nume) {
        this.nume = nume;
        this.itemList = new ArrayList<Site>();
    }

    public void adaugaItem(Site item) {
        this.itemList.add(item);
    }

    public void stergeItem(Site item) {
        this.itemList.remove(item);
    }

    public Site getItem(int index) {
        return this.itemList.get(index);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Site> getItemList() {
        return itemList;
    }

    public void setItemList(List<Site> itemList) {
        this.itemList = itemList;
    }

    @Override
    public void filtreazaPagina(String spatii) {
        System.out.println(spatii + "Pagina web: " + this.nume + " are urmatoarele iteme: ");
        for (Site item : itemList) {
            item.filtreazaPagina(spatii + "   ");
        }
    }
}
