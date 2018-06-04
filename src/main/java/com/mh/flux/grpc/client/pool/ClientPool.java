package com.mh.flux.grpc.client.pool;

import org.apache.commons.pool2.impl.GenericObjectPool;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;

public class ClientPool {

	private static GenericObjectPool<ClientSingle> objectPool;

	public static void init(int maxPoolSize) {
		ClientFactory factory = new ClientFactory();
		GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
		// 池中的最大连接数
		poolConfig.setMaxTotal(maxPoolSize);
		// 最少的空闲连接数
		poolConfig.setMinIdle(0);
		// 最多的空闲连接数
		poolConfig.setMaxIdle(maxPoolSize);
		// 当连接池资源耗尽时,调用者最大阻塞的时间,超时时抛出异常
		// 单位:毫秒数
		poolConfig.setMaxWaitMillis(-1); //
		// 连接池存放池化对象方式,true放在空闲队列最前面,false放在空闲队列最后
		poolConfig.setLifo(true);
		// 连接空闲的最小时间,达到此值后空闲连接可能会被移除,默认即为30分钟
		poolConfig.setMinEvictableIdleTimeMillis(1000L * 60L * 30L);
		// 连接耗尽时是否阻塞,默认为true
		poolConfig.setBlockWhenExhausted(true);

		objectPool = new GenericObjectPool<ClientSingle>(factory, poolConfig);
	}

	public static Runnable execute(final WorkCallBack<ClientSingle> workCallBack) {
		return new Runnable() {

			@Override
			public void run() {
				ClientSingle client = null;
				try {
					client = objectPool.borrowObject();
					workCallBack.callback(client);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if (client != null) {
						objectPool.returnObject(client);
					}
				}

			}
		};

	}

}
