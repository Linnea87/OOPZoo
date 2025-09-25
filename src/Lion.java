// Jag låter Lejon ärva Animal och implementera Savanna.
public class Lion extends Animal implements Savanna, Trainable {
    // När jag skapar ett Lejon måste jag skicka in namn och ålder.
    public Lion(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur ett Lejon låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " roars!");
    }

    // Jag bestämmer vad ett Lejon äter.
    @Override
    public void eat() {
        System.out.println(getName() + " eats meat.");
    }

    // Jag definierar Lejonets beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName() + " patrols the savanna.");
    }

    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "Lion";
    }

    // Jag bestämmer vilket trick Lejonet kan göra.
    @Override
    public void performTrick() {
        System.out.println(getName() + " jumps through a hoop.");
    }

    // Jag anger vilken personlighet Lejonet har.
    @Override
    public String getPersonality() {
        return "brave and proud, always wants to be the center of attention.";
    }

}
