// Jag låter Seal ärva Animal och implementera Aquatic.

public class Seal extends Animal implements Aquatic{

    public Seal(String name, int age) {
        super(name, age);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " Says: Arf arf!");

    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats fish!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims playfully in the water!");
    }
}
