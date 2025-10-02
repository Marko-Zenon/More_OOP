public class ElfStrategy implements KickStrategy {
    @Override
    public void kick(Character self, Character enemy) {
        if (self.getPower() > enemy.getPower()) {
            enemy.setHp(0);
            System.out.println("Elf killed " + enemy.getClass().getSimpleName());
        } else {
            enemy.setPower(Math.max(0, enemy.getPower() - 1));
            System.out.println("Elf reduced " + enemy.getClass().getSimpleName() + " power");
        }
    }
}
