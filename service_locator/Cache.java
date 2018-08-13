package DesignPattern.service_locator;

import java.util.ArrayList;
import java.util.List;

/**
 * summary
 * descripttions
 *
 * @author Junqson
 * @date 2018/8/13 17:56
 */
public class Cache {
    private List<Service> services;

    public Cache() {
        this.services = new ArrayList<>();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (serviceName.equalsIgnoreCase(service.getName())) {
                System.out.println("Return cached" + serviceName + " obj");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exist = false;
        for (Service service : services) {
            if (newService.getName().equalsIgnoreCase(service.getName())) {
                exist = true;
            }
        }
        if (!exist) {
            services.add(newService);
        }
    }
}
