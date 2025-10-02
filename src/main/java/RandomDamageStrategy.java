
import java.util.Random;

public class RandomDamageStrategy implements KickStrategy {
    private static final Random rand = new Random();

    @Override
    public void kick(Character self, Character enemy) {
        int damage = rand.nextInt(self.getPower() + 1);
        enemy.setHp(enemy.getHp() - damage);
        System.out.println(self.getClass().getSimpleName() +
                " deals " + damage + " damage to " +
                enemy.getClass().getSimpleName());
    }
}
