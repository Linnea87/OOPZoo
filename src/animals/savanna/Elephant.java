package animals.savanna;// Jag låter Elefant ärva animals.Animal och implementera interfaces.Savanna.

import animals.Animal;
import interfaces.Savanna;

public class Elephant extends Animal implements Savanna {

    // När jag skapar en Elefant måste jag skicka in namn och ålder.
    public Elephant(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Elefant låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " trumpets loudly!");
    }

    // Jag bestämmer vad en Elefant äter.
    @Override
    public void eat() {
        System.out.println(getName() + " eats grass and leaves.");
    }

    // Jag definierar Elefantens beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName() + " roams across the savanna.");
    }


    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "animals.savanna.Elephant";
    }

    // Jag anger vilken personlighet Elefanten har.
    @Override
    public String getPersonality() {
        return "gentle and wise, but a little clumsy.";
    }

}
