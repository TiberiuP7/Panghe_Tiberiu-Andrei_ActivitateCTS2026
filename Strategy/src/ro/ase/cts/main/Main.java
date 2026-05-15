package ro.ase.cts.main;

import ro.ase.cts.clase.ProbaGrila;
import ro.ase.cts.clase.ProbaOrala;
import ro.ase.cts.clase.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Ion");
        student.examinare();

        student.setModSustinere(new ProbaOrala());
        student.examinare();
    }
}