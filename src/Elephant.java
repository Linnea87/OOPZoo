// Jag låter Elephant ärva Animal och implementera Savanna.

public class Elephant extends Animal implements Savanna{

    // När jag skapar en Elephant måste jag skicka in namn och ålder.
    public Elephant(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Elephant låter och vad den äter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets loudly");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats grass and leaves.");
    }

    // Jag definierar elefantens beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName()+ " roams across the savanna");
    }

}
