package ro.ase.cts.clase;

public class Client {
    private String numeClient;
    private int nrPersoane;

    public Client(String numeClient, int nrPersoane) {
        this.numeClient = numeClient;
        this.nrPersoane = nrPersoane;
    }

    public String getNumeClient() {
        return this.numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public int getNrPersoane() {
        return this.nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("numeClient='").append(this.numeClient).append('\'');
        sb.append(", nrPersoane=").append(this.nrPersoane);
        sb.append('}');
        return sb.toString();
    }
}
