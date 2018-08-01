package DesignPattern.facade;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/1 15:28
 */
public class RedPainter implements ColorPainter {
    @Override
    public void paint() {
        System.out.println("paint red");
    }
}
