package customerservice.supportticket;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class SupportTicketServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(50052)
                .addService(new SupportTicketServiceImpl())
                .build();

        server.start();
        System.out.println("Support Ticket Server started on port 50052");

        server.awaitTermination();
    }
}