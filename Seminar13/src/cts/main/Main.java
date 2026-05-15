package cts.main;

import cts.clase.*;
import ro.ase.cts.clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTroleibuz = new CalatorieTroleibuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler  calatorieMetrou= new CalatorieMetrou();

        calatorieTroleibuz.setSuccesor(calatorieAutobuz);
        calatorieAutobuz.setSuccesor(calatorieTramvai);
        calatorieAutobuz.setSuccesor(calatorieMetrou);

        calatorieTroleibuz.recomandaCalatorie(10);
    }
}
