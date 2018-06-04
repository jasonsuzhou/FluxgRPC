package com.mh.flux.grpc.client.interceptor;

import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.ForwardingClientCallListener.SimpleForwardingClientCallListener;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;

public class ClientTopupServiceInterceptor implements ClientInterceptor {

	@Override
	public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(MethodDescriptor<ReqT, RespT> method,
			CallOptions callOptions, Channel next) {
		return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

		      @Override
		      public void start(Listener<RespT> responseListener, Metadata headers) {
		    	Metadata.Key<String> APP_ID = Metadata.Key.of("appid", Metadata.ASCII_STRING_MARSHALLER);
		    	Metadata.Key<String> APP_SECRET = Metadata.Key.of("appsecret", Metadata.ASCII_STRING_MARSHALLER);
		        headers.put(APP_ID, "appid_value");
		        headers.put(APP_SECRET, "appsecret_value");
		        super.start(new SimpleForwardingClientCallListener<RespT>(responseListener) {
		          @Override
		          public void onHeaders(Metadata headers) {
		            /**
		             * if you don't need receive header from server,
		             * you can use {@link io.grpc.stub.MetadataUtils#attachHeaders}
		             * directly to send header
		             */
		            super.onHeaders(headers);
		          }
		        }, headers);
		      }
		};
	}

}
