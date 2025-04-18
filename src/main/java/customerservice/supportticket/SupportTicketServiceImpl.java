package customerservice.supportticket;

import customerservice.supportticket.SupportTicketServiceGrpc.SupportTicketServiceImplBase;
import io.grpc.stub.StreamObserver;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SupportTicketServiceImpl extends SupportTicketServiceImplBase {

    private final Map<String, String> ticketDatabase = new HashMap<>();

    @Override
    public void createTicket(TicketRequest request, StreamObserver<TicketResponse> responseObserver) {
        String ticketId = UUID.randomUUID().toString();
        ticketDatabase.put(ticketId, "OPEN"); // default new ticket status

        TicketResponse response = TicketResponse.newBuilder()
                .setTicketId(ticketId)
                .setStatus("Ticket Created Successfully")
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Created ticket for customer: " + request.getCustomerId() + " with issue: " + request.getIssue());
    }

    @Override
    public void getTicketStatus(TicketStatusRequest request, StreamObserver<TicketStatusResponse> responseObserver) {
        String status = ticketDatabase.getOrDefault(request.getTicketId(), "Ticket Not Found");

        TicketStatusResponse response = TicketStatusResponse.newBuilder()
                .setStatus(status)
                .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();

        System.out.println("Ticket status requested for ticketId: " + request.getTicketId());
    }
}