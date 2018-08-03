package DesignPattern.command;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:21
 */
public class Test {
    public static void main(String[] args) {
        Stock stock = new Stock("ABC", 1000);

        BuyStock buyStock = new BuyStock(stock);
        SellStock sellStock = new SellStock(stock);

        Broker broker = new Broker();
        broker.takeOrder(buyStock);
        broker.takeOrder(sellStock);

        broker.placeOrders();

    }
}
