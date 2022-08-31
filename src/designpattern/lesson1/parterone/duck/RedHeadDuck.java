package designpattern.lesson1.parterone.duck;

import designpattern.lesson1.parterone.fly.FlyWithWings;
import designpattern.lesson1.parterone.quack.Quack;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class RedHeadDuck extends Duck {
    /**
     * 红头鸭
     */
    public RedHeadDuck() {
        System.out.println("------红头鸭------");
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
}
