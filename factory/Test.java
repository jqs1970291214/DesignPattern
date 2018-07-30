package DesignPattern.factory;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:57
 */
public class Test {
    public static void main(String[] args) {
        Color red = ColorFactory.getColor("red");
        Color green = ColorFactory.getColor("green");
        Color black = ColorFactory.getColor("black");
        red.draw();
        green.draw();
        black.draw();
    }
}
