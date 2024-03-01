package Tasks;

import java.util.List;
import java.util.Objects;

public class Animal {
    private String nume;
    int varsta;

    public Animal() {
        this.nume = "Necunoscut";
        this.varsta = 0;
    }

    public Animal(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return this.nume;
    }

    public void Mananca(String mancare){
        System.out.println("Animalul mananca: " + mancare);
    }

    @Override
    public String toString() {
        return "Animal{" +
                " nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return varsta == animal.varsta && Objects.equals(nume, animal.nume);
    }

    public void filtreazaVarsta(List<Animal> lista, int varstaMinima) {
        for (Animal animal : lista) {
            if (animal.varsta >= varstaMinima) {
                System.out.println(animal);
            }
        }
    }

    public void filtreazaVarsta(List<Animal> lista, int varstaMinima, int varstaMaxima) {
        for (Animal animal : lista) {
            if (animal.varsta >= varstaMinima && animal.varsta <= varstaMaxima) {
                System.out.println(animal);
            }
        }
    }
}