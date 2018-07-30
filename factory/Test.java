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
        ColorFactory colorFactory = new ColorFactory();
        Color red = colorFactory.getColor("red");
        Color green = colorFactory.getColor("green");
        Color black = colorFactory.getColor("black");
        red.draw();
        green.draw();
        black.draw();
    }
}
