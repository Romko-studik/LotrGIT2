package lotr;


public class Main {
    public static void main(String[] args) {
        CharacterFactory cf = new CharacterFactory();
        GameManager gm = new GameManager();
        gm.fight(cf.createCharacter() ,cf.createCharacter());       
    }
}
