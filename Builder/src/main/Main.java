package main;

import builder.Pantof;
import builder.PantofBuilder;
import builder.TipPantof;
import customexception.PantofException;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> materialeSecundare = new ArrayList<>();
        materialeSecundare.add("Piele");
        materialeSecundare.add("Textil");
        materialeSecundare.add("Plastic");
        materialeSecundare.add("Cauciuc");

        List<String> mesaje =  new ArrayList<>();
        mesaje.add("Balenciaga");
        mesaje.add("Black is the new pink!");

        try {
            Pantof balerin = new PantofBuilder()
                    .setTipPantof(TipPantof.BALERINI)
                    .setNrPantof(42)
                    .setDimensiuneToc(2)
                    .setMesaje(mesaje)
                    .build();

            System.out.println(balerin.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }

        mesaje.add("Tiberiu");
        mesaje.add("All stars");
        mesaje.add("Converse");

        try {
            Pantof conversi = new PantofBuilder()
                        .setTipPantof(TipPantof.TENISI)
                        .setNrPantof(45)
                        .setDimensiuneToc(3)
                        .setMesaje(mesaje)
                        .build();

            System.out.println(conversi.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }

        List<String> mesaje2 =  new ArrayList<>();
        mesaje2.add("Nike");
        mesaje2.add("Air Max");

        try {
            Pantof pantofPersonalizat = new PantofBuilder()
                    .setTipPantof(TipPantof.TENISI)
                    .setNrPantof(45)
                    .setDimensiuneToc(5)
                    .setMaterialeSecundare(materialeSecundare)
                    .setMesaje(mesaje2)
                    .build();

            System.out.println(pantofPersonalizat.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pantof balerinPersonalizat = new PantofBuilder()
                    .setTipPantof(TipPantof.BALERINI)
                    .setNrPantof(42)
                    .setDimensiuneToc(2)
                    .setMaterialeSecundare(materialeSecundare)
                    .setMesaje(mesaje)
                    .build();

            System.out.println(balerinPersonalizat.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }

        try {
            Pantof ghete = new PantofBuilder()
                    .setTipPantof(TipPantof.GHETE)
                    .setNrPantof(50)
                    .setDimensiuneToc(15)
                    .build();

            System.out.println(ghete.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }

        List<String> materialeSecundareStiletto = new ArrayList<>();
        materialeSecundareStiletto.add("Piele");
        materialeSecundareStiletto.add("Textil");


        try {
            Pantof pantofDama = new PantofBuilder()
                    .setTipPantof(TipPantof.STILETTO)
                    .setNrPantof(40)
                    .setDimensiuneToc(10)
                    .setMaterialeSecundare(materialeSecundareStiletto)
                    .build();

            System.out.println(pantofDama.toString());
        } catch (PantofException e) {
            System.out.println(e.getMessage());
        }
    }
}
