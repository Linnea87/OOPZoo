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
    }
    private void runZoo() {
        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();

            if (animal instanceof Savanna savannaAnimal) {
                savannaAnimal.roamSavanna();
            }
            if (animal instanceof Aquatic aquaticAnimal) {
                aquaticAnimal.swim();
            }

        }
    }

}
