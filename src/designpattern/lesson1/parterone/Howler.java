package designpattern.lesson1.parterone;

import designpattern.lesson1.parterone.duck.Duck;
import designpattern.lesson1.parterone.fly.FlyBehavior;
import designpattern.lesson1.parterone.quack.Quack;
import designpattern.lesson1.parterone.quack.QuackBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Howler implements FlyBehavior, QuackBehavior {


    Duck duck;

    Howler() {
        duck.setQuackBehavior(new Quack());
    }

    @Override
    public void fly() {
        System.out.println("不会飞");
    }

    @Override
    public void quack() {
        duck.performanceQuack();
    }
}
