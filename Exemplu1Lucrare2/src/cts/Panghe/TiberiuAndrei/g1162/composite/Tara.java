package cts.Panghe.TiberiuAndrei.g1162.composite;

import java.util.ArrayList;
import java.util.List;

public class Tara implements Continent {
    private String numeTara;
    private List<Continent> listaTari;

    public Tara(String nume) {
        this.numeTara = nume;
        this.listaTari = new ArrayList<Continent>();
    }

    public void adaugaNodTara(Continent continent) {
        listaTari.add(continent);
    }

    public void stergeNodTara(Continent continent) {
        listaTari.remove(continent);
    }

    public Continent getNodTara(int index) {
        return listaTari.get(index);
    }

    public int getNumarTari() {
        return listaTari.size();
    }

    public String getNumeTara() {
        return numeTara;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Tara: " + this.numeTara + " contine urmatoarele tulpini de virusuri:");
        for(Continent continent : listaTari) {
            continent.afiseazaDetaliiStructura(spatii + "   ");
        }
    }

    public int numarTotalInfectari() {
        int numarTotalInfectari = 0;
        for(int i =0; i<this.getNumarTari(); i++) {
            Continent nodTara = this.getNodTara(i);
            if(nodTara instanceof Virus) {
                numarTotalInfectari += ((Virus) nodTara).getNrInfectari();
            }
            else {
                Tara tara = (Tara) nodTara;
                int infectariNod = tara.numarTotalInfectari();
                System.out.println(tara.getNumeTara() + " are un numar total de infectari de: " + infectariNod);
                numarTotalInfectari += infectariNod;
            }
        }
        return numarTotalInfectari;
    }
}
