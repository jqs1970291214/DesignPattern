package DesignPattern.bridge;

/**
 * 形状抽象类
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/31 21:40
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
    abstract void draw();

    public void setDrawAPI(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }
}
