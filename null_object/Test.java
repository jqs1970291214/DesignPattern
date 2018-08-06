package DesignPattern.null_object;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:10
 */
public class Test {
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Tom");
        AbstractCustomer customer2 = CustomerFactory.getCustomer("sam");
        AbstractCustomer customer3 = CustomerFactory.getCustomer("Lim");

        System.out.println(customer1.getName());
        System.out.println(customer2.getName());
        System.out.println(customer3.getName());


    }
}
