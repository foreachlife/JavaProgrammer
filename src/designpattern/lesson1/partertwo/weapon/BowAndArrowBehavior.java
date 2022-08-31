package designpattern.lesson1.partertwo.weapon;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class BowAndArrowBehavior implements WeaponBehavior {

    @Override
    public void useWeaponBehavior() {
        System.out.println("use BowAndArrow ");
    }
}
