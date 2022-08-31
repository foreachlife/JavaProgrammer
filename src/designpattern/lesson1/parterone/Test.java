package designpattern.lesson1.parterone;

import designpattern.lesson1.parterone.duck.Duck;
import designpattern.lesson1.parterone.duck.MuteDuck;
import designpattern.lesson1.parterone.duck.RedHeadDuck;
import designpattern.lesson1.parterone.fly.RocketFlyBehavior;
import designpattern.lesson1.parterone.quack.Quack;

/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Test {
    /**
     * 设计模式原则
     * 1 将不变的封装在一起,将变化的抽离出来,抽象成公共的部分.
     * 2 针对接口编程,而不是具体的实现.
     */
    public static void main(String[] args) {
        /*
         *   将不变的属性,比如游泳,等封装在Duck类中；将变化的行为,飞行为,叫行为,抽离出来封装成抽象类，然后将行为抽象类作为属性赋值给抽象类Duck。
         *   然后再用实现类去继承Duck类,通过给继承自父类的行为类赋值来实现各自具体不同的行为。
         */
        Duck duck = new RedHeadDuck();
        duck.performanceQuack();
        duck.performanceFly();

        //模型鸭初始不会叫也不会飞,运行过程中改变
        Duck duck1 = new MuteDuck();
        duck1.performanceQuack();
        duck1.performanceFly();
        duck1.setFlyBehavior(new RocketFlyBehavior());
        duck1.setQuackBehavior(new Quack());
        duck1.performanceQuack();
        duck1.performanceFly();

        Howler2 howler2 = new Howler2();
        //设置模仿的鸭子
        howler2.setDuck(new RedHeadDuck());
        howler2.performanceQuack();
    }
}
