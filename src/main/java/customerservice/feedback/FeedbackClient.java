package customerservice.feedback;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import java.io.IOException;
import java.net.InetAddress;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class FeedbackClient {
    public static void main(String[] args) throws Exception {
        // --- Start Service Discovery with JmDNS ---
        String service_type = "_feedback._tcp.local."; // Must match what server registered
        String service_name = "feedback";               // Must match service name
        String host;
        int port;
        // Discover the service
        try ( // Create JmDNS instance
                JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost())) {
            // Discover the service
            ServiceInfo serviceInfo = jmdns.getServiceInfo(service_type, service_name);
            if (serviceInfo == null) {
                System.out.println("Service not found. Exiting...");
                jmdns.close();
                return;
            }   // Get host and port from discovered service
            host = serviceInfo.getHostAddresses()[0];
            port = serviceInfo.getPort();
            System.out.println("Discovered Feedback service at " + host + ":" + port);
            // Close JmDNS after discovery
        }

        // --- Build gRPC channel dynamically ---
        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        FeedbackServiceGrpc.FeedbackServiceStub asyncStub = FeedbackServiceGrpc.newStub(channel);

        CountDownLatch latch = new CountDownLatch(1);

        StreamObserver<FeedbackRequest> requestObserver = asyncStub.submitFeedback(new StreamObserver<FeedbackResponse>() {
            @Override
            public void onNext(FeedbackResponse response) {
                System.out.println("Server Response: " + response.getMessage());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
                latch.countDown();
            }

            @Override
            public void onCompleted() {
                System.out.println("Feedback submission completed!");
                latch.countDown();
            }
        });

        // Simulate sending multiple feedbacks
        requestObserver.onNext(FeedbackRequest.newBuilder()
                .setCustomerId("user123")
                .setFeedbackText("Amazing service!")
                .build());

        requestObserver.onNext(FeedbackRequest.newBuilder()
                .setCustomerId("user456")
                .setFeedbackText("Could be better...")
                .build());

        // End the client stream
        requestObserver.onCompleted();

        latch.await(3, TimeUnit.SECONDS);
        channel.shutdown();
    }
}