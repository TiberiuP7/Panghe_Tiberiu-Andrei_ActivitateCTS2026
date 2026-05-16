package cts.Panghe.TiberiuAndrei.g1162.chain;

import java.util.ArrayList;
import java.util.List;

public class PaginaW {
    String nume;
    List<Item> itemList;

    public PaginaW(String nume) {
        this.nume = nume;
        this.itemList = new ArrayList<Item>();
    }

    public void adaugaItem(Item item) {
        this.itemList.add(item);
    }

    public void stergeItem(Item item) {
        this.itemList.remove(item);
    }

    public Item getItem(int index) {
        return this.itemList.get(index);
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

}
