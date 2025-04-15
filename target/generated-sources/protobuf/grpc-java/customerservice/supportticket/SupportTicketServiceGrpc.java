package customerservice.supportticket;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.61.0)",
    comments = "Source: SupportTicketing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SupportTicketServiceGrpc {

  private SupportTicketServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "customerservice.supportticket.SupportTicketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<customerservice.supportticket.TicketRequest,
      customerservice.supportticket.TicketResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTicket",
      requestType = customerservice.supportticket.TicketRequest.class,
      responseType = customerservice.supportticket.TicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<customerservice.supportticket.TicketRequest,
      customerservice.supportticket.TicketResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<customerservice.supportticket.TicketRequest, customerservice.supportticket.TicketResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = SupportTicketServiceGrpc.getCreateTicketMethod) == null) {
      synchronized (SupportTicketServiceGrpc.class) {
        if ((getCreateTicketMethod = SupportTicketServiceGrpc.getCreateTicketMethod) == null) {
          SupportTicketServiceGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<customerservice.supportticket.TicketRequest, customerservice.supportticket.TicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.supportticket.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.supportticket.TicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupportTicketServiceMethodDescriptorSupplier("CreateTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<customerservice.supportticket.TicketStatusRequest,
      customerservice.supportticket.TicketStatusResponse> getGetTicketStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTicketStatus",
      requestType = customerservice.supportticket.TicketStatusRequest.class,
      responseType = customerservice.supportticket.TicketStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<customerservice.supportticket.TicketStatusRequest,
      customerservice.supportticket.TicketStatusResponse> getGetTicketStatusMethod() {
    io.grpc.MethodDescriptor<customerservice.supportticket.TicketStatusRequest, customerservice.supportticket.TicketStatusResponse> getGetTicketStatusMethod;
    if ((getGetTicketStatusMethod = SupportTicketServiceGrpc.getGetTicketStatusMethod) == null) {
      synchronized (SupportTicketServiceGrpc.class) {
        if ((getGetTicketStatusMethod = SupportTicketServiceGrpc.getGetTicketStatusMethod) == null) {
          SupportTicketServiceGrpc.getGetTicketStatusMethod = getGetTicketStatusMethod =
              io.grpc.MethodDescriptor.<customerservice.supportticket.TicketStatusRequest, customerservice.supportticket.TicketStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTicketStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.supportticket.TicketStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  customerservice.supportticket.TicketStatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SupportTicketServiceMethodDescriptorSupplier("GetTicketStatus"))
              .build();
        }
      }
    }
    return getGetTicketStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SupportTicketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceStub>() {
        @java.lang.Override
        public SupportTicketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportTicketServiceStub(channel, callOptions);
        }
      };
    return SupportTicketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SupportTicketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceBlockingStub>() {
        @java.lang.Override
        public SupportTicketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportTicketServiceBlockingStub(channel, callOptions);
        }
      };
    return SupportTicketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SupportTicketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SupportTicketServiceFutureStub>() {
        @java.lang.Override
        public SupportTicketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SupportTicketServiceFutureStub(channel, callOptions);
        }
      };
    return SupportTicketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Unary – Generate a ticket based on customer input
     * </pre>
     */
    default void createTicket(customerservice.supportticket.TicketRequest request,
        io.grpc.stub.StreamObserver<customerservice.supportticket.TicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     * <pre>
     * Unary - Retrieve the status of an existing ticket
     * </pre>
     */
    default void getTicketStatus(customerservice.supportticket.TicketStatusRequest request,
        io.grpc.stub.StreamObserver<customerservice.supportticket.TicketStatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTicketStatusMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SupportTicketService.
   */
  public static abstract class SupportTicketServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SupportTicketServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SupportTicketService.
   */
  public static final class SupportTicketServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SupportTicketServiceStub> {
    private SupportTicketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportTicketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportTicketServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary – Generate a ticket based on customer input
     * </pre>
     */
    public void createTicket(customerservice.supportticket.TicketRequest request,
        io.grpc.stub.StreamObserver<customerservice.supportticket.TicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Unary - Retrieve the status of an existing ticket
     * </pre>
     */
    public void getTicketStatus(customerservice.supportticket.TicketStatusRequest request,
        io.grpc.stub.StreamObserver<customerservice.supportticket.TicketStatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTicketStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SupportTicketService.
   */
  public static final class SupportTicketServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SupportTicketServiceBlockingStub> {
    private SupportTicketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportTicketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportTicketServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary – Generate a ticket based on customer input
     * </pre>
     */
    public customerservice.supportticket.TicketResponse createTicket(customerservice.supportticket.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Unary - Retrieve the status of an existing ticket
     * </pre>
     */
    public customerservice.supportticket.TicketStatusResponse getTicketStatus(customerservice.supportticket.TicketStatusRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTicketStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SupportTicketService.
   */
  public static final class SupportTicketServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SupportTicketServiceFutureStub> {
    private SupportTicketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SupportTicketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SupportTicketServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Unary – Generate a ticket based on customer input
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<customerservice.supportticket.TicketResponse> createTicket(
        customerservice.supportticket.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Unary - Retrieve the status of an existing ticket
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<customerservice.supportticket.TicketStatusResponse> getTicketStatus(
        customerservice.supportticket.TicketStatusRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTicketStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_GET_TICKET_STATUS = 1;

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
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((customerservice.supportticket.TicketRequest) request,
              (io.grpc.stub.StreamObserver<customerservice.supportticket.TicketResponse>) responseObserver);
          break;
        case METHODID_GET_TICKET_STATUS:
          serviceImpl.getTicketStatus((customerservice.supportticket.TicketStatusRequest) request,
              (io.grpc.stub.StreamObserver<customerservice.supportticket.TicketStatusResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreateTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              customerservice.supportticket.TicketRequest,
              customerservice.supportticket.TicketResponse>(
                service, METHODID_CREATE_TICKET)))
        .addMethod(
          getGetTicketStatusMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              customerservice.supportticket.TicketStatusRequest,
              customerservice.supportticket.TicketStatusResponse>(
                service, METHODID_GET_TICKET_STATUS)))
        .build();
  }

  private static abstract class SupportTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SupportTicketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return customerservice.supportticket.SupportTicketingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SupportTicketService");
    }
  }

  private static final class SupportTicketServiceFileDescriptorSupplier
      extends SupportTicketServiceBaseDescriptorSupplier {
    SupportTicketServiceFileDescriptorSupplier() {}
  }

  private static final class SupportTicketServiceMethodDescriptorSupplier
      extends SupportTicketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SupportTicketServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (SupportTicketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SupportTicketServiceFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetTicketStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
