import java.util.Scanner;

// ZooMenu ansvarar för att visa menyn och låta användaren välja vad de vill se.
// Här styr användaren om de vill titta på savann-djur, vatten-djur, alla djur eller avsluta.
public class ZooMenu {
    private ZooApp zooApp;
    private Scanner scanner;

    // När jag skapar ZooMenu måste jag koppla in ZooApp (så jag kan visa djuren)
    // och starta en Scanner för att läsa användarens input.
    public ZooMenu(ZooApp zooApp) {
        this.zooApp = zooApp;
        this.scanner = new Scanner(System.in);
    }

    // Jag kör själva menyn i en loop tills användaren väljer att avsluta (0).
    public void run() {
        while (true) {
            printMenu(); // Jag skriver ut alternativen
            String choice = scanner.nextLine().trim();  // Jag läser in användarens val

            switch (choice) {
                case "1" -> zooApp.showSavannaAnimals();
                case "2" -> zooApp.showAquaticAnimals();
                case "3" -> zooApp.showAllAnimals();
                case "0" -> {
                    System.out.println("⭐·· Goodbye and thanks for visiting the Zoo! ·· ⭐");
                    return; // Jag lämnar menyn och programmet avslutas
                }
                default -> System.out.println("Invalid option. Please try again");
            }

        }

    }

    // Jag skriver ut menyvalen som användaren kan göra.
    private void printMenu() {
        System.out.println("\n=== Zoo Menu === ");
        System.out.println("Type a number and press ENTER:");
        System.out.println("1) Show Savanna animals");
        System.out.println("2) Show Aquatic animals");
        System.out.println("3) Show ALL animals");
        System.out.println("0) Exit");
        System.out.println("===============");
        System.out.println("Choose an option: ");

    }
}
