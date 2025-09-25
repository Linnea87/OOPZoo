public class Lion extends  Animal implements Savanna{
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
        System.out.println(getName()+ " eats meat.");
    }

    // Jag definierar Elefantens beteende på savannen.
    @Override
    public void roamSavanna() {
        System.out.println(getName()+ " patrols the savanna.");
    }

    @Override
    public String getSpecies()
    {
        return "Lion";
    }
}
