package customerservice.supportticket;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.net.InetAddress;

public class SupportTicketClient {
    public static void main(String[] args) throws Exception {
        // --- Start Service Discovery with JmDNS ---
        String service_type = "_supportticket._tcp.local."; // Must match what server registered
        String service_name = "supportticket";              // Must match service name
        String host;
        int port;
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo serviceInfo = jmdns.getServiceInfo(service_type, service_name);
            if (serviceInfo == null) {
                System.out.println("Service not found. Exiting...");
                jmdns.close();
                return;
            }
            host = serviceInfo.getHostAddresses()[0];
            port = serviceInfo.getPort();
            System.out.println("Discovered SupportTicket service at " + host + ":" + port);
        }

        // --- Build gRPC channel dynamically ---
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        SupportTicketServiceGrpc.SupportTicketServiceBlockingStub blockingStub = SupportTicketServiceGrpc.newBlockingStub(channel);

        // Create a ticket
        TicketRequest ticketRequest = TicketRequest.newBuilder()
                .setCustomerId("customer789")
                .setIssue("App crash on login")
                .build();

        TicketResponse ticketResponse = blockingStub.createTicket(ticketRequest);
        System.out.println("Ticket Created: ID=" + ticketResponse.getTicketId() + ", Status=" + ticketResponse.getStatus());

        // Get ticket status
        TicketStatusRequest statusRequest = TicketStatusRequest.newBuilder()
                .setTicketId(ticketResponse.getTicketId())
                .build();

        TicketStatusResponse statusResponse = blockingStub.getTicketStatus(statusRequest);
        System.out.println("Ticket Status: " + statusResponse.getStatus());

        channel.shutdown();
    }
}