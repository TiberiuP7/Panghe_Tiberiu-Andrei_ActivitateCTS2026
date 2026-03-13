package simplefactory.clase;

public class Troleibuz extends MijlocTransport {
    private int numarRoti;
    private String nrInmatriculare;

    public Troleibuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Troleibuzul are - ");
        sb.append("Numar roti: ").append(super.numarRoti);
        sb.append("Nr inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
