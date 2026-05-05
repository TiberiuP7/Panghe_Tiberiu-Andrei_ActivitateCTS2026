package cts.Panghe.TiberiuAndrei.g1162.composite;

public class Virus implements Continent {
    private String numeVirus;
    private int nivelPericulozitate;
    private int nrInfectari;
    private int nrDecese;

    public Virus(String numeVirus, int nivelPericulozitate, int nrInfectari, int nrDecese) {
        this.numeVirus = numeVirus;
        this.nivelPericulozitate = nivelPericulozitate;
        this.nrInfectari = nrInfectari;
        this.nrDecese = nrDecese;
    }

    public String getNumeVirus() {
        return numeVirus;
    }

    public void setNumeVirus(String numeVirus) {
        this.numeVirus = numeVirus;
    }

    public int getNivelPericulozitate() {
        return nivelPericulozitate;
    }

    public void setNivelPericulozitate(int nivelPericulozitate) {
        this.nivelPericulozitate = nivelPericulozitate;
    }

    public int getNrInfectari() {
        return nrInfectari;
    }

    public void setNrInfectari(int nrInfectari) {
        this.nrInfectari = nrInfectari;
    }

    public int getNrDecese() {
        return nrDecese;
    }

    public void setNrDecese(int nrDecese) {
        this.nrDecese = nrDecese;
    }

    @Override
    public void afiseazaDetaliiStructura(String spatii) {
        System.out.println(spatii + "Virus: " + numeVirus + ", Nivel Periculozitate: " + nivelPericulozitate + ", Nr Infectari: " + nrInfectari + ", Nr Decese: " + nrDecese);
    }
}
