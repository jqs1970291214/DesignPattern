package DesignPattern.interpreter;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:41
 */
public class Test {
    //规则：Robert 和 John 是男性
    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //规则：Julie 是一个已婚的女性
    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = Test.getMaleExpression();
        Expression isMarried = Test.getMarriedWomanExpression();

        System.out.println("Robert is male?" + isMale.interpreter("Robert"));
        System.out.println("Julie is male?" + isMale.interpreter("Julie"));
        System.out.println("Julie is married women?" + isMarried.interpreter("Married Julie"));
        System.out.println("Robert is married women?" + isMarried.interpreter("Unmarride Robert"));

    }


}
