package lotr;
import lombok.Getter;
import kick.Cry;

@Getter

public class Hobbit extends Character {
    public Hobbit(){
        super(3,0,new Cry());
    }
}
