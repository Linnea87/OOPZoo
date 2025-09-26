package util;

import animals.Animal;
import interfaces.Aquatic;
import interfaces.Savanna;
import interfaces.Trainable;


// Jag ansvarar för att skriva ut ett djur på ett snyggt och enhetligt sätt.
public class AnimalPresenter {

    // Jag presenterar namn, art, ålder (baby/adult), personlighet, ljud, mat, rörelse och eventuella trick.
    public void present(Animal animal) {

        System.out.println("----- " + "This is " + animal.getName() + " -----");
        System.out.println("Species: " + animal.getSpecies());

        if (animal.isBaby()) {
            System.out.println(animal.getName() + " is a baby.");
        }
        else {
            System.out.println(animal.getName() + " is an adult.");
        }

        // Här skriver jag ut personligheten
        System.out.println(animal.getName() + " is " + animal.getPersonality());

        // Ljud och mat.
        animal.makeSound();
        animal.eat();

        // Rörelse i rätt miljö.
        if (animal instanceof Savanna savannaAnimal) {
            savannaAnimal.roamSavanna();
        }
        if (animal instanceof Aquatic aquaticAnimal) {
            aquaticAnimal.swim();
        }

        // Om djuret är vuxet och träningsbart visar jag dess trick.
        if (animal instanceof Trainable t && !animal.isBaby() ) {
            t.performTrick();
        }

        System.out.println(); // Jag lägger in en extra rad för luft mellan djuren.
    }
}
