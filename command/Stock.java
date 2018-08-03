package DesignPattern.command;

/**
 * 请求类（股票）
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/3 21:12
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("buy " + quantity + " stock " + name);
    }

    public void sell() {
        System.out.println("sell " + quantity + " stock " + name);
    }

    public Stock(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
