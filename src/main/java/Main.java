

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();
        GameManager gm = new GameManager();

        Character c1 = factory.createCharacter();
        Character c2 = factory.createCharacter();

        gm.fight(c1, c2);
    }
}
