package DesignPattern.chain_of_responsibility;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/2 16:40
 */
public class StoreCheck implements Check{
    private int store;


    @Override
    public boolean pass(Order order) {
        if (store > order.getQuantity()){
            return true;
        }
        System.out.println("库存不足");
        return false;
    }

    public StoreCheck(int store) {
        this.store = store;
    }
}
