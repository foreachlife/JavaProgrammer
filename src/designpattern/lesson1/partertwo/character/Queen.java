package designpattern.lesson1.partertwo.character;

import designpattern.lesson1.partertwo.weapon.AxeBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Queen extends Character{

    public Queen(){
        weapon=new AxeBehavior();
    }
}
