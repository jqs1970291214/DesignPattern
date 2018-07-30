package DesignPattern.abstract_factory;

import DesignPattern.factory.ColorFactory;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:28
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType) {
        if (null == factoryType) {
            return null;
        } else {
            if (factoryType.equalsIgnoreCase("PEN_FAC")) {
                return new PenFactory();
            }
            if (factoryType.equalsIgnoreCase("COLOR_FAC")) {
                return new ColorFactory();
            }
        }
        return null;
    }
}
