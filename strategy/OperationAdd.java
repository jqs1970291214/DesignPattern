package DesignPattern.strategy;

/**
 * 加操作
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:17
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
