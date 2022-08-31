package designpattern.lesson2.broadcast;

import java.util.ArrayList;
import java.util.List;
/**
 * @author yy
 * @data 2022/8/13 17:45
 */
public class Anchor implements Subject {


    private String message;

    private List<Observer> observers;

    public Anchor() {
        observers = new ArrayList<>();
    }

    public void change() {
        notifyObserver();
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
