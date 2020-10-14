package multiplethread;

import charactor.Hero;

/**
 * @Author: FengJin
 * @Date: 2020/10/13 15:41
 */
public class killThread implements Runnable{
    private Hero a;
    private Hero b;
    public killThread(Hero a,Hero b){
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        while (!b.isDead()){
            a.attackHero(b);
        }
    }
}
