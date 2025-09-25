import java.util.ArrayList;
import java.util.List;

// ZooApp ansvarar för att hålla listan av djur och visa dem i olika miljöer.
// Här finns logiken för att skriva ut alla djur, bara savann-djur eller bara vatten-djur.
public class ZooApp {
    private List<Animal> animals;
    private AnimalPresenter presenter;

    // När jag skapar ZooApp fyller jag listan med djur och förbereder utskriften.
    public ZooApp() {
        animals = new ArrayList<>();
        presenter = new AnimalPresenter();
        initZoo(); // Jag fyller listan med djur.

        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐\n");
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
        // Jag visar alla savann-djur.
        System.out.println("\n=== Savanna Animals ===");
        System.out.println("(In the wild, these animals live on the wide African savanna.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                presenter.present(animal);
            }
        }
    }

    public void showAquaticAnimals() {
        // Jag visar alla vatten-djur.
        System.out.println("\n=== Aquatic Animals ===");
        System.out.println("(In the wild, these animals live in or near the water.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                presenter.present(animal);
            }
        }

    }
    public void showAllAnimals() {
        // Jag visar alla djur i zoo:t.
        System.out.println("\n=== All Animals ===\n");
        for (Animal animal : animals) {
            presenter.present(animal);
        }

    }

}
