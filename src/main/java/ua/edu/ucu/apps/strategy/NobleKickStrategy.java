package ua.edu.ucu.apps.strategy;
import java.util.Random;
import ua.edu.ucu.apps.Character;

public class NobleKickStrategy extends KickStrategy {
    private static final Random RANDOM = new Random();

    @Override
    public void kick(Character main, Character enemy) {
        int enemyHp = enemy.getHp();
        if (enemy.getPower() > 0) {
            enemy.setHp(enemyHp - RANDOM.nextInt(enemy.getPower()));
        }
    }
}
