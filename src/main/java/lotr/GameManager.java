package lotr;
public class GameManager {
    public GameManager(){
        
    }
    public void fight(Character c1, Character c2){
        String name1 = c1.getClass().getName();
        String name2 = c2.getClass().getName();
        System.out.println(name1 + " vs "+ name2);
        if(c1.getPower()>c2.getPower())fightCycle(c1, c2);
        else fightCycle(c2, c1);
    }
    private void fightCycle(Character first, Character second){
        int count = 0;
        int gameLen = 15;
        System.out.println(first+ " strikes first, since he got more power");
        first.kick(second);
        healthInfo(first, second);
        while(first.isAlive() && second.isAlive() && count < gameLen){
            second.kick(first);
            System.out.println(second.getClass().getName()+ " hits " + first.getClass().getName());
            healthInfo(first, second);
            if(!first.isAlive())break;
            first.kick(second);
            System.out.println(first.getClass().getName()+ " hits " + second.getClass().getName());
            healthInfo(first, second);
            count++;
        }
        if(!second.isAlive()){
            System.out.println(first.getClass().getName() + " Is a Winner!!!");
        }
        else if(!first.isAlive()) System.out.println(second.getClass().getName() + " Is a Winner!!!");
        else System.out.println("Its a tie!");
    }
    private void healthInfo(Character c1, Character c2){
        System.out.println(c1.getClass().getName() + " Hp: " + c1.getHp() +  "  |  " +c2.getClass().getName() + " Hp: " + c2.getHp());
    }
}
