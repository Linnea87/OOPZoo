package app;

import java.util.ArrayList;
import java.util.List;

import animals.Animal;
import animals.savanna.Elephant;
import animals.savanna.Lion;
import animals.savanna.Giraffe;
import animals.aquatic.Seal;
import animals.aquatic.Dolphin;
import animals.aquatic.Penguin;
import interfaces.Savanna;
import interfaces.Aquatic;
import interfaces.Trainable;
import util.AnimalPresenter;

// app.ZooApp ansvarar för att hålla listan av djur och visa dem i olika miljöer.
// Här finns logiken för att skriva ut alla djur, bara savann-djur, vatten-djur,
// en enkel översikt (lista) eller starta en uppvisning med tricks.
public class ZooApp {
    private List<Animal> animals;
    private AnimalPresenter presenter;

    // När jag skapar app.ZooApp fyller jag listan med djur och förbereder utskriften.
    public ZooApp() {
        animals = new ArrayList<>();
        presenter = new AnimalPresenter();
        initZoo(); // Jag fyller listan med djur.

        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐");
    }

    // Jag skapar alla djur som ska finnas i zoo:t.
    private void initZoo() {
        animals.add(new Elephant("Dumbo", 2));
        animals.add(new Seal("Sammy", 1));
        animals.add(new Lion("Simba", 5));
        animals.add(new Giraffe("Sky", 3));
        animals.add(new Dolphin("Della", 4));
        animals.add(new Penguin("Pingo", 6));
    }

    // Jag skriver ut rubriker och presenterar djuren i sina miljöer.
    public void showSavannaAnimals() {
        // Jag visar alla savann-djur med detaljerad information.
        System.out.println("\n=== interfaces.Savanna Animals ===");
        System.out.println("(In the wild, these animals live on the wide African savanna.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                presenter.present(animal);
            }
        }
    }

    public void showAquaticAnimals() {
        // Jag visar alla vatten-djur med detaljerad information.
        System.out.println("\n=== interfaces.Aquatic Animals ===");
        System.out.println("(In the wild, these animals live in or near the water.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                presenter.present(animal);
            }
        }
    }
    // Jag visar en översikt över alla djur i zoo:t (namn + art).
    // Detta är bara en lista – vill man se detaljer får man välja miljö i menyn.
    public void showAnimalList() {
        // Jag visar alla djur i zoo:t.
        System.out.println("\n=== Zoo Overview ===");

        // interfaces.Savanna-djur först
        System.out.println("\n--- interfaces.Savanna Animals ---");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                System.out.println(animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
        System.out.println();

        System.out.println("--- interfaces.Aquatic Animals ---");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                System.out.println(animal.getName() + " (" + animal.getSpecies() + ")");
            }
        }
        System.out.println();
    }

    // Jag kör en kort show med alla vuxna djur som kan tricks.
    public void showAnimalShow() {
        System.out.println("\n=== Zoo Show ===\n");

        int acts = 0; // Jag räknar antalet nummer i showen
        for (Animal animal : animals) {
            // Om djuret är träningsbart och vuxet får det uppträda
            if (animal instanceof Trainable t && !animal.isBaby()) {
                System.out.println("Now on stage: " + animal.getName() + " the " + animal.getSpecies() + "!");
                t.performTrick(); // Djuret gör sitt trick
                System.out.println("👏👏👏\n"); // lägger till lite applåder
                acts++;
            }
        }
        // Om inga djur deltog i showen visar jag ett meddelande
        if (acts == 0) {
            System.out.println("No acts today. (No adult trainable animals available.)\n");
        }
        else {
            System.out.println("=== End of Show - thanks for watching! ===!");
        }
    }

}
