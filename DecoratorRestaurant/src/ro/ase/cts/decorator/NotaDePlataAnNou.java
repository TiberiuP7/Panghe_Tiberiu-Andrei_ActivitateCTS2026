package ro.ase.cts.decorator;

import ro.ase.cts.clase.NotaDePlataAbstract;

public class NotaDePlataAnNou extends NotaDePlataDecorator {

    public NotaDePlataAnNou(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("Va dorim un An Nou fericit si plin de bucurii!");
    }
}
