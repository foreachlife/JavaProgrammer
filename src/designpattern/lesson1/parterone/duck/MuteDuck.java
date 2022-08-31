package designpattern.lesson1.parterone.duck;

import designpattern.lesson1.parterone.fly.FlyNoWay;
import designpattern.lesson1.parterone.quack.MuteQuack;

/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class MuteDuck extends Duck {

    /**
     * 模型鸭  不会飞 也不会叫
     */
    public MuteDuck() {
        System.out.println("------模型鸭------");
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
