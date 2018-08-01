package DesignPattern.facade;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/1 15:33
 */
public class Test {
    public static void main(String[] args) {
        ColorPainterFacade facade = new ColorPainterFacade();
        facade.paintBlue();
        facade.paintGreen();
        facade.paintRed();
    }
}
