package DesignPattern.builder;


/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:50
 */
public class ComputerBuilder {
    public static Computer build(ComputerConfig config) {
        Computer computer = new Computer();
        CPU cpu = new CPU();
        cpu.setCpu(config.getCpu_model());
        Keyboard keyboard = new Keyboard();
        keyboard.setKeyborad(config.getKeyboard_model());
        Screen screen = new Screen();
        screen.setScreen(config.getScreen_model());

        computer.setCpu(cpu);
        computer.setKeyboard(keyboard);
        computer.setScreen(screen);

        return computer;
    }
}
