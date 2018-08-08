package DesignPattern.bussiness_delegate;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/8 19:42
 */
public class Client {
    private BussinessDelegate service;


    public Client(BussinessDelegate service) {
        this.service = service;
    }

    public void doTask() {
        service.doTask();
    }
}
