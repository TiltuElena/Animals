package Tasks;

import java.util.Objects;

class Pasare extends Animal {
    String culoare;

    public Pasare() {
        super();
        this.culoare = "Necunoscuta";
    }

    public Pasare(String nume, int varsta, String culoare) {
        super(nume, varsta);
        this.culoare = culoare;
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
                ", culoare: " + this.culoare;
    }
}