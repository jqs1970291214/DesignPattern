package DesignPattern.flyweight;

import java.util.HashMap;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:00
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = ((Circle) circleMap.get(color));
        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
        }
        return circle;
    }
}
