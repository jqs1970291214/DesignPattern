package DesignPattern.abstract_factory;

import DesignPattern.factory.Color;

/**
 * 抽象工厂
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:18
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String type);

    public abstract Pen getPen(String size);

}

