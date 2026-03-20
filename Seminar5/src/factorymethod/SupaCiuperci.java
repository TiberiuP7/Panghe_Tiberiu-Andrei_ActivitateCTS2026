package factorymethod;

public class SupaCiuperci extends Supa {
    public SupaCiuperci(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
         StringBuilder builder = new StringBuilder();
            builder.append("Supa de ciuperci are ").append(super.toString());
         System.out.println(builder);
     }
}
