package DesignPattern.builder;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/7/30 15:43
 */
public class ComputerConfig {
    private String cpu_model;
    private String keyboard_model;
    private String screen_model;

    public String getCpu_model() {
        return cpu_model;
    }

    public void setCpu_model(String cpu_model) {
        this.cpu_model = cpu_model;
    }

    public String getKeyboard_model() {
        return keyboard_model;
    }

    public void setKeyboard_model(String keyboard_model) {
        this.keyboard_model = keyboard_model;
    }

    public String getScreen_model() {
        return screen_model;
    }

    public void setScreen_model(String screen_model) {
        this.screen_model = screen_model;
    }
}
