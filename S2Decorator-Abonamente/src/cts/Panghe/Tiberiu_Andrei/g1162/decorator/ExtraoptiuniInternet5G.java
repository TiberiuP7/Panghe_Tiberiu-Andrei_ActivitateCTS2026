package cts.Panghe.Tiberiu_Andrei.g1162.decorator;

public class ExtraoptiuniInternet5G extends Decorator {
    private static final float pret = 10.0f;

    public ExtraoptiuniInternet5G(Subscription subscription) {
        super(subscription);
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return super.totalCosts(durationInMonths) + pret * durationInMonths;
    }

    public void adaugaExtraoptiuniInternet5G() {
        System.out.println("S-au adaugat extraoptiuni pentru internet 5G.");
    }
}
