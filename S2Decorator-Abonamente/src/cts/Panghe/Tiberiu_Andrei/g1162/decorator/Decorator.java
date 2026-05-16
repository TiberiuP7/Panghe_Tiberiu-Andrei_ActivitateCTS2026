package cts.Panghe.Tiberiu_Andrei.g1162.decorator;

public abstract class Decorator implements Subscription {
    private Subscription subscription;

    public Decorator(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public float totalCosts(int durationInMonths) {
        return subscription.totalCosts(durationInMonths);
    }
}
