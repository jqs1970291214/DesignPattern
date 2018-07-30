package DesignPattern.decorator;

/**
 * author:Junqson
 * create:2018/7/20 18:03
 * des: 圆形类
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("圆形");
    }
}
