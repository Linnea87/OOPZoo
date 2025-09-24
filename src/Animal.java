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

    // Jag kan hämta namn och ålder. isBaby() kollar om djuret är yngre än 3 år.
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isBaby() {
        return age < 3;
    }

    // Jag tvingar alla subklasser (som Elephant, Seal osv) att själva skriva dessa metoder.
    public abstract void makeSound();
    public abstract void eat();

}
