package DesignPattern.chain_of_responsibility;

import java.util.Date;

/**
 * 检查时间
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:34
 */
public class TimeCheck implements Check{

    private long timeout;
    @Override
    public boolean pass(Order order) {
        if (new Date().getTime() - order.getTime().getTime() > 2000) {
            System.out.println("订单超时");
            return false;
        }
        return true;
    }

    public TimeCheck(long timeout) {
        this.timeout = timeout;
    }
}
