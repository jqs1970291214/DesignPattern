package DesignPattern.command;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:17
 */
public class SellStock implements Order {
    private Stock stock;

    public SellStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void excute() {
        stock.sell();
    }
}
