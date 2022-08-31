package designpattern.lesson1.partertwo.character;

import designpattern.lesson1.partertwo.weapon.BowAndArrowBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Troll extends Character {
    public Troll() {
        weapon = new BowAndArrowBehavior();
    }
}
