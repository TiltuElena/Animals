package Tasks;

import java.util.Objects;

public class Artiodactil extends Mamifer {
    private int nrCoarne;
    int numarDegete;

    public int getNrCoarne() {
        return nrCoarne;
    }

    public void setNrCoarne(int nrCoarne) {
        this.nrCoarne = nrCoarne;
    }

    public Artiodactil() {
        super();
        this.numarDegete = 0;
        this.nrCoarne = 0;
    }

    public Artiodactil(String nume, int varsta, String tipNutritie, int numarDegete, String culoare, int nrCoarne) {
        super(nume, varsta, tipNutritie, culoare);
        this.numarDegete = numarDegete;
        this.nrCoarne = nrCoarne;
    }

    @Override
    public void Mananca(String mancare) {
        System.out.println("Artiodactilul " + super.getNume() + " mananca: " + mancare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Artiodactil that = (Artiodactil) o;
        return numarDegete == that.numarDegete;
    }

    @Override
    public String toString() {
        return "Artiodactil: " + this.getNume() +
                ", varsta: " + this.varsta +
                ", tip nutritie: " + this.getTipNutritie() +
                ", numar degete: " + this.numarDegete +
                ", numar coarne: " + this.nrCoarne ;
    }
}
