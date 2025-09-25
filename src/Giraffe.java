public class Giraffe extends Animal implements Savanna{

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

    // Jag definierar Elefantens beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName()+ " strolls gracefully across the savanna.");
    }

    @Override
    public String getSpecies() {
        return "Giraffe";
    }

}
