import java.lang.reflect.InvocationTargetException;

import ua.edu.ucu.apps.CharacterFactory;
import ua.edu.ucu.apps.GameManager;
import ua.edu.ucu.apps.Character;

public class Demo {
    public static void main(String args[]) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        System.out.println("Hello!");

        Character c1 = CharacterFactory.createCharacter();
        Character c2 = CharacterFactory.createCharacter();
        GameManager.fight(c1, c2);
    }
}
