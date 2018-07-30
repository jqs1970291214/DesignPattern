package DesignPattern.decorator;

/**
 * author:Junqson
 * create:2018/7/20 18:04
 * des: 形状修饰抽象类
 */
public abstract class ShapeDecorator implements Shape{
    protected Shape decoratedShape;


    public ShapeDecorator(Shape shape) {
        this.decoratedShape = shape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
