package designpattern.lesson1.parterone;

import designpattern.lesson1.parterone.duck.Duck;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Howler2 {

    Duck duck;

    Howler2() {
    }

    public void setDuck(Duck duck) {
        this.duck = duck;
    }

    public void performanceQuack(){
        duck.performanceQuack();
    }
}
