package DesignPattern.bridge;

/**
 * 继承Shape类
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:45
 */
public class Circle extends Shape {
    private int radis, x, y;

    protected Circle(DrawAPI drawAPI, int radis, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radis = radis;
    }

    public void draw(){
        drawAPI.draw(radis, x, y);
    }
}
