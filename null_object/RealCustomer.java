package DesignPattern.null_object;

/**
 * 真实的客户类
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:03
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    boolean isNil() {
        return false;
    }

    @Override
    String getName() {
        return this.name;
    }
}
