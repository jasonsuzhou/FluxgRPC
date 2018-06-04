package com.mh.flux.grpc.client.pool;

public interface WorkCallBack<S> {
	void callback(S s);
}
