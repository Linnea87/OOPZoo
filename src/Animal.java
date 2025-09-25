// Jag gör Animal abstract för att den bara är en mall och inte ska kunna skapas direkt.
public abstract class Animal {

    // Jag sparar djurets namn och ålder här.
    private String name;
    private int age;

    // När jag skapar ett djur måste jag skicka in namn och ålder.
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Jag kan hämta djurets namn.
    public String getName() {
        return name;
    }

    // Jag kan hämta djurets ålder.
    public int getAge() {
        return age;
    }

    // Jag kollar om djuret är yngre än 3 år och därmed en baby.
    public boolean isBaby() {
        return age < 3;
    }

    // Jag tvingar alla subklasser (som Elephant, Seal osv) att själva skriva dessa metoder.
    public abstract void makeSound();
    public abstract void eat();

    // Jag tvingar även varje djur att berätta vilken art det är.
    public abstract String getSpecies ();

    // Jag tvingar alla djur att ha en personlighet.
    public abstract String getPersonality ();
}
