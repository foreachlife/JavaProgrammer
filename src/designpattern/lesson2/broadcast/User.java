package designpattern.lesson2.broadcast;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class User implements Observer {


    private Anchor anchor;

    User(Anchor anchor) {
        anchor.registerObserver(this);
        this.anchor = anchor;
    }

    @Override
    public void update(String message) {
        System.out.println(anchor + ": " + message);
    }


}
