package customerservice.livechat;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.Scanner;

public class LiveChatClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();

        LiveChatServiceGrpc.LiveChatServiceStub asyncStub = LiveChatServiceGrpc.newStub(channel);

        StreamObserver<ChatRequest> requestObserver = asyncStub.chatStream(new StreamObserver<ChatResponse>() {
            @Override
            public void onNext(ChatResponse value) {
                System.out.println("Agent [" + value.getAgentId() + "]: " + value.getResponse());
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                System.out.println("Chat ended by server.");
            }
        });

        // Read input from the user and send to server
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start chatting. Type 'exit' to quit.");
        while (true) {
            String message = scanner.nextLine();
            if ("exit".equalsIgnoreCase(message)) {
                break;
            }

            ChatRequest request = ChatRequest.newBuilder()
                    .setUserId("user123")
                    .setMessage(message)
                    .build();

            requestObserver.onNext(request);
        }

        requestObserver.onCompleted();
        scanner.close();
        channel.shutdown();
    }
}