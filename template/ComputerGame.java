package DesignPattern.template;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:43
 */
public class ComputerGame extends Game {
    @Override
    void initialize() {
        System.out.println("Computer Game initialize:");
    }

    @Override
    void startPlay() {
        System.out.println("start play Computer Game");
    }

    @Override
    void endPlay() {
        System.out.println("end play Computer Game");
    }
}
