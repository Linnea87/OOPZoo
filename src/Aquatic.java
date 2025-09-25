public interface Aquatic {

    // Jag definierar beteendet för vattenlevande djur.
    void swim();

    // Jag gör en default-metod för att undvika upprepning.
    // Alla vattenlevande djur äter fisk, och vissa kan få extra mat inskriven.
    default void eatFish(String name, String extraFood) {
        if (extraFood == null || extraFood.isEmpty()) {
            System.out.println(name + " eats fish.");
        }
        else {
            System.out.println(name + " eats fish and " + extraFood + ".");
        }

    }

}
