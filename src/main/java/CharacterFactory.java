
import java.util.Random;

public class CharacterFactory {
    private static final Random rand = new Random();
    private static final Class<?>[] characterTypes = {
            Hobbit.class, Elf.class, King.class, Knight.class
    };

    public static Character createCharacter() {   // <-- зробив static
        try {
            int idx = rand.nextInt(characterTypes.length);
            return (Character) characterTypes[idx].getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Error creating character", e);
        }
    }
}

