package DesignPattern.factory;

/**
 * 黑色
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:53
 */
public class Black implements Color {
    @Override
    public void draw() {
        System.out.println("绘制黑色");
    }
}
