import java.util.ArrayList;
import java.util.List;

// Jag gör ZooApp som startar och kör hela programmet.
public class ZooApp {
    private List<Animal> animals;
    private AnimalPresenter presenter;

    // När jag skapar ZooApp bygger jag listan av djur och startar zoo:t direkt.
    public ZooApp() {
        animals = new ArrayList<>();
        presenter = new AnimalPresenter();
        initZoo(); // Jag fyller listan med djur.
        runMenu();
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
    private void runMenu() {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        while (true) {
            System.out.println("\n⭐··Zoo Menu ·· ⭐ ");
            System.out.println("Type a number and press ENTER:");
            System.out.println("1) Show Savanna animals");
            System.out.println("2) Show Aquatic animals");
            System.out.println("3) Show ALL animals");
            System.out.println("0) Exit");
            System.out.println("Choose: ");

            String choice = sc.nextLine().trim();
            switch (choice) {
                case "1" -> printSavanna();
                case "2" -> printAquatic();
                case "3" -> printAll();
                case "0" -> {
                    System.out.println("⭐·· Goodbye and thanks for visiting the Zoo! ·· ⭐");

                    return; // lämnar menyn och programmet avslutas
                }
                default -> System.out.println("Invalid option. Please try again");
            }
        }

    }
    private void printSavanna() {
        // Jag visar alla savann-djur.
        System.out.println("\n=== Savanna Animals ===");
        System.out.println("(In the wild, these animals live on the wide African savanna.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Savanna) {
                presenter.present(animal);
            }
        }
    }
    private void printAquatic() {
        System.out.println("\n=== Aquatic Animals ===");
        System.out.println("(In the wild, these animals live in or near the water.)\n");
        for (Animal animal : animals) {
            if (animal instanceof Aquatic) {
                presenter.present(animal);
            }
        }

    }
    private void printAll() {
        System.out.println("\n⭐·· Welcome to the Zoo! ·· ⭐\n");
        printSavanna();
        printAquatic();

    }

}
