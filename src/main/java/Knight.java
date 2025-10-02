import java.util.Random;

public class Knight extends Character {
    private static final Random random = new Random();

    public Knight() {
        super(
            random.nextInt(11) + 2,
            random.nextInt(11) + 2,
            new RandomDamageStrategy()
        );
    }
}
