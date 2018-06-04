package com.mh.flux.grpc.client.pool;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

public class ClientFactory extends BasePooledObjectFactory<ClientSingle> {

	private String host = "localhost";
	private int port = 50051;

	public ClientFactory() {

	}

	public ClientFactory(String host, int port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public ClientSingle create() throws Exception {
		return new ClientSingle(host, port);
	}

	@Override
	public PooledObject<ClientSingle> wrap(ClientSingle clientSingle) {
		return new DefaultPooledObject<ClientSingle>(clientSingle);
	}

	@Override
	public void destroyObject(PooledObject<ClientSingle> p) throws Exception {
		p.getObject().shutdown();
		super.destroyObject(p);
	}

}
