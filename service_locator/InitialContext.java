package DesignPattern.service_locator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 17:54
 */
public class InitialContext {
    public Object lookUp(String jndiName) {
        if (jndiName.equalsIgnoreCase("Service1")) {
            System.out.println("Looking up and creating a service 1");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("Service2")) {
            System.out.println("Looking up and create a service2");
            return new Service2();
        }
        return null;
    }
}
