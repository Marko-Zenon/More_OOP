
public class GameManager {
    public void fight(Character c1, Character c2) {
        System.out.println("Fight starts between " + c1 + " and " + c2);

        int round = 1;
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");
            c1.kick(c2);
            if (!c2.isAlive()) break;
            c2.kick(c1);
            round++;
        }

        if (c1.isAlive()) {
            System.out.println("\nWinner: " + c1);
        } else if (c2.isAlive()) {
            System.out.println("\nWinner: " + c2);
        } else {
            System.out.println("\nBoth characters died. Draw!");
        }
    }
}
