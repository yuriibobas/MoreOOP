package ua.edu.ucu.apps;

import lombok.AllArgsConstructor;
import lombok.Data;
import ua.edu.ucu.apps.strategy.KickStrategy;

@AllArgsConstructor
@Data
public abstract class Character {
    private int power;
    private int hp;
    private KickStrategy kickStrategy;

    public boolean isAlive() {
        return hp > 0;
    }
    public void kick(Character enemy) {
        kickStrategy.kick(this, enemy);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{hp=" + getHp() + ", power=" + getPower() + "}";
    }

    public void setHp(int hp) {
        if (hp < 0) {
            this.hp = 0;
        }
        else {
            this.hp = hp;
        }
    }
}
