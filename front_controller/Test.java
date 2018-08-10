package DesignPattern.front_controller;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/10 16:22
 */
public class Test {
    public static void main(String[] args) {
        FrontController controller = new FrontController();

        controller.dispatchRequest("student");
        controller.dispatchRequest("studen");
        controller.dispatchRequest("home");
    }
}
