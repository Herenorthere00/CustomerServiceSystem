package customerservice.discovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ServiceRegistration {

    public static void registerService(String serviceType, String serviceName, int port) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            ServiceInfo serviceInfo = ServiceInfo.create(serviceType, serviceName, port, "path=index.html");
            jmdns.registerService(serviceInfo);

            System.out.printf("Registered service %s with type %s on port %d%n", serviceName, serviceType, port);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}