package cts.Panghe.TiberiuAndrei.g1162.main;

import cts.Panghe.TiberiuAndrei.g1162.chain.*;
import cts.Panghe.TiberiuAndrei.g1162.composite.Item;
import cts.Panghe.TiberiuAndrei.g1162.composite.PaginaWeb;
import cts.Panghe.TiberiuAndrei.g1162.composite.Site;
import cts.Panghe.TiberiuAndrei.g1162.strategy.Client;
import cts.Panghe.TiberiuAndrei.g1162.strategy.IProdus;
import cts.Panghe.TiberiuAndrei.g1162.strategy.OrdineCrescatoarePret;
import cts.Panghe.TiberiuAndrei.g1162.strategy.OrdineDescrescatoarePret;

public class Main {
    public static void main(String[] args) {
        IProdus pretCrescator = new OrdineCrescatoarePret();
        IProdus pretDescrescator = new OrdineDescrescatoarePret();

        Client client = new Client("Tiberiu", pretCrescator);
        client.filtreaza();

        client.setAfisareProdus(pretDescrescator);
        client.filtreaza();


        System.out.println("-----------------------------");

        Site paginaWeb = new PaginaWeb("Magazin Online");
        Site site = new PaginaWeb("Emag");
        Site site2 = new PaginaWeb("Altex");

        Site item = new Item("Descriere", "Descrierea Emag", "Alb-Negru", 100);
        Site item1 = new Item("Descriere", "Descrierea Altex", "Alb-Negru", 200);
        Site item2 = new Item("Descriere", "Descrierea Emag", "Alb-Negru", 300);
        Site item3 = new Item("Descriere", "Descrierea Altex", "Alb-Negru", 400);

        System.out.println("Inainte de modificare:\n");
        ((PaginaWeb)paginaWeb).adaugaItem(site);
        ((PaginaWeb)paginaWeb).adaugaItem(site2);
        ((PaginaWeb)paginaWeb).adaugaItem(item);
        ((PaginaWeb)site).adaugaItem(item1);

        ((PaginaWeb)site2).adaugaItem(item2);
        ((PaginaWeb)site2).adaugaItem(item3);

        paginaWeb.filtreazaPagina("");

        System.out.println("\nDupa modificare:\n");
        ((PaginaWeb) paginaWeb).stergeItem(item);
        ((PaginaWeb) paginaWeb).stergeItem(item1);

        ((PaginaWeb) site).adaugaItem(item);
        ((PaginaWeb) site).adaugaItem(item2);

        paginaWeb.filtreazaPagina("");

        System.out.println("------------------------------");

        Filtrare eliminareImagine = new EliminareImagine();
        Filtrare stergeSetariParagrafe = new SchimbareSetariParagrafe();

        eliminareImagine.setUrmatorulFiltru(stergeSetariParagrafe);

        cts.Panghe.TiberiuAndrei.g1162.chain.Item imagine = new Imagine("Imagine", 500, "Color");
        cts.Panghe.TiberiuAndrei.g1162.chain.Item imagine2 = new Imagine("Imagine", 300, "Alb-Negru");
        cts.Panghe.TiberiuAndrei.g1162.chain.Item paragraf = new Paragraf("Paragraf1", "Textul paragrafului", "Font: Arial, Size: 12");
        cts.Panghe.TiberiuAndrei.g1162.chain.Item paragraf2 = new Paragraf("Paragraf2", "Textul paragrafului", "Font: Times New Roman, Size: 14");

        PaginaW paginaWeb2 = new PaginaW("Pagina de test");
        paginaWeb2.adaugaItem(imagine);
        paginaWeb2.adaugaItem(imagine2);
        paginaWeb2.adaugaItem(paragraf);
        paginaWeb2.adaugaItem(paragraf2);

        eliminareImagine.filtreaza(paginaWeb2);
    }
}
