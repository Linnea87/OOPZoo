import java.util.ArrayList;
import java.util.List;

// Jag gör ZooApp som startar och kör hela programmet.
public class ZooApp {
    private List<Animal> animals;

    // När jag skapar ZooApp bygger jag listan av djur och startar zoo:t direkt.
    public ZooApp() {
        animals = new ArrayList<>();
        initZoo(); // Jag fyller listan med djur.
        runZoo();  // Jag kör utskriften av zoo:t.
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
    private void runZoo() {
        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐\n");

        // Jag visar alla savann-djur.
        System.out.println("\n=== Savanna Animals ===");
        System.out.println("(In the wild, these animals live on the wide African savanna.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                presentAnimal(animal);
            }
        }

        // Jag visar alla vatten-djur.
        System.out.println("\n=== Aquatic Animals ===");
        System.out.println("(In the wild, these animals live in or near the water.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                presentAnimal(animal);
            }
        }

        System.out.println("⭐·· The Zoo is now closed, thanks for visiting! ·· ⭐");
    }

    // Jag presenterar ett djur med namn, art, ålder, ljud, mat och rörelse.
    private void presentAnimal(Animal animal) {

            System.out.println("----- " + "This is " + animal.getName() + " -----");
            System.out.println("Species: " + animal.getSpecies());

            if (animal.isBaby()) {
                System.out.println(animal.getName() + " is a baby.");
            }
            else {
                System.out.println(animal.getName() + " is an adult.");
            }

            animal.makeSound();
            animal.eat();

            if (animal instanceof Savanna savannaAnimal) {
                savannaAnimal.roamSavanna();
            }
            if (animal instanceof Aquatic aquaticAnimal) {
                aquaticAnimal.swim();
            }
            System.out.println(); // Jag lägger in en extra rad för luft mellan djuren.
    }

}
