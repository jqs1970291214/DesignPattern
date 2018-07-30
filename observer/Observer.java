package DesignPattern.observer;

/**
 * author:Junqson
 * create:2018/3/27 9:27
 * des: 观察者接口，当调用notify方法时自动回调
 */
public interface Observer {
    public void update(String msg);
}
