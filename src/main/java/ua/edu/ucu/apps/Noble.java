package ua.edu.ucu.apps;

import java.util.Random;

import ua.edu.ucu.apps.strategy.NobleKickStrategy;

public class Noble extends Character {
    public static final Random RANDOM = new Random();

    public Noble(int minPower, int maxPower, int minHp, int maxHp) {
        super(RANDOM.nextInt(maxPower-minPower) + minPower,
        RANDOM.nextInt(maxHp-minHp) + minHp, new NobleKickStrategy());
    }

}
