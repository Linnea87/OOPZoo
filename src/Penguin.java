// Jag låter Pingvin ärva Animal och implementera Aquatic.
public class Penguin extends Animal implements Aquatic, Trainable{
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
        return "Penguin";
    }

    // Jag bestämmer vilket trick Pingvinen kan göra.
    @Override
    public void performTrick() {
        System.out.println(getName() + " proudly slides on his belly and snatches a fish.");
    }
}
