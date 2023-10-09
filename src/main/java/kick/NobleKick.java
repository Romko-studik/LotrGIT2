package kick;
import lotr.Character;
public class NobleKick implements KickStrategy{
    @Override
    public void kick(Character whoKicks,Character opponent){
        opponent.setHp(whoKicks.getHp()-(int)(Math.random()*whoKicks.getPower()));
    };
}
