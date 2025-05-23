package customerservice.livechat;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Scanner;

public class LiveChatClient {
    public static void main(String[] args) throws Exception {
        // --- Start Service Discovery with JmDNS ---
        String service_type = "_livechat._tcp.local."; // Must match what server registered
        String service_name = "livechat";               // Must match service name
        String host;
        int port;
        // Discover the service
        try (JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            ServiceInfo serviceInfo = jmdns.getServiceInfo(service_type, service_name);
            if (serviceInfo == null) {
                System.out.println("Service not found. Exiting...");
                jmdns.close();
                return;
            }
            host = serviceInfo.getHostAddresses()[0];
            port = serviceInfo.getPort();
            System.out.println("Discovered LiveChat service at " + host + ":" + port);
        }

        // --- Build gRPC channel dynamically ---
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
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