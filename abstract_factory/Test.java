package DesignPattern.abstract_factory;

import DesignPattern.factory.Color;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:30
 */
public class Test {
    public static void main(String[] args) {
        AbstractFactory penFac = FactoryProducer.getFactory("pen_fac");
        Pen bigPen = penFac.getPen("small");
        Pen smallPen = penFac.getPen("big");
        bigPen.write();
        smallPen.write();
        AbstractFactory colFac = FactoryProducer.getFactory("color_fac");
        Color red = colFac.getColor("red");
        red.draw();
    }
}
