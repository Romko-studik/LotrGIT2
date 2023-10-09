package kick;
import lotr.Character;
public class ElfKick implements KickStrategy {
    @Override
    public void kick(Character whoKicks, lotr.Character opponent){
        if(opponent.getHp()<whoKicks.getHp()){
            opponent.setHp(0);
        }
        else{
            whoKicks.setPower((whoKicks.getPower()-1));
        }
    };

}
