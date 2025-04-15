package customerservice.livechat;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: LiveChat.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class LiveChatServiceGrpc {

  private LiveChatServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "customerservice.livechat.LiveChatService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<customerservice.livechat.ChatRequest,
      customerservice.livechat.ChatResponse> getChatStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChatStream",
      requestType = customerservice.livechat.ChatRequest.class,
      responseType = customerservice.livechat.ChatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<customerservice.livechat.ChatRequest,
      customerservice.livechat.ChatResponse> getChatStreamMethod() {
    io.grpc.MethodDescriptor<customerservice.livechat.ChatRequest, customerservice.livechat.ChatResponse> getChatStreamMethod;
    if ((getChatStreamMethod = LiveChatServiceGrpc.getChatStreamMethod) == null) {
      synchronized (LiveChatServiceGrpc.class) {
        if ((getChatStreamMethod = LiveChatServiceGrpc.getChatStreamMethod) == null) {
          LiveChatServiceGrpc.getChatStreamMethod = getChatStreamMethod =
              io.grpc.MethodDescriptor.<customerservice.livechat.ChatRequest, customerservice.livechat.ChatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChatStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.livechat.ChatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.livechat.ChatResponse.getDefaultInstance()))
              .setSchemaDescriptor(new LiveChatServiceMethodDescriptorSupplier("ChatStream"))
              .build();
        }
      }
    }
    return getChatStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LiveChatServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceStub>() {
        @java.lang.Override
        public LiveChatServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveChatServiceStub(channel, callOptions);
        }
      };
    return LiveChatServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LiveChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceBlockingStub>() {
        @java.lang.Override
        public LiveChatServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveChatServiceBlockingStub(channel, callOptions);
        }
      };
    return LiveChatServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LiveChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LiveChatServiceFutureStub>() {
        @java.lang.Override
        public LiveChatServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LiveChatServiceFutureStub(channel, callOptions);
        }
      };
    return LiveChatServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Bi-Di - Facilitate continuous two-way chat.
     * </pre>
     */
    default io.grpc.stub.StreamObserver<customerservice.livechat.ChatRequest> chatStream(
        io.grpc.stub.StreamObserver<customerservice.livechat.ChatResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getChatStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service LiveChatService.
   */
  public static abstract class LiveChatServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return LiveChatServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service LiveChatService.
   */
  public static final class LiveChatServiceStub
      extends io.grpc.stub.AbstractAsyncStub<LiveChatServiceStub> {
    private LiveChatServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveChatServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveChatServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Bi-Di - Facilitate continuous two-way chat.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<customerservice.livechat.ChatRequest> chatStream(
        io.grpc.stub.StreamObserver<customerservice.livechat.ChatResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getChatStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service LiveChatService.
   */
  public static final class LiveChatServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<LiveChatServiceBlockingStub> {
    private LiveChatServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveChatServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveChatServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service LiveChatService.
   */
  public static final class LiveChatServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<LiveChatServiceFutureStub> {
    private LiveChatServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LiveChatServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LiveChatServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CHAT_STREAM = 0;

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
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHAT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chatStream(
              (io.grpc.stub.StreamObserver<customerservice.livechat.ChatResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getChatStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              customerservice.livechat.ChatRequest,
              customerservice.livechat.ChatResponse>(
                service, METHODID_CHAT_STREAM)))
        .build();
  }

  private static abstract class LiveChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LiveChatServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return customerservice.livechat.LiveChatProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LiveChatService");
    }
  }

  private static final class LiveChatServiceFileDescriptorSupplier
      extends LiveChatServiceBaseDescriptorSupplier {
    LiveChatServiceFileDescriptorSupplier() {}
  }

  private static final class LiveChatServiceMethodDescriptorSupplier
      extends LiveChatServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    LiveChatServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (LiveChatServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LiveChatServiceFileDescriptorSupplier())
              .addMethod(getChatStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
