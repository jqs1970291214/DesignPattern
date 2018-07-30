package DesignPattern.builder;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:43
 */
public class Computer {
    private CPU cpu;
    private Keyboard keyboard;
    private Screen screen;

    public void pcInfo(){
        System.out.println("cpu_model: " + cpu.getCpu()
                + " keyboard_model: "+ keyboard.getKeyborad()
                + " screen_model: " + screen.getScreen());
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }
}
