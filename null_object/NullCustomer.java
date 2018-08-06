package DesignPattern.null_object;

/**
 * 空客户类
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:05
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    boolean isNil() {
        return true;
    }

    @Override
    String getName() {
        return "Not Available in Customer Database";
    }


}
