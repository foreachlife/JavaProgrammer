package designpattern.lesson1.partertwo;

import designpattern.lesson1.partertwo.character.Knight;
import designpattern.lesson1.partertwo.weapon.KnifeBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Test {


    public static void main(String[] args) {

        Knight knight = new Knight();
        knight.setWeapon(new KnifeBehavior());
        knight.fight();

    }
}
