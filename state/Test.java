package DesignPattern.state;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/4 17:41
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());
    }
}
