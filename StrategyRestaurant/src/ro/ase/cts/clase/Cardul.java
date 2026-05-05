package ro.ase.cts.clase;

public class Cardul implements ModPlata {
    @Override
    public void plateste(String numeClient, double suma) {
        System.out.println(numeClient + " plateste cu cardul suma de " + suma + " lei.");
    }
}
