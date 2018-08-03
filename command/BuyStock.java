package DesignPattern.command;

/**
 * Order实现类
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:15
 */
public class BuyStock implements Order{
    private Stock stock;

    public BuyStock(Stock stock) {
        this.stock = stock;
    }

    @Override
    public void excute() {
        stock.buy();
    }
}
