package DesignPattern.bridge;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:43
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void draw(int radis, int x, int y) {
        System.out.println("draw green circle: radis = " + radis + ";x = "
                + x +  ";y = "  + y);
    }
}
