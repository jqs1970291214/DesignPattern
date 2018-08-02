package DesignPattern.chain_of_responsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:45
 */
public class CheckChain {
    private List<Check> checkList = new ArrayList<>();
    private Order order;

    public void check(Order order){
        this.order = order;
        for (Check check : checkList) {
            if (!check.pass(order)) {
                System.out.println("订单" + order.getId() + "未完成");
                return;
            }
        }
        System.out.println("订单" + order.getId() + "完成");
    }

    public void addCheck(Check check){
        checkList.add(check);
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
