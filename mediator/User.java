package DesignPattern.mediator;

/**
 * User
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:22
 */
public class User {
    private String name;

    public void sendMsg(String msg) {
        ChatRoom.showMessage(this, msg);
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
