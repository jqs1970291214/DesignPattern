package DesignPattern.state;

/**
 * 开始状态
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:39
 */
public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "start state";
    }
}
