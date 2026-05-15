public class CalatorAbonat {
    String nume;
    private float sold;

    public float getSold() {
        return sold;
    }

    public void setSold(float sold) {
        this.sold = sold;
    }

    public void platesteBilet(float pret) {
        if(sold> pret) {
            System.out.println(this.nume + " plateste " + pret + " pentru o calatorie");
            sold = pret;
        } else {
            System.out.println("Sold insuficient. Mergeti pe jos!");
        }
    }

    public CalatorAbonat(String nume) {
        this.nume = nume;
    }

    public void notificare(String nrLinie) {
        System.out.println(this.nume + " " + nrLinie);
    }
}
