// Main startar hela programmet genom att skapa ZooApp (djur och logik)
// och ZooMenu (menyn för användaren).
public class Main {
    public static void main(String[] args) {
        ZooApp zooApp = new ZooApp(); // jag startar appens kärna
        ZooMenu menu = new ZooMenu(zooApp);  // jag kopplar menyn till appen
        menu.run(); // jag kör menyn
    }
}