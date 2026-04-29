package ro.ase.cts.decorator.main;

import ro.ase.cts.decorator.clase.NotaDePlata;
import ro.ase.cts.decorator.clase.NotaDePlataAbstract;
import ro.ase.cts.decorator.decorator.NotaDePlata1Mai;
import ro.ase.cts.decorator.decorator.NotaDePlataDecorator;
import ro.ase.cts.decorator.decorator.NotaDePlataPrintatNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(100f, "10.10.2024");
        notaDePlata.printeaza();

        int a = 2;
        NotaDePlataDecorator notaDePlataDecorator = null;

        if(a == 1)
        {
            notaDePlataDecorator = new NotaDePlataPrintatNoulAn(notaDePlata);
        }
        else
        {
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }

        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();

    }

}
