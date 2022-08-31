package designpattern.lesson1.parterone.quack;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("............");
    }
}
