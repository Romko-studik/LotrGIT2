package lotr;
import java.lang.reflect.InvocationTargetException;
import java.util.Random;
public class CharacterFactory {
    public CharacterFactory(){};
    public Character createCharacter(){
            Class<?> []characters = {Hobbit.class,King.class,Knight.class,Elf.class};
            Random rand = new Random();
            Object out = null;
            try {
                out = characters[rand.nextInt(characters.length)].getConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                    | InvocationTargetException | NoSuchMethodException | SecurityException e) {
                e.printStackTrace();
            }
            return (Character)out;
        }
}
