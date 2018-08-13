package DesignPattern.service_locator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 17:52
 */
public class Service1 implements Service {
    @Override
    public String getName() {
        return "Service1";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service 1!");
    }
}
