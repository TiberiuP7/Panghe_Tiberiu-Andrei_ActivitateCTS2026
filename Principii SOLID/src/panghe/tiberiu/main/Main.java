package panghe.tiberiu.main;

import panghe.tiberiu.clase.Aplicant;
import panghe.tiberiu.clase.readere.AngajatiReader;
import panghe.tiberiu.clase.readere.AplicantReader;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		try {
            AplicantReader angajatiReader = new AngajatiReader("./Principii SOLID/angajati.txt");
			listaAngajati = angajatiReader.readAplicanti();
			for(Aplicant angajat:listaAngajati) {
				System.out.println(angajat.toString());
				angajat.afiseazaFinantare();
				angajat.afiseazaStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
