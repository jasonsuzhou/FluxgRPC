package com.mh.flux.grpc.service;

import java.util.UUID;

import com.mh.flux.api.queryBalanceRequest;
import com.mh.flux.api.queryBalanceResponse;
import com.mh.flux.api.queryResultRequest;
import com.mh.flux.api.queryResultResponse;
import com.mh.flux.api.topupRequest;
import com.mh.flux.api.topupResponse;
import com.mh.flux.api.topupServiceGrpc;
import com.mh.flux.api.response.respHeader;

import io.grpc.stub.StreamObserver;

public class TopupService extends topupServiceGrpc.topupServiceImplBase {

	@Override
	public void topup(topupRequest request, StreamObserver<topupResponse> responseObserver) {
		
		String timestamp = request.getHeader().getTimestamp();
		System.out.println(timestamp);
		// TODO put the order to message queue
		topupResponse.Builder respBuilder = topupResponse.newBuilder();
		
		respHeader.Builder headerBuilder = respHeader.newBuilder();
		headerBuilder.setErrcode(0);
		headerBuilder.setErrmsg("success");
		respBuilder.setHeader(headerBuilder);
		
		topupResponse.payloadBody.Builder payloadBuilder = topupResponse.payloadBody.newBuilder();
		payloadBuilder.setOrderid(UUID.randomUUID().toString());
		respBuilder.setPayload(payloadBuilder);
		
		topupResponse response = respBuilder.build();
		
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void queryBalance(queryBalanceRequest request, StreamObserver<queryBalanceResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.queryBalance(request, responseObserver);
	}

	@Override
	public void queryResult(queryResultRequest request, StreamObserver<queryResultResponse> responseObserver) {
		// TODO Auto-generated method stub
		super.queryResult(request, responseObserver);
	}

	
	
}
