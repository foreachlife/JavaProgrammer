package designpattern.lesson1.partertwo.character;

import designpattern.lesson1.partertwo.weapon.KnifeBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Knight extends Character {
    public Knight(){
        weapon=new KnifeBehavior();
    }
}
