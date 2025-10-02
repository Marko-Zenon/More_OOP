public class CryStrategy implements KickStrategy {
    @Override
    public void kick(Character self, Character enemy) {
        System.out.println("😭 Hobbit cries!");
    }
}