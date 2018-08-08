package DesignPattern.bussiness_delegate;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/8 19:45
 */
public class Test {
    public static void main(String[] args) {
        BussinessDelegate delegate = new BussinessDelegate();
        delegate.setType("ejb");

        Client client = new Client(delegate);
        client.doTask();

        delegate.setType("");
        client.doTask();
    }
}
