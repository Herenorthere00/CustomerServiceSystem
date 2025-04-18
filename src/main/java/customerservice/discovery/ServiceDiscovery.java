package customerservice.discovery;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;

public class ServiceDiscovery {

    public static ServiceInfo discoverService(String serviceType) {
        try {
            JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

            System.out.println("Looking for service of type: " + serviceType);
            ServiceInfo serviceInfo = jmdns.list(serviceType)[0];

            return serviceInfo;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}