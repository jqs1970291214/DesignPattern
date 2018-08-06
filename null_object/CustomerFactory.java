package DesignPattern.null_object;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/6 10:07
 */
public class CustomerFactory {
    private static String[] customers = {"Tom", "Sam", "Jim", "Rom"};

    public static AbstractCustomer getCustomer(String name) {
        for (String cusName : customers) {
            if (cusName.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
