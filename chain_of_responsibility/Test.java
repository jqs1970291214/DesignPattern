package DesignPattern.chain_of_responsibility;

import java.util.Date;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:50
 */
public class Test {
    public static void main(String[] args) {
        TimeCheck timeCheck = new TimeCheck(2000);
        StoreCheck storeCheck = new StoreCheck(1000);

        CheckChain checkChain = new CheckChain();
        checkChain.addCheck(timeCheck);
        checkChain.addCheck(storeCheck);

        Long now = new Date().getTime();

        Order order1 = new Order(new Date(), 200, 1);
        Order order2 = new Order(new Date(now - 10000), 300, 2);
        Order order3 = new Order(new Date(), 1200, 3);
        Order order4 = new Order(new Date(now - 100000), 120000, 4);
        checkChain.check(order1);
        checkChain.check(order2);
        checkChain.check(order3);
        checkChain.check(order4);
    }
}
