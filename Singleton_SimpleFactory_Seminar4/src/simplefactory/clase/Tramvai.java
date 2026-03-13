package simplefactory.clase;

public class Tramvai extends MijlocTransport {

    public Tramvai(int numarRoti, String nrInmatriculare) {
        super(numarRoti, nrInmatriculare);
    }

    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder("Tramvaiul are - ");
        sb.append("Numar roti: ").append(super.numarRoti);
        sb.append("Nr inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
