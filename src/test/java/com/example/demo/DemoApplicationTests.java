package com.example.demo;

import java.io.IOException;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.exceptions.ConfigurationException;
import org.apache.thrift.transport.TTransportException;
import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
import org.junit.Assert;
import org.testng.annotations.Test;

public class DemoApplicationTests {

	@Test
	public void contextLoads() throws ConfigurationException, TTransportException, IOException {
		System.setProperty("cassandra.config",
				"file:///" + ClassLoader.getSystemResource("cu-cassandra-rndport.yaml").getPath());
		DatabaseDescriptor.daemonInitialization();

		EmbeddedCassandraServerHelper.startEmbeddedCassandra("cu-cassandra-rndport.yaml");

		Assert.assertTrue(true);
	}
}
