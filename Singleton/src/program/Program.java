package program;

import aplicatii.AplicatieMobila;

public class Program {
    public static void main(String[] args) {
        AplicatieMobila ap1= AplicatieMobila.getInstanta();
        AplicatieMobila ap2= AplicatieMobila.getInstanta();
        ap2.setNume("Telegram");
        System.out.println(ap1.getNume());
    }
}
