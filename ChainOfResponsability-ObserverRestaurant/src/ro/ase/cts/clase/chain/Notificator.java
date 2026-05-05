package ro.ase.cts.clase.chain;

import ro.ase.cts.clase.observer.Client;

public abstract class Notificator {
    private Notificator succesor;

    public Notificator getSuccesor() {
        return succesor;
    }

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public abstract void notifica(Client client, String mesaj);
}
