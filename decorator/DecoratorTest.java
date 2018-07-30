package DesignPattern.decorator;

/**
 * author:Junqson
 * create:2018/7/20 18:00
 * des: 装饰器模式测试
 */
public class DecoratorTest {
    public static void main(String[] args) {

        Shape rectangle = new Rectangel();
        rectangle.draw();
        Shape circle = new Circle();
        circle.draw();
        Shape redBorderRectangel = new RedShapeDecorator(rectangle);
        redBorderRectangel.draw();
    }
}
