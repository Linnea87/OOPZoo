// Jag låter Delfin ärva Animal och implementera Aquatic.
public class Dolphin extends Animal implements Aquatic{
    // När jag skapar en Delfin måste jag skicka in namn och ålder.
    public Dolphin(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Delfin låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " clicks and whistles!");

    }

    // Jag bestämmer vad en Delfin äter.  Här anger jag "squid" som extra mat.
    @Override
    public void eat() {
        eatFish(getName(), "squid");

    }

    // Jag definierar hur en Delfin simmar.
    @Override
    public void swim() {
        System.out.println(getName() + " swims swiftly through the water.");
    }

    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "Dolphin";
    }
}
