package designpattern.lesson1.partertwo.weapon;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class AxeBehavior implements WeaponBehavior {

    @Override
    public void useWeaponBehavior() {
        System.out.println("use Axe ");
    }
}
