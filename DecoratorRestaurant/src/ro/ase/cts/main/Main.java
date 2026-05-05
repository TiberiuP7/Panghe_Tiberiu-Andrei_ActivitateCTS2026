package ro.ase.cts.main;

import ro.ase.cts.clase.NotaDePlata;
import ro.ase.cts.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.NotaDePlataAnNou;
import ro.ase.cts.decorator.NotaDePlataDecorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(100, "22.10.2025");
        notaDePlata.printeaza();

        NotaDePlataDecorator decorator = new NotaDePlataAnNou(notaDePlata);
        decorator.printeaza();
        decorator.printeazaFelicitare();
    }
}
