package DesignPattern.observer;

/**
 * author:Junqson
 * create:2018/3/27 9:38
 * des:
 */
public class Test {

    public static void main(String[] args) {
        MsgUser user1 = new MsgUser("Baidu");
        MsgUser user2 = new MsgUser("Tencent");
        MsgUser user3 = new MsgUser("Alibaba");

        MsgServer server = new MsgServer();
        server.addObserver(user1);
        server.addObserver(user2);
        server.addObserver(user3);

        server.setMsg("政策1：XXXXXXXXXX");
    }
}
