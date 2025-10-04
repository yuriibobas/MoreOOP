package ua.edu.ucu.apps;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println(c1 + " vs " + c2);
        System.out.println();
        int round = 0;
        while (c1.isAlive() && c2.isAlive() && round < 50) {
            System.out.println(c1 + " fights");
            int temp = c2.getHp();
            c1.kick(c2);
            if (c2.isAlive() == false) {
                System.out.println(c2 + " died!");
                break;
            }
            else {
                System.out.println(c2 + " lost " + (temp - c2.getHp()) + " hp!");
            }
            System.out.println();

            System.out.println(c2 + " fights");
            temp = c1.getHp();
            c2.kick(c1);
            if (c1.isAlive() == false) {
                System.out.println(c1 + " died!");
                break;
            }
            else {
                System.out.println(c1 + " lost " + (temp - c1.getHp()) + " hp!");
            }
            System.out.println();
            round += 1;
        }

        System.out.println();
        if (c1.isAlive() && c2.isAlive() == false) {
            System.out.println(c1 + " wins!");
        }
        else if (c2.isAlive() && c1.isAlive() == false) {
            System.out.println(c2 + " wins!");
        }
        else {
            System.out.println("Draw!");
        }
    }
}
