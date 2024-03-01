package Tasks;

import java.util.Objects;

public class Mamifer extends Animal {
    private String tipNutritie;

    public String getTipNutritie() {
        return tipNutritie;
    }

    public void setTipNutritie(String tipNutritie) {
        this.tipNutritie = tipNutritie;
    }

    public Mamifer() {
        super();
        this.tipNutritie = "Necunoscut";
    }

    public Mamifer(String nume, int varsta, String tipNutritie) {
        super(nume, varsta);
        this.tipNutritie = tipNutritie;
    }

    @Override
    public void Mananca(String mancare) {
        System.out.println(" Mamiferul " + super.getNume() + " mananca: " + mancare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mamifer mamifer = (Mamifer) o;
        return Objects.equals(tipNutritie, mamifer.tipNutritie);
    }

    @Override
    public String toString() {
        return "Mamifer: " + this.getNume() +
                ", varsta: " + this.varsta +
                ", tip nutritie: " + this.tipNutritie;
    }
}