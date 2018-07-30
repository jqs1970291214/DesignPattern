package DesignPattern.decorator;

/**
 * author:Junqson
 * create:2018/7/20 18:09
 * des: 红色形状装饰器实现
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        setRedBorder(this.decoratedShape);
        super.draw();
    }

    public void setRedBorder(Shape shape){
        System.out.print("设置了红色边框的");
    }



}
