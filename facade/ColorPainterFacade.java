package DesignPattern.facade;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/1 15:30
 */
public class ColorPainterFacade {
    private ColorPainter redPainter;
    private ColorPainter greenPainter;
    private ColorPainter bluePainter;

    public ColorPainterFacade() {
        this.bluePainter = new BluePainter();
        this.greenPainter = new GreenPainter();
        this.redPainter = new RedPainter();
    }

    public void paintRed(){
        redPainter.paint();
    }

    public void paintGreen(){
        greenPainter.paint();
    }

    public void paintBlue() {
        bluePainter.paint();
    }
}
