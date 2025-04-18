package customerservice.feedback;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import java.io.IOException;

public class FeedbackServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50051;
        Server server = ServerBuilder.forPort(port)
                .addService(new FeedbackServiceImpl())
                .build()
                .start();

        System.out.println("Feedback Server started, listening on " + port);

        // Register service
        customerservice.discovery.ServiceRegistration.registerService("_feedback._tcp.local.", "FeedbackService", port);

        server.awaitTermination();
    }
}