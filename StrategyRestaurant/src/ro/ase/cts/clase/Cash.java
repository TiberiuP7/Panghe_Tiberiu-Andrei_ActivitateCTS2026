package ro.ase.cts.clase;

public class Cash implements ModPlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println(numeClient + " plateste cash suma de " + suma + " lei.");
    }
}
