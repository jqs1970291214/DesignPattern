package DesignPattern.null_object;

/**
 * 抽象客户
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:01
 */
public abstract class AbstractCustomer {
    protected String name;
    abstract boolean isNil();
    abstract String getName();
}
