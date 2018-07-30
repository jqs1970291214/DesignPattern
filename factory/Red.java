package DesignPattern.factory;

/**
 * 红色
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:51
 */
public class Red implements Color{
    @Override
    public void draw() {
        System.out.println("绘制红色");
    }
}
