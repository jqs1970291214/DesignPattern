package DesignPattern.factory;

import DesignPattern.abstract_factory.AbstractFactory;
import DesignPattern.abstract_factory.Pen;

/**
 * 颜色工厂
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 13:54
 */
public class ColorFactory extends AbstractFactory{

    public Pen getPen(String size){
        return null;
    }
    public Color getColor(String type) {
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
