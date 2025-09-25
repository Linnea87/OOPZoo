// Jag låter Giraff ärva Animal och implementera Savanna.
public class Giraffe extends Animal implements Savanna, Trainable {

    // När jag skapar en Giraff måste jag skicka in namn och ålder.
    public Giraffe(String name, int age) {
        super(name, age);
    }

    // Jag bestämmer hur en Giraff låter.
    @Override
    public void makeSound() {
        System.out.println(getName() + " hums softly!");
    }

    // Jag bestämmer vad en Giraff äter.
    @Override
    public void eat() {
        System.out.println(getName()+ " eats leaves from tall trees.");
    }

    // Jag definierar Giraffens beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName()+ " strolls gracefully across the savanna.");
    }

    // Jag låter djuret berätta vilken art det är.
    @Override
    public String getSpecies() {
        return "Giraffe";
    }

    //Jag bestämmer vilket trick Giraffen kan göra.
    @Override
    public void performTrick() {
        System.out.println(getName() + " bows gracefully with a charming smile");
    }

}
