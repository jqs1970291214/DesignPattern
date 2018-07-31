package DesignPattern.bridge;

/**
 * 红圆
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:41
 */
public class RedCircle implements DrawAPI {
    @Override
    public void draw(int radis, int x, int y) {
        System.out.println("draw red circle: radis = " + radis + ";x = "
                + x +  ";y = "  + y);
    }
}
