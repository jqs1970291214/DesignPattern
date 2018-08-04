package DesignPattern.mediator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:26
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("ChatRoom " + (int)(Math.random() * 100) );
        System.out.println();
        User tom = new User("Tom");
        User mark = new User("mark");

        mark.sendMsg("Hello,Tom!");
        tom.sendMsg("Hi,Mark!");

    }
}
