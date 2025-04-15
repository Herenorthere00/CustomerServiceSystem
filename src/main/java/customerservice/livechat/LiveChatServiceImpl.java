package customerservice.livechat;

import io.grpc.stub.StreamObserver;

public class LiveChatServiceImpl extends LiveChatServiceGrpc.LiveChatServiceImplBase {

    @Override
    public StreamObserver<ChatRequest> chatStream(StreamObserver<ChatResponse> responseObserver) {
        return new StreamObserver<ChatRequest>() {
            @Override
            public void onNext(ChatRequest request) {
                System.out.println("Client [" + request.getUserId() + "] says: " + request.getMessage());

                ChatResponse reply = ChatResponse.newBuilder()
                        .setAgentId("LiveChatBot")
                        .setResponse("Echo: " + request.getMessage())
                        .build();

                responseObserver.onNext(reply);
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Chat stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
                System.out.println("Chat ended.");
            }
        };
    }
}