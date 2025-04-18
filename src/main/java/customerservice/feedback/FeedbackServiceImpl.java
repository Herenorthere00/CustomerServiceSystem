package customerservice.feedback;

import customerservice.feedback.FeedbackServiceGrpc.FeedbackServiceImplBase;
import io.grpc.stub.StreamObserver;

public class FeedbackServiceImpl extends FeedbackServiceImplBase {

    @Override
    public StreamObserver<FeedbackRequest> submitFeedback(StreamObserver<FeedbackResponse> responseObserver) {
        return new StreamObserver<FeedbackRequest>() {
            StringBuilder feedbackLog = new StringBuilder();

            @Override
            public void onNext(FeedbackRequest request) {
                System.out.println("Received feedback from customer: " + request.getCustomerId());
                System.out.println("Feedback: " + request.getFeedbackText());
                feedbackLog.append("[").append(request.getCustomerId()).append("]: ")
                        .append(request.getFeedbackText()).append("\n");
            }

            @Override
            public void onError(Throwable t) {
                System.err.println("Feedback stream error: " + t.getMessage());
            }

            @Override
            public void onCompleted() {
                FeedbackResponse response = FeedbackResponse.newBuilder()
                        .setSuccess(true)
                        .setMessage("Feedback received:\n" + feedbackLog.toString())
                        .build();
                responseObserver.onNext(response);
                responseObserver.onCompleted();
                System.out.println("Feedback streaming completed.");
            }
        };
    }

    @Override
    public void getFeedbackSummary(FeedbackSummaryRequest request, StreamObserver<FeedbackSummary> responseObserver) {
        // Dummy implementation: you would actually fetch and summarize real feedback
        for (int i = 1; i <= 3; i++) {
            FeedbackSummary summary = FeedbackSummary.newBuilder()
                    .setSummary("Summary " + i + " for date range: " + request.getDateRange())
                    .build();
            responseObserver.onNext(summary);
        }
        responseObserver.onCompleted();
    }
}