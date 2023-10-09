package lotr;

import kick.NobleKick;

public class Noble extends Character{
    public Noble(int min,int max){
        super((int)(Math.random()*(max-min))+min,(int)(Math.random()*(max-min))+min,new NobleKick());
    }
}
