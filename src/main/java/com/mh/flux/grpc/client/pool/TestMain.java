package com.mh.flux.grpc.client.pool;

public class TestMain {

	public static void main(String[] args) {
		ClientPool.init(8);
		while(hasNewOrder()) {
			new Thread(ClientPool.execute(new WorkCallBack<ClientSingle>() {
				
				@Override
				public void callback(ClientSingle s) {
					s.topupDemo();
				}
			})).start();
		}
	}

	private static boolean hasNewOrder() {
		// TODO Auto-generated method stub
		// TODO get order from message queue or database
		return false;
	}

}
