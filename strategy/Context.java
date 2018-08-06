package DesignPattern.strategy;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:19
 */
public class Context {
    private Strategy strategy;

    public int excuteStrategy(int num1, int num2) {
        return this.strategy.doOperation(num1, num2);
    }

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
