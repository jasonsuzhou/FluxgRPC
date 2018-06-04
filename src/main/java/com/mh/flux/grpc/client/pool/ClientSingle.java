package com.mh.flux.grpc.client.pool;

import java.util.concurrent.TimeUnit;

import com.mh.flux.api.topupRequest;
import com.mh.flux.api.topupResponse;
import com.mh.flux.api.topupServiceGrpc;
import com.mh.flux.api.request.reqHeader;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class ClientSingle {
	private final ManagedChannel channel;
	private topupServiceGrpc.topupServiceBlockingStub blockingStub;

	public ClientSingle(String host, int port) {
		channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext()
				.build();
	}

	public void shutdown() throws InterruptedException {
		channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
	}
	
	public void topupDemo() {
		blockingStub = topupServiceGrpc.newBlockingStub(channel).withCompression("gzip");
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

}
