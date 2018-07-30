package DesignPattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * author:Junqson
 * create:2018/3/27 9:30
 * des: 具体被观察者 消息发布者
 */
public class MsgServer implements Observerable {
    //将所有观察者对象放在一个集合里
    private List<Observer> observers;
    private String msg;

    public MsgServer() {
        observers = new ArrayList<Observer>();
    }

    public void setMsg(String msg) {
        this.msg = msg;
        System.out.println("消息更新了，通知所有订阅者！");
        notifyObserver();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if(!observers.isEmpty()){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(msg);
        }
    }
}
