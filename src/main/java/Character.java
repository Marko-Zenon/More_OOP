import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Getter @Setter
    private int hp;

    @Getter @Setter
    private int power;

    protected KickStrategy kickStrategy;

    public Character(int hp, int power, KickStrategy kickStrategy) {
        this.hp = hp;
        this.power = power;
        this.kickStrategy = kickStrategy;
    }
    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }  
    public boolean isAlive() {
        return hp > 0;
    }
}
