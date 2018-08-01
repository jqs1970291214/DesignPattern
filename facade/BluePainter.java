package DesignPattern.facade;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/1 15:29
 */
public class BluePainter implements ColorPainter {
    @Override
    public void paint() {
        System.out.println("paint blue");
    }
}
