package designpattern.lesson2.broadcast;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public interface Subject {
    /**
     * 注册观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     *  移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     *  通知所有观察者
     */
    public void notifyObserver();
}
