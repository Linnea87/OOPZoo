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
    }
    private void runZoo() {
        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐\n");

        for (Animal animal : animals) {
            System.out.println("----- " + "This is " + animal.getName() + " -----");
            System.out.println("Species: " + animal.getSpecies());
            System.out.println(animal.getName() + " is a " + (animal.isBaby() ? "baby" : "adult") + ".");

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

        System.out.println("⭐·· The Zoo is now closed, thanks for visiting! ·· ⭐");
    }

}
