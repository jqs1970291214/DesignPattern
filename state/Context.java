package DesignPattern.state;

/**
 * 包含状态的类
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:38
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
