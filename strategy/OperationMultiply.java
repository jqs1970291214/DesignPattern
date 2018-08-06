package DesignPattern.strategy;

/**
 * 乘操作
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:18
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
