package ro.ase.cts.main;

import ro.ase.cts.clase.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;

public class Main {
    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medFarmacie) {
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args) {
        Medicament medicament1 = new Medicament("Paracetamol", 10);
        medicament1.achizitioneazaMedicament();

        ro.ase.cts.clase.farmacie.Medicament medicament2 = new ro.ase.cts.clase.farmacie.Medicament("Aspirina");
        medicament2.cumparaMedicament();

        Adapter adapterMedicament = new Adapter(medicament2);
        procurareMedicament(medicament2);
    }
}