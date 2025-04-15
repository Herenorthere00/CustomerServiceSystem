package customerservice.livechat;

//import customerservice.feedback.FeedbackServiceImpl;
import customerservice.livechat.LiveChatServiceImpl;
//import customerservice.supportticket.SupportTicketServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class LiveChatServer {
    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder.forPort(9090)
                .addService(new LiveChatServiceImpl())
//                .addService(new FeedbackServiceImpl())
//                .addService(new SupportTicketServiceImpl())
                .build();

        System.out.println("Customer Service Server is starting on port 9090...");
        server.start();
        System.out.println("Server started!");

        server.awaitTermination();
    }
}