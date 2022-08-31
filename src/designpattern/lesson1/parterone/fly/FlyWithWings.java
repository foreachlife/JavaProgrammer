package designpattern.lesson1.parterone.fly;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class FlyWithWings implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("鸭子飞行");
    }
}
