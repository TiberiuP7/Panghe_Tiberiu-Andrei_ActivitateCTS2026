package cts.Panghe.Tiberiu_Andrei.g1162.decorator;

public class ExtraoptiuniInternetInRoaming extends Decorator {
    private static final float pret = 5.0f;

    public ExtraoptiuniInternetInRoaming(Subscription subscription) {
        super(subscription);
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return super.totalCosts(durationInMonths) + pret * durationInMonths;
    }

    public void adaugaExtraoptiuniInternetInRoaming() {
        System.out.println("S-au adaugat extraoptiuni pentru internet in roaming.");
    }
}
