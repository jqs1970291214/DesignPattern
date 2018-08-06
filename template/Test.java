package DesignPattern.template;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:44
 */
public class Test {
    public static void main(String[] args) {
        Game computerGame = new ComputerGame();
        computerGame.play();

        Game football = new Football();
        football.play();

    }
}
