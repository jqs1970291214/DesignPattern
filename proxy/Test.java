package DesignPattern.proxy;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:25
 */
public class Test {
    public static void main(String[] args) {
        StarProxy proxy = new StarProxy("刘德华", 20000);
        proxy.sing(1000);
        proxy.sing(100000);

    }
}
