package DesignPattern.interpreter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:38
 */
public class AndExpression implements Expression{
    private Expression expression1;
    private Expression expression2;

    @Override
    public boolean interpreter(String context) {
        return expression1.interpreter(context) && expression2.interpreter(context);
    }

    public AndExpression(Expression expression1, Expression expression2) {
        this.expression1 = expression1;
        this.expression2 = expression2;
    }
}
