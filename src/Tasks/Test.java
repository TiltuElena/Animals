package Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        List<Animal> listaAnimale = new ArrayList<>();
        listaAnimale.add(new Mamifer("Caine", 5, "Omnivor"));
        listaAnimale.add(new Artiodactil("Capra", 4, "Ierbivor", 2));
        listaAnimale.add(new Pasare("Porumbel", 2, "Gri"));
        listaAnimale.add(new Mamifer("Urs", 7, "Omnivor"));

        for (Animal animalLista : listaAnimale) {
            animalLista.Mananca("Mancare");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti varsta minima pentru filtrare:");
        int varstaMinima = scanner.nextInt();
        System.out.println("Animale cu varsta mai mare sau egala cu " + varstaMinima + ":");
        animal.filtreazaVarsta(listaAnimale, varstaMinima);

        System.out.println("Introduceti varsta minima  pentru filtrare:");
        varstaMinima = scanner.nextInt();
        System.out.println("Introduceti varsta maxima pentru filtrare:");
        int varstaMaxima = scanner.nextInt();
        animal.filtreazaVarsta(listaAnimale, varstaMinima, varstaMaxima);

        System.out.println("\nComparare obiect nou cu lista de animale:");
        Animal animalNou = new Mamifer("Caine", 5, "Omnivor");
        for (Animal animalLista : listaAnimale) {
            if (animalLista.equals(animalNou)) {
                System.out.println("Coincide: " + animalLista + " cu " + animalNou.getNume());
            } else {
                System.out.println("Nu coincide: " + animalLista);
            }
        }
    }
}
