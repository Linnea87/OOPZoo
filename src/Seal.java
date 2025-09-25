// Jag låter Seal ärva Animal och implementera Aquatic.

public class Seal extends Animal implements Aquatic{

    // När jag skapar en Seal måste jag skicka in namn och ålder.
    public Seal(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Seal låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " grunts softly!");

    }

    // Jag bestämmer vad en Seal äter.
    @Override
    public void eat() {
       eatFish(getName(), "");
    }

    // Jag definierar hur en Seal simmar.
    @Override
    public void swim() {
        System.out.println(getName() + " swims playfully in the water.");
    }
    @Override
    public String getSpecies() {
        return "Seal";
    }
}
