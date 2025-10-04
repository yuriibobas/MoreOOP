package ua.edu.ucu.apps.strategy;

import ua.edu.ucu.apps.Character;

public class ElfKickStrategy extends KickStrategy {


    @Override
    public void kick(Character main, Character enemy) {
            if (main.getHp() > enemy.getHp()) {
                enemy.setHp(0);
            }
            else {
                enemy.setHp(enemy.getHp() - 1);;
            }
    }
}
