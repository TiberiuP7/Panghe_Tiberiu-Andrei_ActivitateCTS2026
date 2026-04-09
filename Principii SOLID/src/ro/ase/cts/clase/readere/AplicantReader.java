package ro.ase.cts.clase.readere;

import ro.ase.cts.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public interface AplicantReader {
     List<Aplicant> readAplicanti(String file) throws FileNotFoundException;
}