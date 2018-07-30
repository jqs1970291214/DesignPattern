package DesignPattern.abstract_factory;

import DesignPattern.factory.Color;

/**
 * 笔工厂
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:15
 */
public class PenFactory extends AbstractFactory{
    public Pen getPen(String size) {
        if (size == null) {
            return null;
        } else {
            if (size.equalsIgnoreCase("BIG")) {
                return new BigPen();
            }
            if (size.equalsIgnoreCase("NORMAL")) {
                return new NormalPen();
            }
            if (size.equalsIgnoreCase("SMALL")) {
                return new SmallPen();
            }
        }
        return null;
    }

    @Override
    public Color getColor(String type) {
        return null;
    }
}
