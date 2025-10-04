package ua.edu.ucu.apps.strategy;
import ua.edu.ucu.apps.Character;

public class HobbitKickStrategy extends KickStrategy{

    @Override
    public void kick(Character main, Character enemy) {
        System.out.println("Cry a lot!");
    }

}
