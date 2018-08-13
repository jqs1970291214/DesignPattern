package DesignPattern.service_locator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 17:53
 */
public class Service2 implements Service {
    @Override
    public String getName() {
        return "Service2";
    }

    @Override
    public void execute() {
        System.out.println("Executing Service 2!");
    }
}
