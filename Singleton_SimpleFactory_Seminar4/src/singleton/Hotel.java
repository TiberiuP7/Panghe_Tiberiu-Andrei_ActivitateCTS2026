package singleton;

public class Hotel {
    private String numeHotel;
    private int numarCamere;
    private int nrCamereOcupate;

    private Hotel(String numeHotel, int numarCamere, int nrCamereOcupate) {
        this.numeHotel = numeHotel;
        this.numarCamere = numarCamere;
        this.nrCamereOcupate = nrCamereOcupate;
    }

    private static Hotel instance = null;

    public static synchronized Hotel getInstance(String numeHotel, int numarCamere, int nrCamereOcupate) {
        if (instance == null) {
            instance = new Hotel(numeHotel, numarCamere, nrCamereOcupate);
        }
        return instance;
    }

    public void rezervaCamera() {
        if (this.nrCamereOcupate < this.numarCamere) {
            nrCamereOcupate++;
            System.out.println("Camera rezervata cu succes!");
        } else {
            System.out.println("Nu mai sunt camere disponibile.");
        }
    }

    public void afiseazaDetaliiHotel() {
        StringBuilder builder =  new StringBuilder();
        builder.append("Nume hotel: ").append(this.numeHotel).append("\n");
        builder.append("Numar camere: ").append(this.numarCamere).append("\n");
        builder.append("Numar camere ocupate: ").append(this.nrCamereOcupate).append("\n");
        System.out.println(builder.toString());
    }
}
