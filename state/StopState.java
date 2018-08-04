package DesignPattern.state;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:40
 */
public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state!");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "stop state";
    }
}
