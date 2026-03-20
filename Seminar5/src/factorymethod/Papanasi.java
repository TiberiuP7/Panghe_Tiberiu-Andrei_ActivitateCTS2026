package factorymethod;

public class Papanasi extends Desert {
    public Papanasi(float pret, float gramaj, int calorii) {
        super(pret, gramaj, calorii);
    }

    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Papanasii au ").append(super.toString());
        System.out.println(sb);
    }
}
