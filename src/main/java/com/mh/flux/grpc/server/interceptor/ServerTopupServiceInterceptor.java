package com.mh.flux.grpc.server.interceptor;

import io.grpc.ForwardingServerCall.SimpleForwardingServerCall;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.ServerCall.Listener;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.Status;

public class ServerTopupServiceInterceptor implements ServerInterceptor {

	@Override
	public <ReqT, RespT> Listener<ReqT> interceptCall(ServerCall<ReqT, RespT> call, Metadata headers,
			ServerCallHandler<ReqT, RespT> next) {
		String appid = headers.get(Metadata.Key.of("appid", Metadata.ASCII_STRING_MARSHALLER));
		String appsecret = headers.get(Metadata.Key.of("appsecret", Metadata.ASCII_STRING_MARSHALLER));
		System.out.println("receive header from client appid::" + appid);
		System.out.println("receive header from client appsecret::" + appsecret);
		if (appid == null || appsecret == null) {
			call.close(Status.DATA_LOSS,headers);
		}
		ServerCall<ReqT, RespT> serverCall = new SimpleForwardingServerCall<ReqT, RespT>(call) {
			@Override
			public void sendHeaders(Metadata responseHeaders) {
				// put response header here
				super.sendHeaders(responseHeaders);
			}
		};
		return next.startCall(serverCall,headers);
	}

}
