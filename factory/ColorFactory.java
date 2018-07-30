package DesignPattern.factory;

/**
 * 颜色工厂
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:54
 */
public class ColorFactory {

    public static Color getColor(String type) {
        if (null == type) {
            return null;
        }else {
            if (type.equalsIgnoreCase("RED")) {
                return new Red();
            }
            if (type.equalsIgnoreCase("GREEN")) {
                return new Green();
            }
            if (type.equalsIgnoreCase("BLACK")) {
                return new Black();
            }
        }
        return null;
    }
}
