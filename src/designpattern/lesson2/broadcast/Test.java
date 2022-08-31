package designpattern.lesson2.broadcast;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Test {

    /**
     * 观察者模式
     *
     * @param args
     */
    public static void main(String[] args) {

        Anchor anchor = new Anchor();
        User a = new User(anchor);
        anchor.setMessage("开始直播了,快来看我");
    }

}
