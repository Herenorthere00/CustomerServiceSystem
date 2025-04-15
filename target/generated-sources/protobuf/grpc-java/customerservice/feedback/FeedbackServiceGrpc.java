package customerservice.feedback;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: Feedback.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FeedbackServiceGrpc {

  private FeedbackServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "customerservice.feedback.FeedbackService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<customerservice.feedback.FeedbackRequest,
      customerservice.feedback.FeedbackResponse> getSubmitFeedbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFeedback",
      requestType = customerservice.feedback.FeedbackRequest.class,
      responseType = customerservice.feedback.FeedbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<customerservice.feedback.FeedbackRequest,
      customerservice.feedback.FeedbackResponse> getSubmitFeedbackMethod() {
    io.grpc.MethodDescriptor<customerservice.feedback.FeedbackRequest, customerservice.feedback.FeedbackResponse> getSubmitFeedbackMethod;
    if ((getSubmitFeedbackMethod = FeedbackServiceGrpc.getSubmitFeedbackMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getSubmitFeedbackMethod = FeedbackServiceGrpc.getSubmitFeedbackMethod) == null) {
          FeedbackServiceGrpc.getSubmitFeedbackMethod = getSubmitFeedbackMethod =
              io.grpc.MethodDescriptor.<customerservice.feedback.FeedbackRequest, customerservice.feedback.FeedbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFeedback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.feedback.FeedbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.feedback.FeedbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("SubmitFeedback"))
              .build();
        }
      }
    }
    return getSubmitFeedbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<customerservice.feedback.FeedbackSummaryRequest,
      customerservice.feedback.FeedbackSummary> getGetFeedbackSummaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeedbackSummary",
      requestType = customerservice.feedback.FeedbackSummaryRequest.class,
      responseType = customerservice.feedback.FeedbackSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<customerservice.feedback.FeedbackSummaryRequest,
      customerservice.feedback.FeedbackSummary> getGetFeedbackSummaryMethod() {
    io.grpc.MethodDescriptor<customerservice.feedback.FeedbackSummaryRequest, customerservice.feedback.FeedbackSummary> getGetFeedbackSummaryMethod;
    if ((getGetFeedbackSummaryMethod = FeedbackServiceGrpc.getGetFeedbackSummaryMethod) == null) {
      synchronized (FeedbackServiceGrpc.class) {
        if ((getGetFeedbackSummaryMethod = FeedbackServiceGrpc.getGetFeedbackSummaryMethod) == null) {
          FeedbackServiceGrpc.getGetFeedbackSummaryMethod = getGetFeedbackSummaryMethod =
              io.grpc.MethodDescriptor.<customerservice.feedback.FeedbackSummaryRequest, customerservice.feedback.FeedbackSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeedbackSummary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.feedback.FeedbackSummaryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.feedback.FeedbackSummary.getDefaultInstance()))
              .setSchemaDescriptor(new FeedbackServiceMethodDescriptorSupplier("GetFeedbackSummary"))
              .build();
        }
      }
    }
    return getGetFeedbackSummaryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FeedbackServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceStub>() {
        @java.lang.Override
        public FeedbackServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedbackServiceStub(channel, callOptions);
        }
      };
    return FeedbackServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FeedbackServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceBlockingStub>() {
        @java.lang.Override
        public FeedbackServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedbackServiceBlockingStub(channel, callOptions);
        }
      };
    return FeedbackServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FeedbackServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FeedbackServiceFutureStub>() {
        @java.lang.Override
        public FeedbackServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FeedbackServiceFutureStub(channel, callOptions);
        }
      };
    return FeedbackServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Client Streaming -  Accept multiple feedback entries from clients
     * </pre>
     */
    default io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackRequest> submitFeedback(
        io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getSubmitFeedbackMethod(), responseObserver);
    }

    /**
     * <pre>
     *  Server Streaming - Stream summarized feedback data to clients
     * </pre>
     */
    default void getFeedbackSummary(customerservice.feedback.FeedbackSummaryRequest request,
        io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackSummary> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeedbackSummaryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service FeedbackService.
   */
  public static abstract class FeedbackServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FeedbackServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service FeedbackService.
   */
  public static final class FeedbackServiceStub
      extends io.grpc.stub.AbstractAsyncStub<FeedbackServiceStub> {
    private FeedbackServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedbackServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Streaming -  Accept multiple feedback entries from clients
     * </pre>
     */
    public io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackRequest> submitFeedback(
        io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getSubmitFeedbackMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     *  Server Streaming - Stream summarized feedback data to clients
     * </pre>
     */
    public void getFeedbackSummary(customerservice.feedback.FeedbackSummaryRequest request,
        io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackSummary> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetFeedbackSummaryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service FeedbackService.
   */
  public static final class FeedbackServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FeedbackServiceBlockingStub> {
    private FeedbackServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedbackServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *  Server Streaming - Stream summarized feedback data to clients
     * </pre>
     */
    public java.util.Iterator<customerservice.feedback.FeedbackSummary> getFeedbackSummary(
        customerservice.feedback.FeedbackSummaryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetFeedbackSummaryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service FeedbackService.
   */
  public static final class FeedbackServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<FeedbackServiceFutureStub> {
    private FeedbackServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FeedbackServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FeedbackServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_FEEDBACK_SUMMARY = 0;
  private static final int METHODID_SUBMIT_FEEDBACK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEEDBACK_SUMMARY:
          serviceImpl.getFeedbackSummary((customerservice.feedback.FeedbackSummaryRequest) request,
              (io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackSummary>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_FEEDBACK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.submitFeedback(
              (io.grpc.stub.StreamObserver<customerservice.feedback.FeedbackResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSubmitFeedbackMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              customerservice.feedback.FeedbackRequest,
              customerservice.feedback.FeedbackResponse>(
                service, METHODID_SUBMIT_FEEDBACK)))
        .addMethod(
          getGetFeedbackSummaryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              customerservice.feedback.FeedbackSummaryRequest,
              customerservice.feedback.FeedbackSummary>(
                service, METHODID_GET_FEEDBACK_SUMMARY)))
        .build();
  }

  private static abstract class FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FeedbackServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return customerservice.feedback.FeedbackProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FeedbackService");
    }
  }

  private static final class FeedbackServiceFileDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier {
    FeedbackServiceFileDescriptorSupplier() {}
  }

  private static final class FeedbackServiceMethodDescriptorSupplier
      extends FeedbackServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    FeedbackServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FeedbackServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FeedbackServiceFileDescriptorSupplier())
              .addMethod(getSubmitFeedbackMethod())
              .addMethod(getGetFeedbackSummaryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
