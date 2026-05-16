package cts.Panghe.Tiberiu_Andrei.g1162.adapter;

import java.time.LocalDateTime;

public class BiletDeAcces implements Ticket {
    private String numeFilm;
    private String regie;
    private String actoriPrincipali;
    private String companieProducatoare;
    private String descriere;
    private String reclame;
    private LocalDateTime dataSiOra;
    private String loc;
    private String sala;

    public BiletDeAcces(String numeFilm, String regie, String actoriPrincipali, String companieProducatoare, String descriere, String reclame, LocalDateTime dataSiOra, String loc, String sala) {
        this.numeFilm = numeFilm;
        this.regie = regie;
        this.actoriPrincipali = actoriPrincipali;
        this.companieProducatoare = companieProducatoare;
        this.descriere = descriere;
        this.reclame = reclame;
        this.dataSiOra = dataSiOra;
        this.loc = loc;
        this.sala = sala;
    }

    public String getNumeFilm() {
        return numeFilm;
    }

    public void setNumeFilm(String numeFilm) {
        this.numeFilm = numeFilm;
    }

    public String getRegie() {
        return regie;
    }

    public void setRegie(String regie) {
        this.regie = regie;
    }

    public String getActoriPrincipali() {
        return actoriPrincipali;
    }

    public void setActoriPrincipali(String actoriPrincipali) {
        this.actoriPrincipali = actoriPrincipali;
    }

    public String getCompanieProducatoare() {
        return companieProducatoare;
    }

    public void setCompanieProducatoare(String companieProducatoare) {
        this.companieProducatoare = companieProducatoare;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getReclame() {
        return reclame;
    }

    public void setReclame(String reclame) {
        this.reclame = reclame;
    }

    public LocalDateTime getDataSiOra() {
        return dataSiOra;
    }

    public void setDataSiOra(LocalDateTime dataSiOra) {
        this.dataSiOra = dataSiOra;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    @Override
    public String print() {
        return "Film: " + numeFilm + "\nRegie: " + regie + "\nActori principali: " + actoriPrincipali + "\nCompanie producatoare: " + companieProducatoare + "\nDescriere: " + descriere + "\nReclame: " + reclame + "\nData si ora: " + dataSiOra.toString() + "\nLoc: " + loc + "\nSala: " + sala;
    }
}
