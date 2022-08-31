package designpattern.lesson1.parterone.duck;

import designpattern.lesson1.parterone.fly.FlyBehavior;
import designpattern.lesson1.parterone.quack.QuackBehavior;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public abstract class Duck {


    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;


    private void swim() {
    }//游泳

    private void display() {
    }//区分不同鸭子

    public void performanceQuack() {
        //直接调用嘎嘎叫的行为类
        quackBehavior.quack();
    }

    public void performanceFly() {
        //直接调用飞行的行为类
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
