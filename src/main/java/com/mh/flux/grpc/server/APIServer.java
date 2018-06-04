package com.mh.flux.grpc.server;

import java.io.IOException;

import com.mh.flux.grpc.server.interceptor.ServerTopupServiceInterceptor;
import com.mh.flux.grpc.service.TopupService;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerInterceptors;

public class APIServer {
	
	private int port = 50051;
	private Server server = null;
	
	private void start() throws IOException {
		server = ServerBuilder.forPort(port)
				.addService(ServerInterceptors.intercept(new TopupService(), new ServerTopupServiceInterceptor()))
				.build()
				.start();
		
		System.out.println("server start at port::" + 50051);
		
		Runtime.getRuntime().addShutdownHook(new Thread() {

			@Override
			public void run() {
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				APIServer.this.stop();
				System.err.println("*** server shut down now");
			}
			
		});
	}
	
	private void stop() {
		if (server != null) {
			server.shutdown();
		}
	}
	
	private void blockUnutilShutDown() throws InterruptedException {
		if (server != null) {
			server.awaitTermination();
		}
	}
	
	public static void main(String[] args) throws IOException, InterruptedException {
		final APIServer server = new APIServer();
		server.start();
		server.blockUnutilShutDown();
	}

}
