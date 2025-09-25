import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    private List<Animal> animals;

    public ZooApp() {
        animals = new ArrayList<>();
        initZoo();
        runZoo();

    }
    private void initZoo() {
        animals.add(new Elephant("Dumbo", 2));
        animals.add(new Seal("Sammy", 1));
        animals.add(new Lion("Simba", 5));
        animals.add(new Giraffe("Sky", 3));
    }
    private void runZoo() {
        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐\n");

        // Savanna-djur
        System.out.println("\n=== Savanna Animals ===");
        System.out.println("(In the wild, these animals live on the wide African savanna.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                presentAnimal(animal);
            }
        }

        // Aquatic-djur
        System.out.println("\n=== Aquatic Animals ===");
        System.out.println("(In the wild, these animals live in or near the water.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                presentAnimal(animal);
            }
        }

        System.out.println("⭐·· The Zoo is now closed, thanks for visiting! ·· ⭐");
    }

    // Hjälpmetod så jag slipper upprepa samma kod
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
            System.out.println(); // extra rad för luft
    }

}
