package com.mh.flux.grpc.client;

import java.util.concurrent.TimeUnit;

import com.mh.flux.api.topupRequest;
import com.mh.flux.api.topupResponse;
import com.mh.flux.api.topupServiceGrpc;
import com.mh.flux.api.request.reqHeader;
import com.mh.flux.grpc.client.interceptor.ClientTopupServiceInterceptor;

import io.grpc.Channel;
import io.grpc.ClientInterceptors;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class APIClient {
	
	private final ManagedChannel channel;
	private final topupServiceGrpc.topupServiceBlockingStub blockingStub;
	
	public APIClient(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build();
		
		ClientTopupServiceInterceptor interceptor = new ClientTopupServiceInterceptor();
		Channel newChannel = ClientInterceptors.intercept(channel, interceptor);
		
		blockingStub = topupServiceGrpc.newBlockingStub(newChannel);
	}
	
	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	public void topupDemo() {
		topupRequest.Builder requestBuilder = topupRequest.newBuilder();
		
		reqHeader.Builder headerBuilder = reqHeader.newBuilder();
		headerBuilder.setTimestamp(String.valueOf(System.currentTimeMillis()));
		requestBuilder.setHeader(headerBuilder);
		
		topupResponse response = blockingStub.topup(requestBuilder.build());
		if (response != null) {
			String orderId = response.getPayload().getOrderid();
			System.out.println("order id is::" + orderId);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		APIClient client = new APIClient("localhost", 50051);
		for (int i = 0; i < 5; i++) {
			client.topupDemo();
		}
		client.shutdown();
	}

}
