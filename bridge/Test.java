package DesignPattern.bridge;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:48
 */
public class Test {
    public static void main(String[] args) {
        DrawAPI redCircle = new RedCircle();
        DrawAPI greenCircle = new GreenCircle();

        Shape shape = new Circle(redCircle, 10, 6, 7);
        shape.draw();
        shape.setDrawAPI(greenCircle);
        shape.draw();
    }
}
