package animals.aquatic;

import animals.Animal;
import interfaces.Aquatic;
import interfaces.Trainable;

// Jag låter Pingvin ärva animals.Animal och implementera interfaces.Aquatic.
public class Penguin extends Animal implements Aquatic, Trainable {
    // När jag skapar en pingvin måste jag skicka in namn och ålder.
    public Penguin(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Pingvin låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " squawks loudly!");

    }

    // Jag bestämmer vad en Pingvin äter. Här anger jag "krill" som extra mat.
    @Override
    public void eat() {
        eatFish(getName(), "krill");

    }

    // Jag definierar hur en Pingvin simmar.
    @Override
    public void swim() {
        System.out.println(getName() + " swims gracefully under water.");
    }

    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "animals.aquatic.Penguin";
    }

    // Jag bestämmer vilket trick Pingvinen kan göra.
    @Override
    public void performTrick() {
        System.out.println(getName() + " slides on the ice and catches a fish.");
    }

    // Jag anger vilken personlighet Pingvinen har.
    @Override
    public String getPersonality() {
        return "cheerful and social, loves sliding on the ice with friends.";
    }
}
