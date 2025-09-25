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

    // Jag bestämmer vad en Delfin äter.
    @Override
    public void eat() {
        eatFish(getName(), "squid");

    }

    // Jag definierar hur en Seal simmar.
    @Override
    public void swim() {
        System.out.println(getName() + " swims swiftly through the water.");
    }
    @Override
    public String getSpecies() {
        return "Dolphin";
    }
}
