package cts.Panghe.Tiberiu_Andrei.g1162.adapter;

import java.time.LocalDateTime;

public class BiletRezervatOnline extends BiletDeAcces implements OnlineOrder {
    public BiletRezervatOnline(String numeFilm, String regie, String actoriPrincipali, String companieProducatoare, String descriere, String reclame, LocalDateTime dataSiOra, String loc, String sala) {
        super(numeFilm, regie, actoriPrincipali, companieProducatoare, descriere, reclame, dataSiOra, loc, sala);
    }

    @Override
    public String showOrderDetails() {
        final StringBuilder sb = new StringBuilder("BiletRezervatOnline:");
        sb.append("NumeFilm: ").append(super.getNumeFilm()).append('\n');
        sb.append("Regie: ").append(super.getRegie()).append('\n');
        sb.append("ActoriPrincipali: ").append(super.getActoriPrincipali()).append('\n');
        sb.append("CompanieProducatoare: ").append(super.getCompanieProducatoare()).append('\n');
        sb.append("Descriere: ").append(super.getDescriere()).append('\n');
        sb.append("Reclame: ").append(super.getReclame()).append('\n');
        sb.append("DataSiOra: ").append(super.getDataSiOra()).append('\n');
        sb.append("Loc: ").append(super.getLoc()).append('\n');
        sb.append("Sala: ").append(super.getSala()).append('\n');
        return sb.toString();
    }


}
