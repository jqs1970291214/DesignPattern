package DesignPattern.service_locator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 18:04
 */
public class Test {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("service2");
        service.execute();
    }
}
