package panghe.tiberiu.clase.readere;

import panghe.tiberiu.clase.Angajat;
import panghe.tiberiu.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantReader {

    public AngajatiReader(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
            Angajat a = new Angajat();

            super.readAplicant(input2, a);

            int salariu = input2.nextInt();
            String ocupatie = input2.next();

            a.setSalariu(salariu);
            a.setOcupatie(ocupatie);

            angajati.add(a);
        }
        input2.close();
        return angajati;
    }
}
