package DesignPattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令调用类
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:19
 */
public class Broker {
    private List<Order> orderList = new ArrayList<>();

    public void takeOrder(Order order) {
        this.orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.excute();
        }
        orderList.clear();
    }

}
