public interface Aquatic {

    // Jag definierar beteendet för vattenlevande djur.
    void swim();

    default void eatFish(String name, String extraFood) {
        if (extraFood == null || extraFood.isEmpty()) {
            System.out.println(name + " eats fish.");
        }
        else {
            System.out.println(name + " eats fish and " + extraFood);
        }

    }

}
