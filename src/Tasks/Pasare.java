package Tasks;

import java.util.Objects;

class Pasare extends Animal {
    String culoare;
    private double lungimeAripi;

    public Pasare() {
        super();
        this.lungimeAripi = 0d;
        this.culoare = "Necunosvut";
    }

    public Pasare(String nume, int varsta, String culoare, double lungimeAripi) {
        super(nume, varsta);
        this.culoare = culoare;
        this.lungimeAripi = lungimeAripi;
    }

    @Override
    public void Mananca(String mancare) {
        System.out.println("Pasarea " + super.getNume() + " mananca: " + mancare);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Pasare pasare = (Pasare) o;
        return Objects.equals(culoare, pasare.culoare);
    }

    @Override
    public String toString() {
        return "Pasare: " + this.getNume() +
                ", varsta: " + this.varsta +
                ", culoare: " + this.culoare +
                ", lungime aripi: " + this.lungimeAripi;
    }
}