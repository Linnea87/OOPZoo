package animals.aquatic;

import animals.Animal;
import interfaces.Aquatic;

// Jag låter Säl ärva animals.Animal och implementera interfaces.Aquatic.
public class Seal extends Animal implements Aquatic {

    // När jag skapar en animals.aquatic.Seal måste jag skicka in namn och ålder.
    public Seal(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Säl låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " grunts softly!");

    }

    // Jag bestämmer vad en Säl äter. Här skickar jag in en tom sträng,
    // vilket betyder att Sälen bara äter fisk.
    @Override
    public void eat() {
       eatFish(getName(), "");
    }

    // Jag definierar hur en Säl simmar.
    @Override
    public void swim() {
        System.out.println(getName() + " swims playfully in the water.");
    }

    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "animals.aquatic.Seal";
    }

    // Jag anger vilken personlighet Sälen har.
    @Override
    public String getPersonality() {
        return "playful and curious, loves splashing around.";
    }
}
