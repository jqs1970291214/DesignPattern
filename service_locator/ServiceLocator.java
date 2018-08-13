package DesignPattern.service_locator;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 18:01
 */
public class ServiceLocator {
    private static Cache cached = new Cache();

    public static Service getService(String jndiName) {
        Service service = cached.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = ((Service) context.lookUp(jndiName));
        cached.addService(service1);
        return service1;

    }

}
