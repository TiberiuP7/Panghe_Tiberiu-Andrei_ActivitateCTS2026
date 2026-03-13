package simplefactory.clase;

public class Autobuz extends MijlocTransport{

    public Autobuz(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Autobuzul are - ");
        sb.append("Numar roti: ").append(super.numarRoti);
        sb.append("Nr inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
