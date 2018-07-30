package DesignPattern.factory;

/**
 * 绿色
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:52
 */
public class Green implements Color {
    @Override
    public void draw() {
        System.out.println("绘制绿色");
    }
}
