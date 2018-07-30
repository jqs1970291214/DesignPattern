package DesignPattern.builder;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:54
 */
public class Test {
    public static void main(String[] args) {
        ComputerConfig config = new ComputerConfig();
        config.setCpu_model("intel core i7");
        config.setKeyboard_model("雷蛇");
        config.setScreen_model("夏普");

        Computer computer = ComputerBuilder.build(config);
        computer.pcInfo();

    }
}
