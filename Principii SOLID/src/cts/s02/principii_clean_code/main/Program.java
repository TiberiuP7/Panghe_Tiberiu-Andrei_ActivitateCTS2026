package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Utils;

public class Program {

	public static void main(String[] args) {
		List<Angajat> listaAngajati =  new ArrayList<>();
		try {
			listaAngajati = Utils.readAngajati("./Principii SOLID/angajati.txt");
			for(Angajat angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.finantare();
				angajat.statut();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
