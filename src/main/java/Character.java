import lombok.Getter;
import lombok.Setter;

public abstract class Character {
    @Getter @Setter
    private int hp;

    @Getter @Setter
    private int power;

    protected KickStrategy kickStrategy;

    // Конструктор для підкласів
    public Character(int hp, int power, KickStrategy kickStrategy) {
        this.hp = hp;
        this.power = power;
        this.kickStrategy = kickStrategy;
    }

    // public setHp(int ho){
    //     this.hp = ho;
    // }

    // Абстрактний метод kick – реалізується в підкласах
    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }

    // Метод перевірки, чи персонаж живий       
    public boolean isAlive() {
        return hp > 0;
    }
}
