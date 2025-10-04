package ua.edu.ucu.apps;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Random;

public class CharacterFactory {
    public static final Random RANDOM = new Random();
    public static final List<Class<?>> classes = List.of(Hobbit.class, Elf.class, King.class, Knight.class);

    public static Character createCharacter()
        throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
        int choice = RANDOM.nextInt(classes.size());
        Class<?> characterClass = classes.get(choice);
        return (Character) characterClass.getDeclaredConstructor().newInstance();
    }
}
