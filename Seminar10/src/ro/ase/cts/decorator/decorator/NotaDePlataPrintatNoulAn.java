package ro.ase.cts.decorator.decorator;

import ro.ase.cts.decorator.clase.NotaDePlataAbstract;

public class NotaDePlataPrintatNoulAn extends NotaDePlataDecorator {

    public NotaDePlataPrintatNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Va dorim un an nou fericit!");
    }
}
