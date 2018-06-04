package com.mh.flux.api;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: api.proto")
public final class topupServiceGrpc {

  private topupServiceGrpc() {}

  public static final String SERVICE_NAME = "topupService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getTopupMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mh.flux.api.topupRequest,
      com.mh.flux.api.topupResponse> METHOD_TOPUP = getTopupMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mh.flux.api.topupRequest,
      com.mh.flux.api.topupResponse> getTopupMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mh.flux.api.topupRequest,
      com.mh.flux.api.topupResponse> getTopupMethod() {
    return getTopupMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mh.flux.api.topupRequest,
      com.mh.flux.api.topupResponse> getTopupMethodHelper() {
    io.grpc.MethodDescriptor<com.mh.flux.api.topupRequest, com.mh.flux.api.topupResponse> getTopupMethod;
    if ((getTopupMethod = topupServiceGrpc.getTopupMethod) == null) {
      synchronized (topupServiceGrpc.class) {
        if ((getTopupMethod = topupServiceGrpc.getTopupMethod) == null) {
          topupServiceGrpc.getTopupMethod = getTopupMethod = 
              io.grpc.MethodDescriptor.<com.mh.flux.api.topupRequest, com.mh.flux.api.topupResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "topupService", "topup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.topupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.topupResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new topupServiceMethodDescriptorSupplier("topup"))
                  .build();
          }
        }
     }
     return getTopupMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryBalanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mh.flux.api.queryBalanceRequest,
      com.mh.flux.api.queryBalanceResponse> METHOD_QUERY_BALANCE = getQueryBalanceMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mh.flux.api.queryBalanceRequest,
      com.mh.flux.api.queryBalanceResponse> getQueryBalanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mh.flux.api.queryBalanceRequest,
      com.mh.flux.api.queryBalanceResponse> getQueryBalanceMethod() {
    return getQueryBalanceMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mh.flux.api.queryBalanceRequest,
      com.mh.flux.api.queryBalanceResponse> getQueryBalanceMethodHelper() {
    io.grpc.MethodDescriptor<com.mh.flux.api.queryBalanceRequest, com.mh.flux.api.queryBalanceResponse> getQueryBalanceMethod;
    if ((getQueryBalanceMethod = topupServiceGrpc.getQueryBalanceMethod) == null) {
      synchronized (topupServiceGrpc.class) {
        if ((getQueryBalanceMethod = topupServiceGrpc.getQueryBalanceMethod) == null) {
          topupServiceGrpc.getQueryBalanceMethod = getQueryBalanceMethod = 
              io.grpc.MethodDescriptor.<com.mh.flux.api.queryBalanceRequest, com.mh.flux.api.queryBalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "topupService", "queryBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.queryBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.queryBalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new topupServiceMethodDescriptorSupplier("queryBalance"))
                  .build();
          }
        }
     }
     return getQueryBalanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueryResultMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.mh.flux.api.queryResultRequest,
      com.mh.flux.api.queryResultResponse> METHOD_QUERY_RESULT = getQueryResultMethodHelper();

  private static volatile io.grpc.MethodDescriptor<com.mh.flux.api.queryResultRequest,
      com.mh.flux.api.queryResultResponse> getQueryResultMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.mh.flux.api.queryResultRequest,
      com.mh.flux.api.queryResultResponse> getQueryResultMethod() {
    return getQueryResultMethodHelper();
  }

  private static io.grpc.MethodDescriptor<com.mh.flux.api.queryResultRequest,
      com.mh.flux.api.queryResultResponse> getQueryResultMethodHelper() {
    io.grpc.MethodDescriptor<com.mh.flux.api.queryResultRequest, com.mh.flux.api.queryResultResponse> getQueryResultMethod;
    if ((getQueryResultMethod = topupServiceGrpc.getQueryResultMethod) == null) {
      synchronized (topupServiceGrpc.class) {
        if ((getQueryResultMethod = topupServiceGrpc.getQueryResultMethod) == null) {
          topupServiceGrpc.getQueryResultMethod = getQueryResultMethod = 
              io.grpc.MethodDescriptor.<com.mh.flux.api.queryResultRequest, com.mh.flux.api.queryResultResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "topupService", "queryResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.queryResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.mh.flux.api.queryResultResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new topupServiceMethodDescriptorSupplier("queryResult"))
                  .build();
          }
        }
     }
     return getQueryResultMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static topupServiceStub newStub(io.grpc.Channel channel) {
    return new topupServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static topupServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new topupServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static topupServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new topupServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class topupServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void topup(com.mh.flux.api.topupRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.topupResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTopupMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryBalance(com.mh.flux.api.queryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.queryBalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryBalanceMethodHelper(), responseObserver);
    }

    /**
     */
    public void queryResult(com.mh.flux.api.queryResultRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.queryResultResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getQueryResultMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTopupMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mh.flux.api.topupRequest,
                com.mh.flux.api.topupResponse>(
                  this, METHODID_TOPUP)))
          .addMethod(
            getQueryBalanceMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mh.flux.api.queryBalanceRequest,
                com.mh.flux.api.queryBalanceResponse>(
                  this, METHODID_QUERY_BALANCE)))
          .addMethod(
            getQueryResultMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                com.mh.flux.api.queryResultRequest,
                com.mh.flux.api.queryResultResponse>(
                  this, METHODID_QUERY_RESULT)))
          .build();
    }
  }

  /**
   */
  public static final class topupServiceStub extends io.grpc.stub.AbstractStub<topupServiceStub> {
    private topupServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topupServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topupServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topupServiceStub(channel, callOptions);
    }

    /**
     */
    public void topup(com.mh.flux.api.topupRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.topupResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTopupMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryBalance(com.mh.flux.api.queryBalanceRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.queryBalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryBalanceMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queryResult(com.mh.flux.api.queryResultRequest request,
        io.grpc.stub.StreamObserver<com.mh.flux.api.queryResultResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueryResultMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class topupServiceBlockingStub extends io.grpc.stub.AbstractStub<topupServiceBlockingStub> {
    private topupServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topupServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topupServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topupServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.mh.flux.api.topupResponse topup(com.mh.flux.api.topupRequest request) {
      return blockingUnaryCall(
          getChannel(), getTopupMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.mh.flux.api.queryBalanceResponse queryBalance(com.mh.flux.api.queryBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryBalanceMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public com.mh.flux.api.queryResultResponse queryResult(com.mh.flux.api.queryResultRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueryResultMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class topupServiceFutureStub extends io.grpc.stub.AbstractStub<topupServiceFutureStub> {
    private topupServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private topupServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected topupServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new topupServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mh.flux.api.topupResponse> topup(
        com.mh.flux.api.topupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTopupMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mh.flux.api.queryBalanceResponse> queryBalance(
        com.mh.flux.api.queryBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryBalanceMethodHelper(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.mh.flux.api.queryResultResponse> queryResult(
        com.mh.flux.api.queryResultRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueryResultMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TOPUP = 0;
  private static final int METHODID_QUERY_BALANCE = 1;
  private static final int METHODID_QUERY_RESULT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final topupServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(topupServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TOPUP:
          serviceImpl.topup((com.mh.flux.api.topupRequest) request,
              (io.grpc.stub.StreamObserver<com.mh.flux.api.topupResponse>) responseObserver);
          break;
        case METHODID_QUERY_BALANCE:
          serviceImpl.queryBalance((com.mh.flux.api.queryBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.mh.flux.api.queryBalanceResponse>) responseObserver);
          break;
        case METHODID_QUERY_RESULT:
          serviceImpl.queryResult((com.mh.flux.api.queryResultRequest) request,
              (io.grpc.stub.StreamObserver<com.mh.flux.api.queryResultResponse>) responseObserver);
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

  private static abstract class topupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    topupServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.mh.flux.api.FluxAPIProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("topupService");
    }
  }

  private static final class topupServiceFileDescriptorSupplier
      extends topupServiceBaseDescriptorSupplier {
    topupServiceFileDescriptorSupplier() {}
  }

  private static final class topupServiceMethodDescriptorSupplier
      extends topupServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    topupServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (topupServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new topupServiceFileDescriptorSupplier())
              .addMethod(getTopupMethodHelper())
              .addMethod(getQueryBalanceMethodHelper())
              .addMethod(getQueryResultMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
