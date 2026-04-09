package ro.ase.cts.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.readere.AngajatiReader;
import ro.ase.cts.clase.readere.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati = new ArrayList<>();
		try {
			AplicantReader reader = new AngajatiReader();
			listaAngajati = reader.readAplicanti("./Principii SOLID/angajati.txt");
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.statut();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
