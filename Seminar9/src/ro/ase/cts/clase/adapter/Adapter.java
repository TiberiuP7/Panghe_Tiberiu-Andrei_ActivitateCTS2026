package ro.ase.cts.clase.adapter;

import ro.ase.cts.clase.farmacie.Medicament;

public class Adapter extends ro.ase.cts.clase.farmacie.Medicament {
    private Medicament medicament;

    public Adapter(String nume) {
        super(nume);
    }

    public Adapter(Medicament medicament) {
        super(medicament.getNume());
    }

    @Override
    public void cumparaMedicament() {
        medicament.cumparaMedicament();
    }
}
