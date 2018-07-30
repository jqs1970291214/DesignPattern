package DesignPattern.abstract_factory;

/**
 * 大号笔
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:13
 */
public class BigPen implements Pen {
    @Override
    public void write() {
        System.out.println("writing using a big pen");
    }
}
