package factorymethod;

public class SupaLegume extends Supa {

    public SupaLegume(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
         StringBuilder builder = new StringBuilder();
            builder.append("Supa de legume are ").append(super.toString());
         System.out.println(builder);
     }

}
