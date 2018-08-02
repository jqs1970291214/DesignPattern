package DesignPattern.chain_of_responsibility;

import java.util.Date;

/**
 * 订单
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:33
 */
public class Order {
    private Date time;
    private int quantity;
    private int id;

    public Order(Date time, int quantity,int id) {
        this.time = time;
        this.id = id;
        this.quantity = quantity;
    }

    public Date getTime() {
        return time;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getId() {
        return id;
    }
}
