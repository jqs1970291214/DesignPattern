package DesignPattern.observer;

/**
 * author:Junqson
 * create:2018/3/27 9:26
 * des: 被观察者接口
 */
public interface Observerable {
     void addObserver(Observer observer);

     void removeObserver(Observer observer);

     void notifyObserver();

}
