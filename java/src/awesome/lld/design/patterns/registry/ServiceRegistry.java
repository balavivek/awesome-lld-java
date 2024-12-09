package awesome.lld.design.patterns.registry;

import java.util.HashMap;
import java.util.Map;

/**
 * The ServiceRegistry class is used to register and retrieve instances of services.
 */
public class ServiceRegistry {
    private static Map<String, Service> services = new HashMap<>();

    public static void registerService(String serviceName, Service service) {
        services.put(serviceName, service);
    }

    public static Service getService(String serviceName) {
        return services.get(serviceName);
    }
}