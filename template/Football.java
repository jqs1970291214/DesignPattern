package DesignPattern.template;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:40
 */
public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football Game Initialize:");
    }

    @Override
    void startPlay() {
        System.out.println("Start play football");
    }

    @Override
    void endPlay() {
        System.out.println("end play football");
    }
}
