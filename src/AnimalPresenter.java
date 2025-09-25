// Jag ansvarar för att skriva ut ett djur på ett snyggt och enhetligt sätt.
public class AnimalPresenter {

    // Jag presenterar namn, art, ålder (baby/adult), ljud, mat och rörelse.
    public void present(Animal animal) {

        System.out.println("----- " + "This is " + animal.getName() + " -----");
        System.out.println("Species: " + animal.getSpecies());

        if (animal.isBaby()) {
            System.out.println(animal.getName() + " is a baby.");
        }
        else {
            System.out.println(animal.getName() + " is an adult.");
        }

        animal.makeSound();
        animal.eat();

        if (animal instanceof Savanna savannaAnimal) {
            savannaAnimal.roamSavanna();
        }
        if (animal instanceof Aquatic aquaticAnimal) {
            aquaticAnimal.swim();
        }

        // Om djuret är vuxet och träningsbart visar jag dess trick.
        if (animal instanceof Trainable t && !animal.isBaby() ) {
            t.performTrick();
        }

        System.out.println(); // Jag lägger in en extra rad för luft mellan djuren.
    }
}
