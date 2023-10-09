package lotr;
import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;
@AllArgsConstructor 
public abstract class Character {
    @Getter
    private int hp;
    @Getter
    private int power;
    private KickStrategy kickStrategy;

    public void kick(Character c){
        kickStrategy.kick(this, c);
    };
    public boolean isAlive(){
        if(hp>0)return true;
        else return false;
    }
    @Override
    public String toString(){
        return this.getClass().getSimpleName() + "{hp="+hp + ", power ="+power+"}";
    }
    public void setHp(int hp){
        if(hp>0)this.hp = hp;
        else this.hp = 0;
    }
    public void setPower(int pow){
        this.power = pow;
    }
}
