package cts.Panghe.Tiberiu_Andrei.g1162.decorator;

public class Abonament implements Subscription {
    private String numeClient;
    private String tipAbonament;
    private float pretLunar;
    private int durataInLuni;

    public Abonament(String numeClient, String tipAbonament, float pretLunar, int durataInLuni) {
        this.numeClient = numeClient;
        this.tipAbonament = tipAbonament;
        this.pretLunar = pretLunar;
        this.durataInLuni = durataInLuni;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public String getTipAbonament() {
        return tipAbonament;
    }

    public void setTipAbonament(String tipAbonament) {
        this.tipAbonament = tipAbonament;
    }

    public float getPretLunar() {
        return pretLunar;
    }

    public void setPretLunar(float pretLunar) {
        this.pretLunar = pretLunar;
    }

    public int getDurataInLuni() {
        return durataInLuni;
    }

    public void setDurataInLuni(int durataInLuni) {
        this.durataInLuni = durataInLuni;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Abonament{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", tipAbonament='").append(tipAbonament).append('\'');
        sb.append(", pretLunar=").append(pretLunar);
        sb.append(", durataInLuni=").append(durataInLuni);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return this.pretLunar * durationInMonths;
    }
}
