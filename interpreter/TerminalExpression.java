package DesignPattern.interpreter;

/**
 * 终端表达式
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:33
 */
public class TerminalExpression implements Expression{
    private String data;

    @Override
    public boolean interpreter(String context) {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

    public TerminalExpression(String data) {
        this.data = data;
    }
}
