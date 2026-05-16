package cts.Panghe.Tiberiu_Andrei.g1162.decorator;

public class ExtraoptiuniMinuteInRoaming extends Decorator {
    private static final float pret = 7.0f;

    public ExtraoptiuniMinuteInRoaming(Subscription subscription) {
        super(subscription);
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return super.totalCosts(durationInMonths) + pret * durationInMonths;
    }

    public void adaugaExtraoptiuniMinuteInRoaming() {
        System.out.println("S-au adaugat minute in roaming pentru abonamentul curent.");
    }
}
