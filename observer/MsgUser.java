package DesignPattern.observer;

/**
 * author:Junqson
 * create:2018/3/27 9:35
 * des: 具体观察者 消息订阅者
 */
public class MsgUser implements Observer {
    private String name;
    private String msg;

    public MsgUser(String name) {
        this.name = name;
    }
    @Override
    public void update(String msg) {
        this.msg = msg;
        read();
    }

    public void read(){
        System.out.println(name + "已收到更新信息： " + msg);
    }
}
