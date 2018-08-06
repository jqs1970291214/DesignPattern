package DesignPattern.strategy;

/**
 * 测试
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:21
 */
public class Test {
    public static void main(String[] args) {
        Strategy add = new OperationAdd();
        Strategy sub = new OperationSubstract();
        Strategy mul = new OperationMultiply();

        Context context = new Context(add);
        System.out.println(context.excuteStrategy(10, 5));
        context.setStrategy(sub);
        System.out.println(context.excuteStrategy(10, 5));
        context.setStrategy(mul);
        System.out.println(context.excuteStrategy(10, 5));
    }
}
